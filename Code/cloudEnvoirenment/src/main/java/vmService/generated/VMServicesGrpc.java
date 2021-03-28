package vmService.generated;

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
    comments = "Source: vmService.proto")
public final class VMServicesGrpc {

  private VMServicesGrpc() {}

  public static final String SERVICE_NAME = "vmServices.VMServices";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<vmService.generated.RequestMessage,
      vmService.generated.ResponseMessage> getVmServicesDoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "vmServices_do",
      requestType = vmService.generated.RequestMessage.class,
      responseType = vmService.generated.ResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<vmService.generated.RequestMessage,
      vmService.generated.ResponseMessage> getVmServicesDoMethod() {
    io.grpc.MethodDescriptor<vmService.generated.RequestMessage, vmService.generated.ResponseMessage> getVmServicesDoMethod;
    if ((getVmServicesDoMethod = VMServicesGrpc.getVmServicesDoMethod) == null) {
      synchronized (VMServicesGrpc.class) {
        if ((getVmServicesDoMethod = VMServicesGrpc.getVmServicesDoMethod) == null) {
          VMServicesGrpc.getVmServicesDoMethod = getVmServicesDoMethod = 
              io.grpc.MethodDescriptor.<vmService.generated.RequestMessage, vmService.generated.ResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "vmServices.VMServices", "vmServices_do"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vmService.generated.RequestMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vmService.generated.ResponseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new VMServicesMethodDescriptorSupplier("vmServices_do"))
                  .build();
          }
        }
     }
     return getVmServicesDoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<vmService.generated.RequestStatus,
      vmService.generated.ResponseStatus> getVmServicesBroadcastStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "vmServices_broadcast_status",
      requestType = vmService.generated.RequestStatus.class,
      responseType = vmService.generated.ResponseStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<vmService.generated.RequestStatus,
      vmService.generated.ResponseStatus> getVmServicesBroadcastStatusMethod() {
    io.grpc.MethodDescriptor<vmService.generated.RequestStatus, vmService.generated.ResponseStatus> getVmServicesBroadcastStatusMethod;
    if ((getVmServicesBroadcastStatusMethod = VMServicesGrpc.getVmServicesBroadcastStatusMethod) == null) {
      synchronized (VMServicesGrpc.class) {
        if ((getVmServicesBroadcastStatusMethod = VMServicesGrpc.getVmServicesBroadcastStatusMethod) == null) {
          VMServicesGrpc.getVmServicesBroadcastStatusMethod = getVmServicesBroadcastStatusMethod = 
              io.grpc.MethodDescriptor.<vmService.generated.RequestStatus, vmService.generated.ResponseStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "vmServices.VMServices", "vmServices_broadcast_status"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vmService.generated.RequestStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vmService.generated.ResponseStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new VMServicesMethodDescriptorSupplier("vmServices_broadcast_status"))
                  .build();
          }
        }
     }
     return getVmServicesBroadcastStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<vmService.generated.RequestDeployCode,
      vmService.generated.ResponseDeployCode> getVmServicesDeployCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "vmServices_deploy_code",
      requestType = vmService.generated.RequestDeployCode.class,
      responseType = vmService.generated.ResponseDeployCode.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<vmService.generated.RequestDeployCode,
      vmService.generated.ResponseDeployCode> getVmServicesDeployCodeMethod() {
    io.grpc.MethodDescriptor<vmService.generated.RequestDeployCode, vmService.generated.ResponseDeployCode> getVmServicesDeployCodeMethod;
    if ((getVmServicesDeployCodeMethod = VMServicesGrpc.getVmServicesDeployCodeMethod) == null) {
      synchronized (VMServicesGrpc.class) {
        if ((getVmServicesDeployCodeMethod = VMServicesGrpc.getVmServicesDeployCodeMethod) == null) {
          VMServicesGrpc.getVmServicesDeployCodeMethod = getVmServicesDeployCodeMethod = 
              io.grpc.MethodDescriptor.<vmService.generated.RequestDeployCode, vmService.generated.ResponseDeployCode>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "vmServices.VMServices", "vmServices_deploy_code"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vmService.generated.RequestDeployCode.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vmService.generated.ResponseDeployCode.getDefaultInstance()))
                  .setSchemaDescriptor(new VMServicesMethodDescriptorSupplier("vmServices_deploy_code"))
                  .build();
          }
        }
     }
     return getVmServicesDeployCodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<vmService.generated.RequestDeployDatabase,
      vmService.generated.ResponseDeployDatabase> getVmServicesDeployDatabaseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "vmServices_deploy_database",
      requestType = vmService.generated.RequestDeployDatabase.class,
      responseType = vmService.generated.ResponseDeployDatabase.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<vmService.generated.RequestDeployDatabase,
      vmService.generated.ResponseDeployDatabase> getVmServicesDeployDatabaseMethod() {
    io.grpc.MethodDescriptor<vmService.generated.RequestDeployDatabase, vmService.generated.ResponseDeployDatabase> getVmServicesDeployDatabaseMethod;
    if ((getVmServicesDeployDatabaseMethod = VMServicesGrpc.getVmServicesDeployDatabaseMethod) == null) {
      synchronized (VMServicesGrpc.class) {
        if ((getVmServicesDeployDatabaseMethod = VMServicesGrpc.getVmServicesDeployDatabaseMethod) == null) {
          VMServicesGrpc.getVmServicesDeployDatabaseMethod = getVmServicesDeployDatabaseMethod = 
              io.grpc.MethodDescriptor.<vmService.generated.RequestDeployDatabase, vmService.generated.ResponseDeployDatabase>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "vmServices.VMServices", "vmServices_deploy_database"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vmService.generated.RequestDeployDatabase.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vmService.generated.ResponseDeployDatabase.getDefaultInstance()))
                  .setSchemaDescriptor(new VMServicesMethodDescriptorSupplier("vmServices_deploy_database"))
                  .build();
          }
        }
     }
     return getVmServicesDeployDatabaseMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VMServicesStub newStub(io.grpc.Channel channel) {
    return new VMServicesStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VMServicesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new VMServicesBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VMServicesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new VMServicesFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class VMServicesImplBase implements io.grpc.BindableService {

    /**
     */
    public void vmServicesDo(vmService.generated.RequestMessage request,
        io.grpc.stub.StreamObserver<vmService.generated.ResponseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getVmServicesDoMethod(), responseObserver);
    }

    /**
     */
    public void vmServicesBroadcastStatus(vmService.generated.RequestStatus request,
        io.grpc.stub.StreamObserver<vmService.generated.ResponseStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getVmServicesBroadcastStatusMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<vmService.generated.RequestDeployCode> vmServicesDeployCode(
        io.grpc.stub.StreamObserver<vmService.generated.ResponseDeployCode> responseObserver) {
      return asyncUnimplementedStreamingCall(getVmServicesDeployCodeMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<vmService.generated.RequestDeployDatabase> vmServicesDeployDatabase(
        io.grpc.stub.StreamObserver<vmService.generated.ResponseDeployDatabase> responseObserver) {
      return asyncUnimplementedStreamingCall(getVmServicesDeployDatabaseMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getVmServicesDoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                vmService.generated.RequestMessage,
                vmService.generated.ResponseMessage>(
                  this, METHODID_VM_SERVICES_DO)))
          .addMethod(
            getVmServicesBroadcastStatusMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                vmService.generated.RequestStatus,
                vmService.generated.ResponseStatus>(
                  this, METHODID_VM_SERVICES_BROADCAST_STATUS)))
          .addMethod(
            getVmServicesDeployCodeMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                vmService.generated.RequestDeployCode,
                vmService.generated.ResponseDeployCode>(
                  this, METHODID_VM_SERVICES_DEPLOY_CODE)))
          .addMethod(
            getVmServicesDeployDatabaseMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                vmService.generated.RequestDeployDatabase,
                vmService.generated.ResponseDeployDatabase>(
                  this, METHODID_VM_SERVICES_DEPLOY_DATABASE)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class VMServicesStub extends io.grpc.stub.AbstractStub<VMServicesStub> {
    private VMServicesStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VMServicesStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VMServicesStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VMServicesStub(channel, callOptions);
    }

    /**
     */
    public void vmServicesDo(vmService.generated.RequestMessage request,
        io.grpc.stub.StreamObserver<vmService.generated.ResponseMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVmServicesDoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void vmServicesBroadcastStatus(vmService.generated.RequestStatus request,
        io.grpc.stub.StreamObserver<vmService.generated.ResponseStatus> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getVmServicesBroadcastStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<vmService.generated.RequestDeployCode> vmServicesDeployCode(
        io.grpc.stub.StreamObserver<vmService.generated.ResponseDeployCode> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getVmServicesDeployCodeMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<vmService.generated.RequestDeployDatabase> vmServicesDeployDatabase(
        io.grpc.stub.StreamObserver<vmService.generated.ResponseDeployDatabase> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getVmServicesDeployDatabaseMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class VMServicesBlockingStub extends io.grpc.stub.AbstractStub<VMServicesBlockingStub> {
    private VMServicesBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VMServicesBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VMServicesBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VMServicesBlockingStub(channel, callOptions);
    }

    /**
     */
    public vmService.generated.ResponseMessage vmServicesDo(vmService.generated.RequestMessage request) {
      return blockingUnaryCall(
          getChannel(), getVmServicesDoMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<vmService.generated.ResponseStatus> vmServicesBroadcastStatus(
        vmService.generated.RequestStatus request) {
      return blockingServerStreamingCall(
          getChannel(), getVmServicesBroadcastStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class VMServicesFutureStub extends io.grpc.stub.AbstractStub<VMServicesFutureStub> {
    private VMServicesFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VMServicesFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VMServicesFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VMServicesFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<vmService.generated.ResponseMessage> vmServicesDo(
        vmService.generated.RequestMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getVmServicesDoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_VM_SERVICES_DO = 0;
  private static final int METHODID_VM_SERVICES_BROADCAST_STATUS = 1;
  private static final int METHODID_VM_SERVICES_DEPLOY_CODE = 2;
  private static final int METHODID_VM_SERVICES_DEPLOY_DATABASE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final VMServicesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(VMServicesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_VM_SERVICES_DO:
          serviceImpl.vmServicesDo((vmService.generated.RequestMessage) request,
              (io.grpc.stub.StreamObserver<vmService.generated.ResponseMessage>) responseObserver);
          break;
        case METHODID_VM_SERVICES_BROADCAST_STATUS:
          serviceImpl.vmServicesBroadcastStatus((vmService.generated.RequestStatus) request,
              (io.grpc.stub.StreamObserver<vmService.generated.ResponseStatus>) responseObserver);
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
        case METHODID_VM_SERVICES_DEPLOY_CODE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.vmServicesDeployCode(
              (io.grpc.stub.StreamObserver<vmService.generated.ResponseDeployCode>) responseObserver);
        case METHODID_VM_SERVICES_DEPLOY_DATABASE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.vmServicesDeployDatabase(
              (io.grpc.stub.StreamObserver<vmService.generated.ResponseDeployDatabase>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class VMServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VMServicesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return vmService.generated.VMServicesImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VMServices");
    }
  }

  private static final class VMServicesFileDescriptorSupplier
      extends VMServicesBaseDescriptorSupplier {
    VMServicesFileDescriptorSupplier() {}
  }

  private static final class VMServicesMethodDescriptorSupplier
      extends VMServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    VMServicesMethodDescriptorSupplier(String methodName) {
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
      synchronized (VMServicesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VMServicesFileDescriptorSupplier())
              .addMethod(getVmServicesDoMethod())
              .addMethod(getVmServicesBroadcastStatusMethod())
              .addMethod(getVmServicesDeployCodeMethod())
              .addMethod(getVmServicesDeployDatabaseMethod())
              .build();
        }
      }
    }
    return result;
  }
}
