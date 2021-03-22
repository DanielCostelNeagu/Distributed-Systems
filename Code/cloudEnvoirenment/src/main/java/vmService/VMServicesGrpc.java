package vmService;

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
  private static volatile io.grpc.MethodDescriptor<vmService.RequestMessage,
      vmService.ResponseMessage> getVmServicesDoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "vmServices_do",
      requestType = vmService.RequestMessage.class,
      responseType = vmService.ResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<vmService.RequestMessage,
      vmService.ResponseMessage> getVmServicesDoMethod() {
    io.grpc.MethodDescriptor<vmService.RequestMessage, vmService.ResponseMessage> getVmServicesDoMethod;
    if ((getVmServicesDoMethod = VMServicesGrpc.getVmServicesDoMethod) == null) {
      synchronized (VMServicesGrpc.class) {
        if ((getVmServicesDoMethod = VMServicesGrpc.getVmServicesDoMethod) == null) {
          VMServicesGrpc.getVmServicesDoMethod = getVmServicesDoMethod = 
              io.grpc.MethodDescriptor.<vmService.RequestMessage, vmService.ResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "vmServices.VMServices", "vmServices_do"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vmService.RequestMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vmService.ResponseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new VMServicesMethodDescriptorSupplier("vmServices_do"))
                  .build();
          }
        }
     }
     return getVmServicesDoMethod;
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
    public void vmServicesDo(vmService.RequestMessage request,
        io.grpc.stub.StreamObserver<vmService.ResponseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getVmServicesDoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getVmServicesDoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                vmService.RequestMessage,
                vmService.ResponseMessage>(
                  this, METHODID_VM_SERVICES_DO)))
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
    public void vmServicesDo(vmService.RequestMessage request,
        io.grpc.stub.StreamObserver<vmService.ResponseMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVmServicesDoMethod(), getCallOptions()), request, responseObserver);
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
    public vmService.ResponseMessage vmServicesDo(vmService.RequestMessage request) {
      return blockingUnaryCall(
          getChannel(), getVmServicesDoMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<vmService.ResponseMessage> vmServicesDo(
        vmService.RequestMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getVmServicesDoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_VM_SERVICES_DO = 0;

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
          serviceImpl.vmServicesDo((vmService.RequestMessage) request,
              (io.grpc.stub.StreamObserver<vmService.ResponseMessage>) responseObserver);
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

  private static abstract class VMServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VMServicesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return vmService.VMServicesImpl.getDescriptor();
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
              .build();
        }
      }
    }
    return result;
  }
}
