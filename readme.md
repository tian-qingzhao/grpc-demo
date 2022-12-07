### 1.添加 grpc依赖

坐标为 `grpc-all`

### 2.添加插件

protoc：通过.proto文件生成对应的java对应的类。 protoc-gen-grpc-java：通过.proto文件生成grpc的工具类

### 3.使用proto文件构建出java代码

根据proto目录下的 `hello.proto` 文件定义的请求体、响应体、服务接口构建出java代码，需要在maven里面进行compile，或者使用插件protobuf进行compile， 然后会根据 `hello.proto`
文件里面定义的java包名在对应的包名下面生成六个文件， 分别是 `Hello`,`HelloRequest`, `HelloRequestOrBuilder`,`HelloResponse`
,`HelloResponseOrBuilder`, `HelloServiceGrpc`。**本项目在 `com.tqz.grpc.demo.proto` 包下自带这几个文件，可忽略该步骤**，也可删除该包下的文件，重新生成。

### 4.启动服务测试

首先启动 `GrpcServer`，然后启动 `GrpcClient`。