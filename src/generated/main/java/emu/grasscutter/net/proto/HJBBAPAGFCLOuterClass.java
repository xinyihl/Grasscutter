// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HJBBAPAGFCL.proto

package emu.grasscutter.net.proto;

public final class HJBBAPAGFCLOuterClass {
  private HJBBAPAGFCLOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HJBBAPAGFCLOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HJBBAPAGFCL)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 uid = 3;</code>
     * @return The uid.
     */
    int getUid();

    /**
     * <code>repeated uint32 ACNPNNDGIBB = 7;</code>
     * @return A list containing the aCNPNNDGIBB.
     */
    java.util.List<java.lang.Integer> getACNPNNDGIBBList();
    /**
     * <code>repeated uint32 ACNPNNDGIBB = 7;</code>
     * @return The count of aCNPNNDGIBB.
     */
    int getACNPNNDGIBBCount();
    /**
     * <code>repeated uint32 ACNPNNDGIBB = 7;</code>
     * @param index The index of the element to return.
     * @return The aCNPNNDGIBB at the given index.
     */
    int getACNPNNDGIBB(int index);
  }
  /**
   * <pre>
   * CmdId: 3776
   * </pre>
   *
   * Protobuf type {@code HJBBAPAGFCL}
   */
  public static final class HJBBAPAGFCL extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HJBBAPAGFCL)
      HJBBAPAGFCLOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HJBBAPAGFCL.newBuilder() to construct.
    private HJBBAPAGFCL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HJBBAPAGFCL() {
      aCNPNNDGIBB_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HJBBAPAGFCL();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HJBBAPAGFCL(
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
            case 24: {

              uid_ = input.readUInt32();
              break;
            }
            case 56: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                aCNPNNDGIBB_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              aCNPNNDGIBB_.addInt(input.readUInt32());
              break;
            }
            case 58: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                aCNPNNDGIBB_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                aCNPNNDGIBB_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            default: {
              if (!parseUnknownField(
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          aCNPNNDGIBB_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.HJBBAPAGFCLOuterClass.internal_static_HJBBAPAGFCL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HJBBAPAGFCLOuterClass.internal_static_HJBBAPAGFCL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HJBBAPAGFCLOuterClass.HJBBAPAGFCL.class, emu.grasscutter.net.proto.HJBBAPAGFCLOuterClass.HJBBAPAGFCL.Builder.class);
    }

    public static final int UID_FIELD_NUMBER = 3;
    private int uid_;
    /**
     * <code>uint32 uid = 3;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
    }

    public static final int ACNPNNDGIBB_FIELD_NUMBER = 7;
    private com.google.protobuf.Internal.IntList aCNPNNDGIBB_;
    /**
     * <code>repeated uint32 ACNPNNDGIBB = 7;</code>
     * @return A list containing the aCNPNNDGIBB.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getACNPNNDGIBBList() {
      return aCNPNNDGIBB_;
    }
    /**
     * <code>repeated uint32 ACNPNNDGIBB = 7;</code>
     * @return The count of aCNPNNDGIBB.
     */
    public int getACNPNNDGIBBCount() {
      return aCNPNNDGIBB_.size();
    }
    /**
     * <code>repeated uint32 ACNPNNDGIBB = 7;</code>
     * @param index The index of the element to return.
     * @return The aCNPNNDGIBB at the given index.
     */
    public int getACNPNNDGIBB(int index) {
      return aCNPNNDGIBB_.getInt(index);
    }
    private int aCNPNNDGIBBMemoizedSerializedSize = -1;

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
      if (uid_ != 0) {
        output.writeUInt32(3, uid_);
      }
      if (getACNPNNDGIBBList().size() > 0) {
        output.writeUInt32NoTag(58);
        output.writeUInt32NoTag(aCNPNNDGIBBMemoizedSerializedSize);
      }
      for (int i = 0; i < aCNPNNDGIBB_.size(); i++) {
        output.writeUInt32NoTag(aCNPNNDGIBB_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, uid_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < aCNPNNDGIBB_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(aCNPNNDGIBB_.getInt(i));
        }
        size += dataSize;
        if (!getACNPNNDGIBBList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        aCNPNNDGIBBMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.HJBBAPAGFCLOuterClass.HJBBAPAGFCL)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HJBBAPAGFCLOuterClass.HJBBAPAGFCL other = (emu.grasscutter.net.proto.HJBBAPAGFCLOuterClass.HJBBAPAGFCL) obj;

      if (getUid()
          != other.getUid()) return false;
      if (!getACNPNNDGIBBList()
          .equals(other.getACNPNNDGIBBList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      if (getACNPNNDGIBBCount() > 0) {
        hash = (37 * hash) + ACNPNNDGIBB_FIELD_NUMBER;
        hash = (53 * hash) + getACNPNNDGIBBList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HJBBAPAGFCLOuterClass.HJBBAPAGFCL parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HJBBAPAGFCLOuterClass.HJBBAPAGFCL parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HJBBAPAGFCLOuterClass.HJBBAPAGFCL parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HJBBAPAGFCLOuterClass.HJBBAPAGFCL parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HJBBAPAGFCLOuterClass.HJBBAPAGFCL parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HJBBAPAGFCLOuterClass.HJBBAPAGFCL parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HJBBAPAGFCLOuterClass.HJBBAPAGFCL parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HJBBAPAGFCLOuterClass.HJBBAPAGFCL parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HJBBAPAGFCLOuterClass.HJBBAPAGFCL parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HJBBAPAGFCLOuterClass.HJBBAPAGFCL parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HJBBAPAGFCLOuterClass.HJBBAPAGFCL parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HJBBAPAGFCLOuterClass.HJBBAPAGFCL parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HJBBAPAGFCLOuterClass.HJBBAPAGFCL prototype) {
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
     * <pre>
     * CmdId: 3776
     * </pre>
     *
     * Protobuf type {@code HJBBAPAGFCL}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HJBBAPAGFCL)
        emu.grasscutter.net.proto.HJBBAPAGFCLOuterClass.HJBBAPAGFCLOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HJBBAPAGFCLOuterClass.internal_static_HJBBAPAGFCL_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HJBBAPAGFCLOuterClass.internal_static_HJBBAPAGFCL_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HJBBAPAGFCLOuterClass.HJBBAPAGFCL.class, emu.grasscutter.net.proto.HJBBAPAGFCLOuterClass.HJBBAPAGFCL.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HJBBAPAGFCLOuterClass.HJBBAPAGFCL.newBuilder()
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
        uid_ = 0;

        aCNPNNDGIBB_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HJBBAPAGFCLOuterClass.internal_static_HJBBAPAGFCL_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HJBBAPAGFCLOuterClass.HJBBAPAGFCL getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HJBBAPAGFCLOuterClass.HJBBAPAGFCL.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HJBBAPAGFCLOuterClass.HJBBAPAGFCL build() {
        emu.grasscutter.net.proto.HJBBAPAGFCLOuterClass.HJBBAPAGFCL result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HJBBAPAGFCLOuterClass.HJBBAPAGFCL buildPartial() {
        emu.grasscutter.net.proto.HJBBAPAGFCLOuterClass.HJBBAPAGFCL result = new emu.grasscutter.net.proto.HJBBAPAGFCLOuterClass.HJBBAPAGFCL(this);
        int from_bitField0_ = bitField0_;
        result.uid_ = uid_;
        if (((bitField0_ & 0x00000001) != 0)) {
          aCNPNNDGIBB_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.aCNPNNDGIBB_ = aCNPNNDGIBB_;
        onBuilt();
        return result;
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
        if (other instanceof emu.grasscutter.net.proto.HJBBAPAGFCLOuterClass.HJBBAPAGFCL) {
          return mergeFrom((emu.grasscutter.net.proto.HJBBAPAGFCLOuterClass.HJBBAPAGFCL)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HJBBAPAGFCLOuterClass.HJBBAPAGFCL other) {
        if (other == emu.grasscutter.net.proto.HJBBAPAGFCLOuterClass.HJBBAPAGFCL.getDefaultInstance()) return this;
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (!other.aCNPNNDGIBB_.isEmpty()) {
          if (aCNPNNDGIBB_.isEmpty()) {
            aCNPNNDGIBB_ = other.aCNPNNDGIBB_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureACNPNNDGIBBIsMutable();
            aCNPNNDGIBB_.addAll(other.aCNPNNDGIBB_);
          }
          onChanged();
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
        emu.grasscutter.net.proto.HJBBAPAGFCLOuterClass.HJBBAPAGFCL parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.HJBBAPAGFCLOuterClass.HJBBAPAGFCL) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int uid_ ;
      /**
       * <code>uint32 uid = 3;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 3;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        
        uid_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList aCNPNNDGIBB_ = emptyIntList();
      private void ensureACNPNNDGIBBIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          aCNPNNDGIBB_ = mutableCopy(aCNPNNDGIBB_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 ACNPNNDGIBB = 7;</code>
       * @return A list containing the aCNPNNDGIBB.
       */
      public java.util.List<java.lang.Integer>
          getACNPNNDGIBBList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(aCNPNNDGIBB_) : aCNPNNDGIBB_;
      }
      /**
       * <code>repeated uint32 ACNPNNDGIBB = 7;</code>
       * @return The count of aCNPNNDGIBB.
       */
      public int getACNPNNDGIBBCount() {
        return aCNPNNDGIBB_.size();
      }
      /**
       * <code>repeated uint32 ACNPNNDGIBB = 7;</code>
       * @param index The index of the element to return.
       * @return The aCNPNNDGIBB at the given index.
       */
      public int getACNPNNDGIBB(int index) {
        return aCNPNNDGIBB_.getInt(index);
      }
      /**
       * <code>repeated uint32 ACNPNNDGIBB = 7;</code>
       * @param index The index to set the value at.
       * @param value The aCNPNNDGIBB to set.
       * @return This builder for chaining.
       */
      public Builder setACNPNNDGIBB(
          int index, int value) {
        ensureACNPNNDGIBBIsMutable();
        aCNPNNDGIBB_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 ACNPNNDGIBB = 7;</code>
       * @param value The aCNPNNDGIBB to add.
       * @return This builder for chaining.
       */
      public Builder addACNPNNDGIBB(int value) {
        ensureACNPNNDGIBBIsMutable();
        aCNPNNDGIBB_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 ACNPNNDGIBB = 7;</code>
       * @param values The aCNPNNDGIBB to add.
       * @return This builder for chaining.
       */
      public Builder addAllACNPNNDGIBB(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureACNPNNDGIBBIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, aCNPNNDGIBB_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 ACNPNNDGIBB = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearACNPNNDGIBB() {
        aCNPNNDGIBB_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:HJBBAPAGFCL)
    }

    // @@protoc_insertion_point(class_scope:HJBBAPAGFCL)
    private static final emu.grasscutter.net.proto.HJBBAPAGFCLOuterClass.HJBBAPAGFCL DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HJBBAPAGFCLOuterClass.HJBBAPAGFCL();
    }

    public static emu.grasscutter.net.proto.HJBBAPAGFCLOuterClass.HJBBAPAGFCL getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HJBBAPAGFCL>
        PARSER = new com.google.protobuf.AbstractParser<HJBBAPAGFCL>() {
      @java.lang.Override
      public HJBBAPAGFCL parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HJBBAPAGFCL(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HJBBAPAGFCL> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HJBBAPAGFCL> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HJBBAPAGFCLOuterClass.HJBBAPAGFCL getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HJBBAPAGFCL_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HJBBAPAGFCL_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021HJBBAPAGFCL.proto\"/\n\013HJBBAPAGFCL\022\013\n\003ui" +
      "d\030\003 \001(\r\022\023\n\013ACNPNNDGIBB\030\007 \003(\rB\033\n\031emu.gras" +
      "scutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HJBBAPAGFCL_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HJBBAPAGFCL_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HJBBAPAGFCL_descriptor,
        new java.lang.String[] { "Uid", "ACNPNNDGIBB", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}