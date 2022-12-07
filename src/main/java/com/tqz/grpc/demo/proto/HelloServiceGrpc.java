package com.tqz.grpc.demo.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * 定义接口
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.0)",
    comments = "Source: hello.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HelloServiceGrpc {

  private HelloServiceGrpc() {}

  public static final String SERVICE_NAME = "hello.HelloService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tqz.grpc.demo.proto.HelloRequest,
      com.tqz.grpc.demo.proto.HelloResponse> getTestUnaryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "testUnary",
      requestType = com.tqz.grpc.demo.proto.HelloRequest.class,
      responseType = com.tqz.grpc.demo.proto.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tqz.grpc.demo.proto.HelloRequest,
      com.tqz.grpc.demo.proto.HelloResponse> getTestUnaryMethod() {
    io.grpc.MethodDescriptor<com.tqz.grpc.demo.proto.HelloRequest, com.tqz.grpc.demo.proto.HelloResponse> getTestUnaryMethod;
    if ((getTestUnaryMethod = HelloServiceGrpc.getTestUnaryMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getTestUnaryMethod = HelloServiceGrpc.getTestUnaryMethod) == null) {
          HelloServiceGrpc.getTestUnaryMethod = getTestUnaryMethod =
              io.grpc.MethodDescriptor.<com.tqz.grpc.demo.proto.HelloRequest, com.tqz.grpc.demo.proto.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "testUnary"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tqz.grpc.demo.proto.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tqz.grpc.demo.proto.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("testUnary"))
              .build();
        }
      }
    }
    return getTestUnaryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tqz.grpc.demo.proto.HelloRequest,
      com.tqz.grpc.demo.proto.HelloResponse> getTestServerStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "testServerStream",
      requestType = com.tqz.grpc.demo.proto.HelloRequest.class,
      responseType = com.tqz.grpc.demo.proto.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tqz.grpc.demo.proto.HelloRequest,
      com.tqz.grpc.demo.proto.HelloResponse> getTestServerStreamMethod() {
    io.grpc.MethodDescriptor<com.tqz.grpc.demo.proto.HelloRequest, com.tqz.grpc.demo.proto.HelloResponse> getTestServerStreamMethod;
    if ((getTestServerStreamMethod = HelloServiceGrpc.getTestServerStreamMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getTestServerStreamMethod = HelloServiceGrpc.getTestServerStreamMethod) == null) {
          HelloServiceGrpc.getTestServerStreamMethod = getTestServerStreamMethod =
              io.grpc.MethodDescriptor.<com.tqz.grpc.demo.proto.HelloRequest, com.tqz.grpc.demo.proto.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "testServerStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tqz.grpc.demo.proto.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tqz.grpc.demo.proto.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("testServerStream"))
              .build();
        }
      }
    }
    return getTestServerStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tqz.grpc.demo.proto.HelloRequest,
      com.tqz.grpc.demo.proto.HelloResponse> getTestClientStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "testClientStream",
      requestType = com.tqz.grpc.demo.proto.HelloRequest.class,
      responseType = com.tqz.grpc.demo.proto.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.tqz.grpc.demo.proto.HelloRequest,
      com.tqz.grpc.demo.proto.HelloResponse> getTestClientStreamMethod() {
    io.grpc.MethodDescriptor<com.tqz.grpc.demo.proto.HelloRequest, com.tqz.grpc.demo.proto.HelloResponse> getTestClientStreamMethod;
    if ((getTestClientStreamMethod = HelloServiceGrpc.getTestClientStreamMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getTestClientStreamMethod = HelloServiceGrpc.getTestClientStreamMethod) == null) {
          HelloServiceGrpc.getTestClientStreamMethod = getTestClientStreamMethod =
              io.grpc.MethodDescriptor.<com.tqz.grpc.demo.proto.HelloRequest, com.tqz.grpc.demo.proto.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "testClientStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tqz.grpc.demo.proto.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tqz.grpc.demo.proto.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("testClientStream"))
              .build();
        }
      }
    }
    return getTestClientStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tqz.grpc.demo.proto.HelloRequest,
      com.tqz.grpc.demo.proto.HelloResponse> getTestBidirectionalStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "testBidirectionalStream",
      requestType = com.tqz.grpc.demo.proto.HelloRequest.class,
      responseType = com.tqz.grpc.demo.proto.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.tqz.grpc.demo.proto.HelloRequest,
      com.tqz.grpc.demo.proto.HelloResponse> getTestBidirectionalStreamMethod() {
    io.grpc.MethodDescriptor<com.tqz.grpc.demo.proto.HelloRequest, com.tqz.grpc.demo.proto.HelloResponse> getTestBidirectionalStreamMethod;
    if ((getTestBidirectionalStreamMethod = HelloServiceGrpc.getTestBidirectionalStreamMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getTestBidirectionalStreamMethod = HelloServiceGrpc.getTestBidirectionalStreamMethod) == null) {
          HelloServiceGrpc.getTestBidirectionalStreamMethod = getTestBidirectionalStreamMethod =
              io.grpc.MethodDescriptor.<com.tqz.grpc.demo.proto.HelloRequest, com.tqz.grpc.demo.proto.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "testBidirectionalStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tqz.grpc.demo.proto.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tqz.grpc.demo.proto.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("testBidirectionalStream"))
              .build();
        }
      }
    }
    return getTestBidirectionalStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HelloServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloServiceStub>() {
        @java.lang.Override
        public HelloServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloServiceStub(channel, callOptions);
        }
      };
    return HelloServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HelloServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloServiceBlockingStub>() {
        @java.lang.Override
        public HelloServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloServiceBlockingStub(channel, callOptions);
        }
      };
    return HelloServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HelloServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloServiceFutureStub>() {
        @java.lang.Override
        public HelloServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloServiceFutureStub(channel, callOptions);
        }
      };
    return HelloServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 定义接口
   * </pre>
   */
  public static abstract class HelloServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 1.一元流，请求参数为 HelloRequest 返回参数为 HelloResponse
     * </pre>
     */
    public void testUnary(com.tqz.grpc.demo.proto.HelloRequest request,
        io.grpc.stub.StreamObserver<com.tqz.grpc.demo.proto.HelloResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTestUnaryMethod(), responseObserver);
    }

    /**
     * <pre>
     * 2.服务端流，服务端不断的向客户端写
     * </pre>
     */
    public void testServerStream(com.tqz.grpc.demo.proto.HelloRequest request,
        io.grpc.stub.StreamObserver<com.tqz.grpc.demo.proto.HelloResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTestServerStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * 3.客户端流，客户端不断的向服务端写
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.tqz.grpc.demo.proto.HelloRequest> testClientStream(
        io.grpc.stub.StreamObserver<com.tqz.grpc.demo.proto.HelloResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getTestClientStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * 4.双向流，客户端不断向服务端写，服务端不断向客户端写
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.tqz.grpc.demo.proto.HelloRequest> testBidirectionalStream(
        io.grpc.stub.StreamObserver<com.tqz.grpc.demo.proto.HelloResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getTestBidirectionalStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTestUnaryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tqz.grpc.demo.proto.HelloRequest,
                com.tqz.grpc.demo.proto.HelloResponse>(
                  this, METHODID_TEST_UNARY)))
          .addMethod(
            getTestServerStreamMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.tqz.grpc.demo.proto.HelloRequest,
                com.tqz.grpc.demo.proto.HelloResponse>(
                  this, METHODID_TEST_SERVER_STREAM)))
          .addMethod(
            getTestClientStreamMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.tqz.grpc.demo.proto.HelloRequest,
                com.tqz.grpc.demo.proto.HelloResponse>(
                  this, METHODID_TEST_CLIENT_STREAM)))
          .addMethod(
            getTestBidirectionalStreamMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.tqz.grpc.demo.proto.HelloRequest,
                com.tqz.grpc.demo.proto.HelloResponse>(
                  this, METHODID_TEST_BIDIRECTIONAL_STREAM)))
          .build();
    }
  }

  /**
   * <pre>
   * 定义接口
   * </pre>
   */
  public static final class HelloServiceStub extends io.grpc.stub.AbstractAsyncStub<HelloServiceStub> {
    private HelloServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 1.一元流，请求参数为 HelloRequest 返回参数为 HelloResponse
     * </pre>
     */
    public void testUnary(com.tqz.grpc.demo.proto.HelloRequest request,
        io.grpc.stub.StreamObserver<com.tqz.grpc.demo.proto.HelloResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTestUnaryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 2.服务端流，服务端不断的向客户端写
     * </pre>
     */
    public void testServerStream(com.tqz.grpc.demo.proto.HelloRequest request,
        io.grpc.stub.StreamObserver<com.tqz.grpc.demo.proto.HelloResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getTestServerStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 3.客户端流，客户端不断的向服务端写
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.tqz.grpc.demo.proto.HelloRequest> testClientStream(
        io.grpc.stub.StreamObserver<com.tqz.grpc.demo.proto.HelloResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getTestClientStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * 4.双向流，客户端不断向服务端写，服务端不断向客户端写
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.tqz.grpc.demo.proto.HelloRequest> testBidirectionalStream(
        io.grpc.stub.StreamObserver<com.tqz.grpc.demo.proto.HelloResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getTestBidirectionalStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * 定义接口
   * </pre>
   */
  public static final class HelloServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<HelloServiceBlockingStub> {
    private HelloServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 1.一元流，请求参数为 HelloRequest 返回参数为 HelloResponse
     * </pre>
     */
    public com.tqz.grpc.demo.proto.HelloResponse testUnary(com.tqz.grpc.demo.proto.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTestUnaryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 2.服务端流，服务端不断的向客户端写
     * </pre>
     */
    public java.util.Iterator<com.tqz.grpc.demo.proto.HelloResponse> testServerStream(
        com.tqz.grpc.demo.proto.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getTestServerStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * 定义接口
   * </pre>
   */
  public static final class HelloServiceFutureStub extends io.grpc.stub.AbstractFutureStub<HelloServiceFutureStub> {
    private HelloServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 1.一元流，请求参数为 HelloRequest 返回参数为 HelloResponse
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tqz.grpc.demo.proto.HelloResponse> testUnary(
        com.tqz.grpc.demo.proto.HelloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTestUnaryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TEST_UNARY = 0;
  private static final int METHODID_TEST_SERVER_STREAM = 1;
  private static final int METHODID_TEST_CLIENT_STREAM = 2;
  private static final int METHODID_TEST_BIDIRECTIONAL_STREAM = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HelloServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HelloServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TEST_UNARY:
          serviceImpl.testUnary((com.tqz.grpc.demo.proto.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.tqz.grpc.demo.proto.HelloResponse>) responseObserver);
          break;
        case METHODID_TEST_SERVER_STREAM:
          serviceImpl.testServerStream((com.tqz.grpc.demo.proto.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.tqz.grpc.demo.proto.HelloResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TEST_CLIENT_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.testClientStream(
              (io.grpc.stub.StreamObserver<com.tqz.grpc.demo.proto.HelloResponse>) responseObserver);
        case METHODID_TEST_BIDIRECTIONAL_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.testBidirectionalStream(
              (io.grpc.stub.StreamObserver<com.tqz.grpc.demo.proto.HelloResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class HelloServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HelloServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tqz.grpc.demo.proto.Hello.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HelloService");
    }
  }

  private static final class HelloServiceFileDescriptorSupplier
      extends HelloServiceBaseDescriptorSupplier {
    HelloServiceFileDescriptorSupplier() {}
  }

  private static final class HelloServiceMethodDescriptorSupplier
      extends HelloServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HelloServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (HelloServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HelloServiceFileDescriptorSupplier())
              .addMethod(getTestUnaryMethod())
              .addMethod(getTestServerStreamMethod())
              .addMethod(getTestClientStreamMethod())
              .addMethod(getTestBidirectionalStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
