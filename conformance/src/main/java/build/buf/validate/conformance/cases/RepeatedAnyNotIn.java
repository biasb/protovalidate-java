// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buf/validate/conformance/cases/repeated.proto

package build.buf.validate.conformance.cases;

/**
 * Protobuf type {@code buf.validate.conformance.cases.RepeatedAnyNotIn}
 */
public final class RepeatedAnyNotIn extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:buf.validate.conformance.cases.RepeatedAnyNotIn)
    RepeatedAnyNotInOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RepeatedAnyNotIn.newBuilder() to construct.
  private RepeatedAnyNotIn(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RepeatedAnyNotIn() {
    val_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RepeatedAnyNotIn();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return build.buf.validate.conformance.cases.RepeatedProto.internal_static_buf_validate_conformance_cases_RepeatedAnyNotIn_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return build.buf.validate.conformance.cases.RepeatedProto.internal_static_buf_validate_conformance_cases_RepeatedAnyNotIn_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            build.buf.validate.conformance.cases.RepeatedAnyNotIn.class, build.buf.validate.conformance.cases.RepeatedAnyNotIn.Builder.class);
  }

  public static final int VAL_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.protobuf.Any> val_;
  /**
   * <code>repeated .google.protobuf.Any val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public java.util.List<com.google.protobuf.Any> getValList() {
    return val_;
  }
  /**
   * <code>repeated .google.protobuf.Any val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
      getValOrBuilderList() {
    return val_;
  }
  /**
   * <code>repeated .google.protobuf.Any val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public int getValCount() {
    return val_.size();
  }
  /**
   * <code>repeated .google.protobuf.Any val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public com.google.protobuf.Any getVal(int index) {
    return val_.get(index);
  }
  /**
   * <code>repeated .google.protobuf.Any val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public com.google.protobuf.AnyOrBuilder getValOrBuilder(
      int index) {
    return val_.get(index);
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
    for (int i = 0; i < val_.size(); i++) {
      output.writeMessage(1, val_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < val_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, val_.get(i));
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
    if (!(obj instanceof build.buf.validate.conformance.cases.RepeatedAnyNotIn)) {
      return super.equals(obj);
    }
    build.buf.validate.conformance.cases.RepeatedAnyNotIn other = (build.buf.validate.conformance.cases.RepeatedAnyNotIn) obj;

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

  public static build.buf.validate.conformance.cases.RepeatedAnyNotIn parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.RepeatedAnyNotIn parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.RepeatedAnyNotIn parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.RepeatedAnyNotIn parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.RepeatedAnyNotIn parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.RepeatedAnyNotIn parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.RepeatedAnyNotIn parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.conformance.cases.RepeatedAnyNotIn parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static build.buf.validate.conformance.cases.RepeatedAnyNotIn parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static build.buf.validate.conformance.cases.RepeatedAnyNotIn parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.RepeatedAnyNotIn parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.conformance.cases.RepeatedAnyNotIn parseFrom(
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
  public static Builder newBuilder(build.buf.validate.conformance.cases.RepeatedAnyNotIn prototype) {
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
   * Protobuf type {@code buf.validate.conformance.cases.RepeatedAnyNotIn}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:buf.validate.conformance.cases.RepeatedAnyNotIn)
      build.buf.validate.conformance.cases.RepeatedAnyNotInOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return build.buf.validate.conformance.cases.RepeatedProto.internal_static_buf_validate_conformance_cases_RepeatedAnyNotIn_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return build.buf.validate.conformance.cases.RepeatedProto.internal_static_buf_validate_conformance_cases_RepeatedAnyNotIn_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              build.buf.validate.conformance.cases.RepeatedAnyNotIn.class, build.buf.validate.conformance.cases.RepeatedAnyNotIn.Builder.class);
    }

    // Construct using build.buf.validate.conformance.cases.RepeatedAnyNotIn.newBuilder()
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
      if (valBuilder_ == null) {
        val_ = java.util.Collections.emptyList();
      } else {
        val_ = null;
        valBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return build.buf.validate.conformance.cases.RepeatedProto.internal_static_buf_validate_conformance_cases_RepeatedAnyNotIn_descriptor;
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.RepeatedAnyNotIn getDefaultInstanceForType() {
      return build.buf.validate.conformance.cases.RepeatedAnyNotIn.getDefaultInstance();
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.RepeatedAnyNotIn build() {
      build.buf.validate.conformance.cases.RepeatedAnyNotIn result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.RepeatedAnyNotIn buildPartial() {
      build.buf.validate.conformance.cases.RepeatedAnyNotIn result = new build.buf.validate.conformance.cases.RepeatedAnyNotIn(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(build.buf.validate.conformance.cases.RepeatedAnyNotIn result) {
      if (valBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          val_ = java.util.Collections.unmodifiableList(val_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.val_ = val_;
      } else {
        result.val_ = valBuilder_.build();
      }
    }

    private void buildPartial0(build.buf.validate.conformance.cases.RepeatedAnyNotIn result) {
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
      if (other instanceof build.buf.validate.conformance.cases.RepeatedAnyNotIn) {
        return mergeFrom((build.buf.validate.conformance.cases.RepeatedAnyNotIn)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(build.buf.validate.conformance.cases.RepeatedAnyNotIn other) {
      if (other == build.buf.validate.conformance.cases.RepeatedAnyNotIn.getDefaultInstance()) return this;
      if (valBuilder_ == null) {
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
      } else {
        if (!other.val_.isEmpty()) {
          if (valBuilder_.isEmpty()) {
            valBuilder_.dispose();
            valBuilder_ = null;
            val_ = other.val_;
            bitField0_ = (bitField0_ & ~0x00000001);
            valBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getValFieldBuilder() : null;
          } else {
            valBuilder_.addAllMessages(other.val_);
          }
        }
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
            case 10: {
              com.google.protobuf.Any m =
                  input.readMessage(
                      com.google.protobuf.Any.parser(),
                      extensionRegistry);
              if (valBuilder_ == null) {
                ensureValIsMutable();
                val_.add(m);
              } else {
                valBuilder_.addMessage(m);
              }
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

    private java.util.List<com.google.protobuf.Any> val_ =
      java.util.Collections.emptyList();
    private void ensureValIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        val_ = new java.util.ArrayList<com.google.protobuf.Any>(val_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> valBuilder_;

    /**
     * <code>repeated .google.protobuf.Any val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public java.util.List<com.google.protobuf.Any> getValList() {
      if (valBuilder_ == null) {
        return java.util.Collections.unmodifiableList(val_);
      } else {
        return valBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .google.protobuf.Any val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public int getValCount() {
      if (valBuilder_ == null) {
        return val_.size();
      } else {
        return valBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .google.protobuf.Any val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public com.google.protobuf.Any getVal(int index) {
      if (valBuilder_ == null) {
        return val_.get(index);
      } else {
        return valBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .google.protobuf.Any val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public Builder setVal(
        int index, com.google.protobuf.Any value) {
      if (valBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValIsMutable();
        val_.set(index, value);
        onChanged();
      } else {
        valBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Any val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public Builder setVal(
        int index, com.google.protobuf.Any.Builder builderForValue) {
      if (valBuilder_ == null) {
        ensureValIsMutable();
        val_.set(index, builderForValue.build());
        onChanged();
      } else {
        valBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Any val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public Builder addVal(com.google.protobuf.Any value) {
      if (valBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValIsMutable();
        val_.add(value);
        onChanged();
      } else {
        valBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Any val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public Builder addVal(
        int index, com.google.protobuf.Any value) {
      if (valBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValIsMutable();
        val_.add(index, value);
        onChanged();
      } else {
        valBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Any val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public Builder addVal(
        com.google.protobuf.Any.Builder builderForValue) {
      if (valBuilder_ == null) {
        ensureValIsMutable();
        val_.add(builderForValue.build());
        onChanged();
      } else {
        valBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Any val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public Builder addVal(
        int index, com.google.protobuf.Any.Builder builderForValue) {
      if (valBuilder_ == null) {
        ensureValIsMutable();
        val_.add(index, builderForValue.build());
        onChanged();
      } else {
        valBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Any val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public Builder addAllVal(
        java.lang.Iterable<? extends com.google.protobuf.Any> values) {
      if (valBuilder_ == null) {
        ensureValIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, val_);
        onChanged();
      } else {
        valBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Any val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public Builder clearVal() {
      if (valBuilder_ == null) {
        val_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        valBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Any val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public Builder removeVal(int index) {
      if (valBuilder_ == null) {
        ensureValIsMutable();
        val_.remove(index);
        onChanged();
      } else {
        valBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Any val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public com.google.protobuf.Any.Builder getValBuilder(
        int index) {
      return getValFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .google.protobuf.Any val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public com.google.protobuf.AnyOrBuilder getValOrBuilder(
        int index) {
      if (valBuilder_ == null) {
        return val_.get(index);  } else {
        return valBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .google.protobuf.Any val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
         getValOrBuilderList() {
      if (valBuilder_ != null) {
        return valBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(val_);
      }
    }
    /**
     * <code>repeated .google.protobuf.Any val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public com.google.protobuf.Any.Builder addValBuilder() {
      return getValFieldBuilder().addBuilder(
          com.google.protobuf.Any.getDefaultInstance());
    }
    /**
     * <code>repeated .google.protobuf.Any val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public com.google.protobuf.Any.Builder addValBuilder(
        int index) {
      return getValFieldBuilder().addBuilder(
          index, com.google.protobuf.Any.getDefaultInstance());
    }
    /**
     * <code>repeated .google.protobuf.Any val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public java.util.List<com.google.protobuf.Any.Builder> 
         getValBuilderList() {
      return getValFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
        getValFieldBuilder() {
      if (valBuilder_ == null) {
        valBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                val_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        val_ = null;
      }
      return valBuilder_;
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


    // @@protoc_insertion_point(builder_scope:buf.validate.conformance.cases.RepeatedAnyNotIn)
  }

  // @@protoc_insertion_point(class_scope:buf.validate.conformance.cases.RepeatedAnyNotIn)
  private static final build.buf.validate.conformance.cases.RepeatedAnyNotIn DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new build.buf.validate.conformance.cases.RepeatedAnyNotIn();
  }

  public static build.buf.validate.conformance.cases.RepeatedAnyNotIn getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RepeatedAnyNotIn>
      PARSER = new com.google.protobuf.AbstractParser<RepeatedAnyNotIn>() {
    @java.lang.Override
    public RepeatedAnyNotIn parsePartialFrom(
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

  public static com.google.protobuf.Parser<RepeatedAnyNotIn> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RepeatedAnyNotIn> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public build.buf.validate.conformance.cases.RepeatedAnyNotIn getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

