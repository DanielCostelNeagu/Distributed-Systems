// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vmService.proto

package vmService.generated;

/**
 * Protobuf type {@code vmServices.Status}
 */
public  final class Status extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:vmServices.Status)
    StatusOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Status.newBuilder() to construct.
  private Status(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Status() {
    healthy_ = 0;
    onOrOff_ = false;
    internetConnection_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Status(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            healthy_ = input.readInt32();
            break;
          }
          case 16: {

            onOrOff_ = input.readBool();
            break;
          }
          case 24: {

            internetConnection_ = input.readBool();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return vmService.generated.VMServicesImpl.internal_static_vmServices_Status_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return vmService.generated.VMServicesImpl.internal_static_vmServices_Status_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            vmService.generated.Status.class, vmService.generated.Status.Builder.class);
  }

  public static final int HEALTHY_FIELD_NUMBER = 1;
  private int healthy_;
  /**
   * <code>int32 healthy = 1;</code>
   */
  public int getHealthy() {
    return healthy_;
  }

  public static final int ONOROFF_FIELD_NUMBER = 2;
  private boolean onOrOff_;
  /**
   * <code>bool onOrOff = 2;</code>
   */
  public boolean getOnOrOff() {
    return onOrOff_;
  }

  public static final int INTERNETCONNECTION_FIELD_NUMBER = 3;
  private boolean internetConnection_;
  /**
   * <code>bool internetConnection = 3;</code>
   */
  public boolean getInternetConnection() {
    return internetConnection_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (healthy_ != 0) {
      output.writeInt32(1, healthy_);
    }
    if (onOrOff_ != false) {
      output.writeBool(2, onOrOff_);
    }
    if (internetConnection_ != false) {
      output.writeBool(3, internetConnection_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (healthy_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, healthy_);
    }
    if (onOrOff_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, onOrOff_);
    }
    if (internetConnection_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, internetConnection_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof vmService.generated.Status)) {
      return super.equals(obj);
    }
    vmService.generated.Status other = (vmService.generated.Status) obj;

    boolean result = true;
    result = result && (getHealthy()
        == other.getHealthy());
    result = result && (getOnOrOff()
        == other.getOnOrOff());
    result = result && (getInternetConnection()
        == other.getInternetConnection());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + HEALTHY_FIELD_NUMBER;
    hash = (53 * hash) + getHealthy();
    hash = (37 * hash) + ONOROFF_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getOnOrOff());
    hash = (37 * hash) + INTERNETCONNECTION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getInternetConnection());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static vmService.generated.Status parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static vmService.generated.Status parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static vmService.generated.Status parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static vmService.generated.Status parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static vmService.generated.Status parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static vmService.generated.Status parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static vmService.generated.Status parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static vmService.generated.Status parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static vmService.generated.Status parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static vmService.generated.Status parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static vmService.generated.Status parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static vmService.generated.Status parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(vmService.generated.Status prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code vmServices.Status}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:vmServices.Status)
      vmService.generated.StatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return vmService.generated.VMServicesImpl.internal_static_vmServices_Status_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return vmService.generated.VMServicesImpl.internal_static_vmServices_Status_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              vmService.generated.Status.class, vmService.generated.Status.Builder.class);
    }

    // Construct using vmService.generated.Status.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      healthy_ = 0;

      onOrOff_ = false;

      internetConnection_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return vmService.generated.VMServicesImpl.internal_static_vmServices_Status_descriptor;
    }

    @java.lang.Override
    public vmService.generated.Status getDefaultInstanceForType() {
      return vmService.generated.Status.getDefaultInstance();
    }

    @java.lang.Override
    public vmService.generated.Status build() {
      vmService.generated.Status result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public vmService.generated.Status buildPartial() {
      vmService.generated.Status result = new vmService.generated.Status(this);
      result.healthy_ = healthy_;
      result.onOrOff_ = onOrOff_;
      result.internetConnection_ = internetConnection_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof vmService.generated.Status) {
        return mergeFrom((vmService.generated.Status)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(vmService.generated.Status other) {
      if (other == vmService.generated.Status.getDefaultInstance()) return this;
      if (other.getHealthy() != 0) {
        setHealthy(other.getHealthy());
      }
      if (other.getOnOrOff() != false) {
        setOnOrOff(other.getOnOrOff());
      }
      if (other.getInternetConnection() != false) {
        setInternetConnection(other.getInternetConnection());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      vmService.generated.Status parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (vmService.generated.Status) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int healthy_ ;
    /**
     * <code>int32 healthy = 1;</code>
     */
    public int getHealthy() {
      return healthy_;
    }
    /**
     * <code>int32 healthy = 1;</code>
     */
    public Builder setHealthy(int value) {
      
      healthy_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 healthy = 1;</code>
     */
    public Builder clearHealthy() {
      
      healthy_ = 0;
      onChanged();
      return this;
    }

    private boolean onOrOff_ ;
    /**
     * <code>bool onOrOff = 2;</code>
     */
    public boolean getOnOrOff() {
      return onOrOff_;
    }
    /**
     * <code>bool onOrOff = 2;</code>
     */
    public Builder setOnOrOff(boolean value) {
      
      onOrOff_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool onOrOff = 2;</code>
     */
    public Builder clearOnOrOff() {
      
      onOrOff_ = false;
      onChanged();
      return this;
    }

    private boolean internetConnection_ ;
    /**
     * <code>bool internetConnection = 3;</code>
     */
    public boolean getInternetConnection() {
      return internetConnection_;
    }
    /**
     * <code>bool internetConnection = 3;</code>
     */
    public Builder setInternetConnection(boolean value) {
      
      internetConnection_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool internetConnection = 3;</code>
     */
    public Builder clearInternetConnection() {
      
      internetConnection_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:vmServices.Status)
  }

  // @@protoc_insertion_point(class_scope:vmServices.Status)
  private static final vmService.generated.Status DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new vmService.generated.Status();
  }

  public static vmService.generated.Status getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Status>
      PARSER = new com.google.protobuf.AbstractParser<Status>() {
    @java.lang.Override
    public Status parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Status(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Status> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Status> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public vmService.generated.Status getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
