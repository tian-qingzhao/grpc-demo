package com.tqz.grpc.demo.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * <p>grpc 服务端
 *
 * @author tianqingzhao
 * @since 2022/12/6 19:04
 */
public class GrpcServer {
    
    Server server = null;
    
    public static void main(String[] args) {
        GrpcServer grpcServer = new GrpcServer();
        
        grpcServer.start(9011);
        System.out.println("grpc server started.");
        
        grpcServer.blockUntilShutdown();
        System.out.println("grpc server shutdown.");
    }
    
    /**
     * 启动服务
     *
     * @param port 服务端端口号
     */
    private void start(int port) {
        server = ServerBuilder.forPort(port).addService(new HelloServiceImpl()).build();
        
        try {
            server.start();
            
            Runtime.getRuntime().addShutdownHook(new Thread() {
                
                @Override
                public void run() {
                    shutdown();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * 阻塞程序，不让退出
     */
    private void blockUntilShutdown() {
        try {
            if (null != server) {
                server.awaitTermination();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * 停止服务
     */
    private void shutdown() {
        try {
            if (null != server) {
                // 等待5秒钟，不关闭也会强制退出
                server.shutdown().awaitTermination(5, TimeUnit.SECONDS);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
