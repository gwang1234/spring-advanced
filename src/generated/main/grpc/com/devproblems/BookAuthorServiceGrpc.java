package com.devproblems;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: schema.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BookAuthorServiceGrpc {

  private BookAuthorServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.devproblems.BookAuthorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.devproblems.Author,
      com.devproblems.Author> getGetAuthorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAuthor",
      requestType = com.devproblems.Author.class,
      responseType = com.devproblems.Author.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.devproblems.Author,
      com.devproblems.Author> getGetAuthorMethod() {
    io.grpc.MethodDescriptor<com.devproblems.Author, com.devproblems.Author> getGetAuthorMethod;
    if ((getGetAuthorMethod = BookAuthorServiceGrpc.getGetAuthorMethod) == null) {
      synchronized (BookAuthorServiceGrpc.class) {
        if ((getGetAuthorMethod = BookAuthorServiceGrpc.getGetAuthorMethod) == null) {
          BookAuthorServiceGrpc.getGetAuthorMethod = getGetAuthorMethod =
              io.grpc.MethodDescriptor.<com.devproblems.Author, com.devproblems.Author>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAuthor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.devproblems.Author.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.devproblems.Author.getDefaultInstance()))
              .setSchemaDescriptor(new BookAuthorServiceMethodDescriptorSupplier("getAuthor"))
              .build();
        }
      }
    }
    return getGetAuthorMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BookAuthorServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookAuthorServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookAuthorServiceStub>() {
        @java.lang.Override
        public BookAuthorServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookAuthorServiceStub(channel, callOptions);
        }
      };
    return BookAuthorServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BookAuthorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookAuthorServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookAuthorServiceBlockingStub>() {
        @java.lang.Override
        public BookAuthorServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookAuthorServiceBlockingStub(channel, callOptions);
        }
      };
    return BookAuthorServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BookAuthorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookAuthorServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookAuthorServiceFutureStub>() {
        @java.lang.Override
        public BookAuthorServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookAuthorServiceFutureStub(channel, callOptions);
        }
      };
    return BookAuthorServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * 단일식 - 하나 요청, 하나 응답
     * </pre>
     */
    default void getAuthor(com.devproblems.Author request,
        io.grpc.stub.StreamObserver<com.devproblems.Author> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAuthorMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BookAuthorService.
   */
  public static abstract class BookAuthorServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BookAuthorServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BookAuthorService.
   */
  public static final class BookAuthorServiceStub
      extends io.grpc.stub.AbstractAsyncStub<BookAuthorServiceStub> {
    private BookAuthorServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookAuthorServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookAuthorServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 단일식 - 하나 요청, 하나 응답
     * </pre>
     */
    public void getAuthor(com.devproblems.Author request,
        io.grpc.stub.StreamObserver<com.devproblems.Author> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAuthorMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BookAuthorService.
   */
  public static final class BookAuthorServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BookAuthorServiceBlockingStub> {
    private BookAuthorServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookAuthorServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookAuthorServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 단일식 - 하나 요청, 하나 응답
     * </pre>
     */
    public com.devproblems.Author getAuthor(com.devproblems.Author request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAuthorMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BookAuthorService.
   */
  public static final class BookAuthorServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<BookAuthorServiceFutureStub> {
    private BookAuthorServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookAuthorServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookAuthorServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 단일식 - 하나 요청, 하나 응답
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.devproblems.Author> getAuthor(
        com.devproblems.Author request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAuthorMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AUTHOR = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AUTHOR:
          serviceImpl.getAuthor((com.devproblems.Author) request,
              (io.grpc.stub.StreamObserver<com.devproblems.Author>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetAuthorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.devproblems.Author,
              com.devproblems.Author>(
                service, METHODID_GET_AUTHOR)))
        .build();
  }

  private static abstract class BookAuthorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BookAuthorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.devproblems.Schema.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BookAuthorService");
    }
  }

  private static final class BookAuthorServiceFileDescriptorSupplier
      extends BookAuthorServiceBaseDescriptorSupplier {
    BookAuthorServiceFileDescriptorSupplier() {}
  }

  private static final class BookAuthorServiceMethodDescriptorSupplier
      extends BookAuthorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    BookAuthorServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (BookAuthorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BookAuthorServiceFileDescriptorSupplier())
              .addMethod(getGetAuthorMethod())
              .build();
        }
      }
    }
    return result;
  }
}
