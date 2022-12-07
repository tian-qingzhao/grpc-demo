package com.tqz.grpc.demo.client;

import com.google.common.util.concurrent.ListenableFuture;
import com.tqz.grpc.demo.proto.HelloRequest;
import com.tqz.grpc.demo.proto.HelloResponse;
import com.tqz.grpc.demo.proto.HelloServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * <p>grpc 客户端
 *
 * @author tianqingzhao
 * @since 2022/12/6 19:16
 */
public class GrpcClient {
    
    /**
     * 阻塞存根，只支持一元流、服务端流，不支持客户端流、双向流
     */
    private final HelloServiceGrpc.HelloServiceBlockingStub blockingStub;
    
    /**
     * 未来存根，只支持一元流
     */
    private final HelloServiceGrpc.HelloServiceFutureStub futureStub;
    
    /**
     * 异步存根，支持一元流、服务端流、客户端流、双向流四种模式
     */
    private final HelloServiceGrpc.HelloServiceStub asyncStub;
    
    public static void main(String[] args) {
        GrpcClient grpcClient = null;
        
        try {
            grpcClient = new GrpcClient("127.0.0.1", 9011);
            
            // grpcClient.testUnary();
            
            // grpcClient.testServerStream();
            
            // grpcClient.testClientStream();
            
            grpcClient.testBidirectionalStream();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (grpcClient != null) {
                grpcClient.shutdown();
            }
        }
    }
    
    public GrpcClient(String host, int port) {
        // 绑定服务端的ip和端口号，并使用明文传输
        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
        
        blockingStub = HelloServiceGrpc.newBlockingStub(channel);
        
        futureStub = HelloServiceGrpc.newFutureStub(channel);
        
        asyncStub = HelloServiceGrpc.newStub(channel);
    }
    
    /**
     * 测试一元流(简单流)，支持 blockingStub、futureStub、asyncStub 三种存根
     *
     * @throws ExecutionException   在计算的时候可能抛出该异常
     * @throws InterruptedException 线程在等待中被中断抛出该异常
     */
    private void testUnary() throws ExecutionException, InterruptedException {
        HelloRequest request = HelloRequest.newBuilder().setId(1).setName("tianqingzhao").build();
        
        // 1.使用阻塞存根 blockingStub
        HelloResponse blockingResponse = blockingStub.testUnary(request);
        System.out.println("使用 blockingStub 收到服务端的响应：" + blockingResponse.getResult());
        
        // 2.使用未来存根 futureStub
        ListenableFuture<HelloResponse> future = futureStub.testUnary(request);
        HelloResponse futureResponse = future.get();
        
        System.out.println("使用 futureStub 收到服务端的响应：" + futureResponse.getResult());
        
        // 3.使用异步存根 asyncStub
        asyncStub.testUnary(request, new StreamObserver<HelloResponse>() {
            @Override
            public void onNext(HelloResponse value) {
                System.out.println("使用 stub 收到服务端的响应：" + value.getResult());
            }
            
            @Override
            public void onError(Throwable t) {
                System.err.println("有错误");
                t.printStackTrace();
            }
            
            @Override
            public void onCompleted() {
                System.out.println("客户端处理完成");
            }
        });
    }
    
    /**
     * 测试服务端流，只支持 blockingStub、asyncStub，不支持 futureStub
     */
    private void testServerStream() {
        HelloRequest request = HelloRequest.newBuilder().setId(1).setName("tianqingzhao").build();
        
        Iterator<HelloResponse> iterator = blockingStub.testServerStream(request);
        
        while (iterator.hasNext()) {
            HelloResponse response = iterator.next();
            System.out.println("客户端收到服务端的响应：" + response.getResult());
        }
    }
    
    /**
     * 测试客户端流，只支持 asyncStub，不支持 blockingStub、futureStub
     */
    private void testClientStream() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        
        StreamObserver<HelloResponse> streamObserver = new StreamObserver<HelloResponse>() {
            
            @Override
            public void onNext(HelloResponse value) {
                System.out.println("客户端收到服务端的响应：" + value.getResult());
            }
            
            @Override
            public void onError(Throwable t) {
                countDownLatch.countDown();
            }
            
            @Override
            public void onCompleted() {
                countDownLatch.countDown();
            }
        };
        
        StreamObserver<HelloRequest> requestStreamObserver = asyncStub.testClientStream(streamObserver);
        
        for (int i = 1; i <= 10; i++) {
            HelloRequest request = HelloRequest.newBuilder().setId(1).setName("tianqingzhao").build();
            // 客户端每向服务端写一次发出 onNext 操作
            requestStreamObserver.onNext(request);
        }
        
        // 客户端处理完成发出 onCompleted 操作
        requestStreamObserver.onCompleted();
        
        try {
            // grpc基于多线程异步的，主线程需要等待子线程处理完再往下走
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * 测试双向流，只支持 asyncStub，不支持 blockingStub、futureStub
     */
    private void testBidirectionalStream() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        
        StreamObserver<HelloResponse> streamObserver = new StreamObserver<HelloResponse>() {
            
            @Override
            public void onNext(HelloResponse value) {
                System.out.println("客户端收到服务端的响应：" + value.getResult());
            }
            
            @Override
            public void onError(Throwable t) {
                countDownLatch.countDown();
            }
            
            @Override
            public void onCompleted() {
                countDownLatch.countDown();
            }
        };
        
        StreamObserver<HelloRequest> requestStreamObserver = asyncStub.testBidirectionalStream(streamObserver);
        
        for (int i = 1; i <= 10; i++) {
            HelloRequest request = HelloRequest.newBuilder().setId(1).setName("tianqingzhao").build();
            // 客户端每向服务端写一次发出 onNext 操作
            requestStreamObserver.onNext(request);
        }
        
        // 客户端处理完成发出 onCompleted 操作
        requestStreamObserver.onCompleted();
        
        try {
            // 使用的 asyncStub 基于多线程异步的，主线程需要等待子线程处理完再往下走
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * 客户端关闭
     */
    private void shutdown() {
        try {
            if (null != blockingStub) {
                ManagedChannel channel = (ManagedChannel) blockingStub.getChannel();
                channel.shutdown().awaitTermination(3, TimeUnit.SECONDS);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
