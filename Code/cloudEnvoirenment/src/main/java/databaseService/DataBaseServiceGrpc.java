package databaseService;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Interface exported by the server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: dataBaseService.proto")
public final class DataBaseServiceGrpc {

  private DataBaseServiceGrpc() {}

  public static final String SERVICE_NAME = "dataBaseService.DataBaseService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<databaseService.RequestMessage,
      databaseService.ResponseMessage> getDataBaseDoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "dataBase_do",
      requestType = databaseService.RequestMessage.class,
      responseType = databaseService.ResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<databaseService.RequestMessage,
      databaseService.ResponseMessage> getDataBaseDoMethod() {
    io.grpc.MethodDescriptor<databaseService.RequestMessage, databaseService.ResponseMessage> getDataBaseDoMethod;
    if ((getDataBaseDoMethod = DataBaseServiceGrpc.getDataBaseDoMethod) == null) {
      synchronized (DataBaseServiceGrpc.class) {
        if ((getDataBaseDoMethod = DataBaseServiceGrpc.getDataBaseDoMethod) == null) {
          DataBaseServiceGrpc.getDataBaseDoMethod = getDataBaseDoMethod = 
              io.grpc.MethodDescriptor.<databaseService.RequestMessage, databaseService.ResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dataBaseService.DataBaseService", "dataBase_do"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  databaseService.RequestMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  databaseService.ResponseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new DataBaseServiceMethodDescriptorSupplier("dataBase_do"))
                  .build();
          }
        }
     }
     return getDataBaseDoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DataBaseServiceStub newStub(io.grpc.Channel channel) {
    return new DataBaseServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DataBaseServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DataBaseServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DataBaseServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DataBaseServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class DataBaseServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void dataBaseDo(databaseService.RequestMessage request,
        io.grpc.stub.StreamObserver<databaseService.ResponseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getDataBaseDoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDataBaseDoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                databaseService.RequestMessage,
                databaseService.ResponseMessage>(
                  this, METHODID_DATA_BASE_DO)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class DataBaseServiceStub extends io.grpc.stub.AbstractStub<DataBaseServiceStub> {
    private DataBaseServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataBaseServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataBaseServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DataBaseServiceStub(channel, callOptions);
    }

    /**
     */
    public void dataBaseDo(databaseService.RequestMessage request,
        io.grpc.stub.StreamObserver<databaseService.ResponseMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDataBaseDoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class DataBaseServiceBlockingStub extends io.grpc.stub.AbstractStub<DataBaseServiceBlockingStub> {
    private DataBaseServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataBaseServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataBaseServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DataBaseServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public databaseService.ResponseMessage dataBaseDo(databaseService.RequestMessage request) {
      return blockingUnaryCall(
          getChannel(), getDataBaseDoMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class DataBaseServiceFutureStub extends io.grpc.stub.AbstractStub<DataBaseServiceFutureStub> {
    private DataBaseServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataBaseServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataBaseServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DataBaseServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<databaseService.ResponseMessage> dataBaseDo(
        databaseService.RequestMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getDataBaseDoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DATA_BASE_DO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DataBaseServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DataBaseServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DATA_BASE_DO:
          serviceImpl.dataBaseDo((databaseService.RequestMessage) request,
              (io.grpc.stub.StreamObserver<databaseService.ResponseMessage>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class DataBaseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DataBaseServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return databaseService.DataBaseServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DataBaseService");
    }
  }

  private static final class DataBaseServiceFileDescriptorSupplier
      extends DataBaseServiceBaseDescriptorSupplier {
    DataBaseServiceFileDescriptorSupplier() {}
  }

  private static final class DataBaseServiceMethodDescriptorSupplier
      extends DataBaseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DataBaseServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DataBaseServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DataBaseServiceFileDescriptorSupplier())
              .addMethod(getDataBaseDoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
