package com.tqz.grpc.demo.server;

import com.tqz.grpc.demo.proto.HelloRequest;
import com.tqz.grpc.demo.proto.HelloResponse;
import com.tqz.grpc.demo.proto.HelloServiceGrpc;
import io.grpc.stub.StreamObserver;

/**
 * <p>HelloService接口的实现类，如果 {@link HelloServiceGrpc.HelloServiceImplBase} 没有实现类，
 * 服务端将会向客户端返回一个错误，表示该类没有被实现.
 *
 * @author tianqingzhao
 * @since 2022/12/6 19:04
 */
public class HelloServiceImpl extends HelloServiceGrpc.HelloServiceImplBase {
    
    @Override
    public void testUnary(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        System.out.println("服务端收到客户端请求信息：" + request.getId() + "," + request.getName());
        
        // onNext 方法表示相应客户端
        responseObserver.onNext(
                HelloResponse.newBuilder().setId(2).setResult("hello grpc client, testUnary()").build());
        
        // onError 方法表示处理失败
        // responseObserver.onError(new RuntimeException("服务端相应客户端数据失败"));
        
        // onCompleted 方法表示处理完成
        responseObserver.onCompleted();
    }
    
    @Override
    public void testServerStream(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        System.out.println("服务端收到客户端请求信息：" + request.getId() + "," + request.getName());
        
        for (int i = 1; i <= 10; i++) {
            // onNext 方法表示相应客户端
            responseObserver.onNext(
                    HelloResponse.newBuilder().setId(2).setResult("hello grpc client, testServerStream()" + i).build());
        }
        
        responseObserver.onCompleted();
    }
    
    @Override
    public StreamObserver<HelloRequest> testClientStream(StreamObserver<HelloResponse> responseObserver) {
        return new StreamObserver<HelloRequest>() {
            @Override
            public void onNext(HelloRequest value) {
                System.out.println("服务端收到客户端请求信息：" + value.getId() + "," + value.getName());
            }
            
            @Override
            public void onError(Throwable t) {
                responseObserver.onError(t);
            }
            
            @Override
            public void onCompleted() {
                responseObserver.onNext(
                        HelloResponse.newBuilder().setId(2).setResult("hello grpc client, testClientStream()").build());
                responseObserver.onCompleted();
            }
        };
    }
    
    @Override
    public StreamObserver<HelloRequest> testBidirectionalStream(StreamObserver<HelloResponse> responseObserver) {
        return new StreamObserver<HelloRequest>() {
            
            @Override
            public void onNext(HelloRequest value) {
                System.out.println("服务端收到客户端请求信息：" + value.getId() + "," + value.getName());
                
                responseObserver.onNext(
                        HelloResponse.newBuilder().setId(2).setResult("hello grpc client, testBidirectionalStream()")
                                .build());
            }
            
            @Override
            public void onError(Throwable t) {
                responseObserver.onError(t);
            }
            
            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}
