// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buf/validate/conformance/cases/repeated.proto

package build.buf.validate.conformance.cases;

/**
 * Protobuf type {@code buf.validate.conformance.cases.RepeatedItemRule}
 */
public final class RepeatedItemRule extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:buf.validate.conformance.cases.RepeatedItemRule)
    RepeatedItemRuleOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RepeatedItemRule.newBuilder() to construct.
  private RepeatedItemRule(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RepeatedItemRule() {
    val_ = emptyFloatList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RepeatedItemRule();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return build.buf.validate.conformance.cases.RepeatedProto.internal_static_buf_validate_conformance_cases_RepeatedItemRule_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return build.buf.validate.conformance.cases.RepeatedProto.internal_static_buf_validate_conformance_cases_RepeatedItemRule_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            build.buf.validate.conformance.cases.RepeatedItemRule.class, build.buf.validate.conformance.cases.RepeatedItemRule.Builder.class);
  }

  public static final int VAL_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.FloatList val_;
  /**
   * <code>repeated float val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   * @return A list containing the val.
   */
  @java.lang.Override
  public java.util.List<java.lang.Float>
      getValList() {
    return val_;
  }
  /**
   * <code>repeated float val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   * @return The count of val.
   */
  public int getValCount() {
    return val_.size();
  }
  /**
   * <code>repeated float val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   * @param index The index of the element to return.
   * @return The val at the given index.
   */
  public float getVal(int index) {
    return val_.getFloat(index);
  }
  private int valMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (getValList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(valMemoizedSerializedSize);
    }
    for (int i = 0; i < val_.size(); i++) {
      output.writeFloatNoTag(val_.getFloat(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      dataSize = 4 * getValList().size();
      size += dataSize;
      if (!getValList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      valMemoizedSerializedSize = dataSize;
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof build.buf.validate.conformance.cases.RepeatedItemRule)) {
      return super.equals(obj);
    }
    build.buf.validate.conformance.cases.RepeatedItemRule other = (build.buf.validate.conformance.cases.RepeatedItemRule) obj;

    if (!getValList()
        .equals(other.getValList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getValCount() > 0) {
      hash = (37 * hash) + VAL_FIELD_NUMBER;
      hash = (53 * hash) + getValList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static build.buf.validate.conformance.cases.RepeatedItemRule parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.RepeatedItemRule parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.RepeatedItemRule parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.RepeatedItemRule parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.RepeatedItemRule parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.RepeatedItemRule parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.RepeatedItemRule parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.conformance.cases.RepeatedItemRule parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static build.buf.validate.conformance.cases.RepeatedItemRule parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static build.buf.validate.conformance.cases.RepeatedItemRule parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.RepeatedItemRule parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.conformance.cases.RepeatedItemRule parseFrom(
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
  public static Builder newBuilder(build.buf.validate.conformance.cases.RepeatedItemRule prototype) {
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
   * Protobuf type {@code buf.validate.conformance.cases.RepeatedItemRule}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:buf.validate.conformance.cases.RepeatedItemRule)
      build.buf.validate.conformance.cases.RepeatedItemRuleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return build.buf.validate.conformance.cases.RepeatedProto.internal_static_buf_validate_conformance_cases_RepeatedItemRule_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return build.buf.validate.conformance.cases.RepeatedProto.internal_static_buf_validate_conformance_cases_RepeatedItemRule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              build.buf.validate.conformance.cases.RepeatedItemRule.class, build.buf.validate.conformance.cases.RepeatedItemRule.Builder.class);
    }

    // Construct using build.buf.validate.conformance.cases.RepeatedItemRule.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      val_ = emptyFloatList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return build.buf.validate.conformance.cases.RepeatedProto.internal_static_buf_validate_conformance_cases_RepeatedItemRule_descriptor;
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.RepeatedItemRule getDefaultInstanceForType() {
      return build.buf.validate.conformance.cases.RepeatedItemRule.getDefaultInstance();
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.RepeatedItemRule build() {
      build.buf.validate.conformance.cases.RepeatedItemRule result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.RepeatedItemRule buildPartial() {
      build.buf.validate.conformance.cases.RepeatedItemRule result = new build.buf.validate.conformance.cases.RepeatedItemRule(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(build.buf.validate.conformance.cases.RepeatedItemRule result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        val_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.val_ = val_;
    }

    private void buildPartial0(build.buf.validate.conformance.cases.RepeatedItemRule result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof build.buf.validate.conformance.cases.RepeatedItemRule) {
        return mergeFrom((build.buf.validate.conformance.cases.RepeatedItemRule)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(build.buf.validate.conformance.cases.RepeatedItemRule other) {
      if (other == build.buf.validate.conformance.cases.RepeatedItemRule.getDefaultInstance()) return this;
      if (!other.val_.isEmpty()) {
        if (val_.isEmpty()) {
          val_ = other.val_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureValIsMutable();
          val_.addAll(other.val_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 13: {
              float v = input.readFloat();
              ensureValIsMutable();
              val_.addFloat(v);
              break;
            } // case 13
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureValIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                val_.addFloat(input.readFloat());
              }
              input.popLimit(limit);
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.FloatList val_ = emptyFloatList();
    private void ensureValIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        val_ = mutableCopy(val_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated float val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     * @return A list containing the val.
     */
    public java.util.List<java.lang.Float>
        getValList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(val_) : val_;
    }
    /**
     * <code>repeated float val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     * @return The count of val.
     */
    public int getValCount() {
      return val_.size();
    }
    /**
     * <code>repeated float val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     * @param index The index of the element to return.
     * @return The val at the given index.
     */
    public float getVal(int index) {
      return val_.getFloat(index);
    }
    /**
     * <code>repeated float val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     * @param index The index to set the value at.
     * @param value The val to set.
     * @return This builder for chaining.
     */
    public Builder setVal(
        int index, float value) {

      ensureValIsMutable();
      val_.setFloat(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     * @param value The val to add.
     * @return This builder for chaining.
     */
    public Builder addVal(float value) {

      ensureValIsMutable();
      val_.addFloat(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     * @param values The val to add.
     * @return This builder for chaining.
     */
    public Builder addAllVal(
        java.lang.Iterable<? extends java.lang.Float> values) {
      ensureValIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, val_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearVal() {
      val_ = emptyFloatList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:buf.validate.conformance.cases.RepeatedItemRule)
  }

  // @@protoc_insertion_point(class_scope:buf.validate.conformance.cases.RepeatedItemRule)
  private static final build.buf.validate.conformance.cases.RepeatedItemRule DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new build.buf.validate.conformance.cases.RepeatedItemRule();
  }

  public static build.buf.validate.conformance.cases.RepeatedItemRule getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RepeatedItemRule>
      PARSER = new com.google.protobuf.AbstractParser<RepeatedItemRule>() {
    @java.lang.Override
    public RepeatedItemRule parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<RepeatedItemRule> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RepeatedItemRule> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public build.buf.validate.conformance.cases.RepeatedItemRule getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

