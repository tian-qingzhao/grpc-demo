// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hello.proto

package com.tqz.grpc.demo.proto;

public final class Hello {
  private Hello() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hello_HelloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hello_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hello_HelloResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hello_HelloResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013hello.proto\022\005hello\"(\n\014HelloRequest\022\n\n\002" +
      "id\030\001 \001(\005\022\014\n\004name\030\002 \001(\t\"+\n\rHelloResponse\022" +
      "\n\n\002id\030\001 \001(\005\022\016\n\006result\030\002 \001(\t2\232\002\n\014HelloSer" +
      "vice\0228\n\ttestUnary\022\023.hello.HelloRequest\032\024" +
      ".hello.HelloResponse\"\000\022A\n\020testServerStre" +
      "am\022\023.hello.HelloRequest\032\024.hello.HelloRes" +
      "ponse\"\0000\001\022A\n\020testClientStream\022\023.hello.He" +
      "lloRequest\032\024.hello.HelloResponse\"\000(\001\022J\n\027" +
      "testBidirectionalStream\022\023.hello.HelloReq" +
      "uest\032\024.hello.HelloResponse\"\000(\0010\001B\033\n\027com." +
      "tqz.grpc.demo.protoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_hello_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_hello_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hello_HelloRequest_descriptor,
        new java.lang.String[] { "Id", "Name", });
    internal_static_hello_HelloResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_hello_HelloResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hello_HelloResponse_descriptor,
        new java.lang.String[] { "Id", "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
