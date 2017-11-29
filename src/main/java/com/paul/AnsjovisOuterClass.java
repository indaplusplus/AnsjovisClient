package com.paul;// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Ansjovis.proto

public final class AnsjovisOuterClass {
  private AnsjovisOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AnsjovisOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Ansjovis)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Ansjovis.Action action = 1;</code>
     */
    int getActionValue();
    /**
     * <code>.Ansjovis.Action action = 1;</code>
     */
    Ansjovis.Action getAction();

    /**
     * <code>bytes message = 2;</code>
     */
    com.google.protobuf.ByteString getMessage();
  }
  /**
   * Protobuf type {@code Ansjovis}
   */
  public  static final class Ansjovis extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Ansjovis)
      AnsjovisOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Ansjovis.newBuilder() to construct.
    private Ansjovis(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Ansjovis() {
      action_ = 0;
      message_ = com.google.protobuf.ByteString.EMPTY;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Ansjovis(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
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
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              int rawValue = input.readEnum();

              action_ = rawValue;
              break;
            }
            case 18: {

              message_ = input.readBytes();
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
      return AnsjovisOuterClass.internal_static_Ansjovis_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return AnsjovisOuterClass.internal_static_Ansjovis_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Ansjovis.class, Builder.class);
    }

    /**
     * Protobuf enum {@code Ansjovis.Action}
     */
    public enum Action
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>HELLO = 0;</code>
       */
      HELLO(0),
      /**
       * <code>KEY = 1;</code>
       */
      KEY(1),
      /**
       * <code>TRANSFER = 2;</code>
       */
      TRANSFER(2),
      /**
       * <code>END = 3;</code>
       */
      END(3),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>HELLO = 0;</code>
       */
      public static final int HELLO_VALUE = 0;
      /**
       * <code>KEY = 1;</code>
       */
      public static final int KEY_VALUE = 1;
      /**
       * <code>TRANSFER = 2;</code>
       */
      public static final int TRANSFER_VALUE = 2;
      /**
       * <code>END = 3;</code>
       */
      public static final int END_VALUE = 3;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @Deprecated
      public static Action valueOf(int value) {
        return forNumber(value);
      }

      public static Action forNumber(int value) {
        switch (value) {
          case 0: return HELLO;
          case 1: return KEY;
          case 2: return TRANSFER;
          case 3: return END;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Action>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          Action> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Action>() {
              public Action findValueByNumber(int number) {
                return Action.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return Ansjovis.getDescriptor().getEnumTypes().get(0);
      }

      private static final Action[] VALUES = values();

      public static Action valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private Action(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:Ansjovis.Action)
    }

    public static final int ACTION_FIELD_NUMBER = 1;
    private int action_;
    /**
     * <code>.Ansjovis.Action action = 1;</code>
     */
    public int getActionValue() {
      return action_;
    }
    /**
     * <code>.Ansjovis.Action action = 1;</code>
     */
    public Action getAction() {
      Action result = Action.valueOf(action_);
      return result == null ? Action.UNRECOGNIZED : result;
    }

    public static final int MESSAGE_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString message_;
    /**
     * <code>bytes message = 2;</code>
     */
    public com.google.protobuf.ByteString getMessage() {
      return message_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (action_ != Action.HELLO.getNumber()) {
        output.writeEnum(1, action_);
      }
      if (!message_.isEmpty()) {
        output.writeBytes(2, message_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (action_ != Action.HELLO.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, action_);
      }
      if (!message_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, message_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof Ansjovis)) {
        return super.equals(obj);
      }
      Ansjovis other = (Ansjovis) obj;

      boolean result = true;
      result = result && action_ == other.action_;
      result = result && getMessage()
          .equals(other.getMessage());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ACTION_FIELD_NUMBER;
      hash = (53 * hash) + action_;
      hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getMessage().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Ansjovis parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Ansjovis parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Ansjovis parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Ansjovis parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Ansjovis parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Ansjovis parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Ansjovis parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Ansjovis parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static Ansjovis parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static Ansjovis parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Ansjovis parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Ansjovis parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(Ansjovis prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Ansjovis}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Ansjovis)
        AnsjovisOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return AnsjovisOuterClass.internal_static_Ansjovis_descriptor;
      }

      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return AnsjovisOuterClass.internal_static_Ansjovis_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Ansjovis.class, Builder.class);
      }

      // Construct using AnsjovisOuterClass.Ansjovis.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        action_ = 0;

        message_ = com.google.protobuf.ByteString.EMPTY;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return AnsjovisOuterClass.internal_static_Ansjovis_descriptor;
      }

      public Ansjovis getDefaultInstanceForType() {
        return Ansjovis.getDefaultInstance();
      }

      public Ansjovis build() {
        Ansjovis result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public Ansjovis buildPartial() {
        Ansjovis result = new Ansjovis(this);
        result.action_ = action_;
        result.message_ = message_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Ansjovis) {
          return mergeFrom((Ansjovis)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Ansjovis other) {
        if (other == Ansjovis.getDefaultInstance()) return this;
        if (other.action_ != 0) {
          setActionValue(other.getActionValue());
        }
        if (other.getMessage() != com.google.protobuf.ByteString.EMPTY) {
          setMessage(other.getMessage());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Ansjovis parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Ansjovis) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int action_ = 0;
      /**
       * <code>.Ansjovis.Action action = 1;</code>
       */
      public int getActionValue() {
        return action_;
      }
      /**
       * <code>.Ansjovis.Action action = 1;</code>
       */
      public Builder setActionValue(int value) {
        action_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.Ansjovis.Action action = 1;</code>
       */
      public Action getAction() {
        Action result = Action.valueOf(action_);
        return result == null ? Action.UNRECOGNIZED : result;
      }
      /**
       * <code>.Ansjovis.Action action = 1;</code>
       */
      public Builder setAction(Action value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        action_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.Ansjovis.Action action = 1;</code>
       */
      public Builder clearAction() {
        
        action_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString message_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes message = 2;</code>
       */
      public com.google.protobuf.ByteString getMessage() {
        return message_;
      }
      /**
       * <code>bytes message = 2;</code>
       */
      public Builder setMessage(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        message_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes message = 2;</code>
       */
      public Builder clearMessage() {
        
        message_ = getDefaultInstance().getMessage();
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Ansjovis)
    }

    // @@protoc_insertion_point(class_scope:Ansjovis)
    private static final Ansjovis DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Ansjovis();
    }

    public static Ansjovis getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Ansjovis>
        PARSER = new com.google.protobuf.AbstractParser<Ansjovis>() {
      public Ansjovis parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new Ansjovis(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Ansjovis> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<Ansjovis> getParserForType() {
      return PARSER;
    }

    public Ansjovis getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Ansjovis_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Ansjovis_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\016Ansjovis.proto\"r\n\010Ansjovis\022 \n\006action\030\001" +
      " \001(\0162\020.Ansjovis.Action\022\017\n\007message\030\002 \001(\014\"" +
      "3\n\006Action\022\t\n\005HELLO\020\000\022\007\n\003KEY\020\001\022\014\n\010TRANSFE" +
      "R\020\002\022\007\n\003END\020\003b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_Ansjovis_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Ansjovis_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Ansjovis_descriptor,
        new String[] { "Action", "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
