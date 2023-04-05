// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: User.proto

package com.asy.tests.grpc.proto.user;

/**
 * Protobuf type {@code com.asy.tests.grpc.proto.user.UserListResponse}
 */
public final class UserListResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.asy.tests.grpc.proto.user.UserListResponse)
    UserListResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserListResponse.newBuilder() to construct.
  private UserListResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserListResponse() {
    users_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UserListResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.asy.tests.grpc.proto.user.User.internal_static_com_asy_tests_grpc_proto_user_UserListResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.asy.tests.grpc.proto.user.User.internal_static_com_asy_tests_grpc_proto_user_UserListResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.asy.tests.grpc.proto.user.UserListResponse.class, com.asy.tests.grpc.proto.user.UserListResponse.Builder.class);
  }

  public static final int USERS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.asy.tests.grpc.proto.user.UserResponse> users_;
  /**
   * <code>repeated .com.asy.tests.grpc.proto.user.UserResponse users = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.asy.tests.grpc.proto.user.UserResponse> getUsersList() {
    return users_;
  }
  /**
   * <code>repeated .com.asy.tests.grpc.proto.user.UserResponse users = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.asy.tests.grpc.proto.user.UserResponseOrBuilder> 
      getUsersOrBuilderList() {
    return users_;
  }
  /**
   * <code>repeated .com.asy.tests.grpc.proto.user.UserResponse users = 1;</code>
   */
  @java.lang.Override
  public int getUsersCount() {
    return users_.size();
  }
  /**
   * <code>repeated .com.asy.tests.grpc.proto.user.UserResponse users = 1;</code>
   */
  @java.lang.Override
  public com.asy.tests.grpc.proto.user.UserResponse getUsers(int index) {
    return users_.get(index);
  }
  /**
   * <code>repeated .com.asy.tests.grpc.proto.user.UserResponse users = 1;</code>
   */
  @java.lang.Override
  public com.asy.tests.grpc.proto.user.UserResponseOrBuilder getUsersOrBuilder(
      int index) {
    return users_.get(index);
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
    for (int i = 0; i < users_.size(); i++) {
      output.writeMessage(1, users_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < users_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, users_.get(i));
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
    if (!(obj instanceof com.asy.tests.grpc.proto.user.UserListResponse)) {
      return super.equals(obj);
    }
    com.asy.tests.grpc.proto.user.UserListResponse other = (com.asy.tests.grpc.proto.user.UserListResponse) obj;

    if (!getUsersList()
        .equals(other.getUsersList())) return false;
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
    if (getUsersCount() > 0) {
      hash = (37 * hash) + USERS_FIELD_NUMBER;
      hash = (53 * hash) + getUsersList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.asy.tests.grpc.proto.user.UserListResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.asy.tests.grpc.proto.user.UserListResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.asy.tests.grpc.proto.user.UserListResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.asy.tests.grpc.proto.user.UserListResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.asy.tests.grpc.proto.user.UserListResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.asy.tests.grpc.proto.user.UserListResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.asy.tests.grpc.proto.user.UserListResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.asy.tests.grpc.proto.user.UserListResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.asy.tests.grpc.proto.user.UserListResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.asy.tests.grpc.proto.user.UserListResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.asy.tests.grpc.proto.user.UserListResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.asy.tests.grpc.proto.user.UserListResponse parseFrom(
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
  public static Builder newBuilder(com.asy.tests.grpc.proto.user.UserListResponse prototype) {
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
   * Protobuf type {@code com.asy.tests.grpc.proto.user.UserListResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.asy.tests.grpc.proto.user.UserListResponse)
      com.asy.tests.grpc.proto.user.UserListResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.asy.tests.grpc.proto.user.User.internal_static_com_asy_tests_grpc_proto_user_UserListResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.asy.tests.grpc.proto.user.User.internal_static_com_asy_tests_grpc_proto_user_UserListResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.asy.tests.grpc.proto.user.UserListResponse.class, com.asy.tests.grpc.proto.user.UserListResponse.Builder.class);
    }

    // Construct using com.asy.tests.grpc.proto.user.UserListResponse.newBuilder()
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
      if (usersBuilder_ == null) {
        users_ = java.util.Collections.emptyList();
      } else {
        users_ = null;
        usersBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.asy.tests.grpc.proto.user.User.internal_static_com_asy_tests_grpc_proto_user_UserListResponse_descriptor;
    }

    @java.lang.Override
    public com.asy.tests.grpc.proto.user.UserListResponse getDefaultInstanceForType() {
      return com.asy.tests.grpc.proto.user.UserListResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.asy.tests.grpc.proto.user.UserListResponse build() {
      com.asy.tests.grpc.proto.user.UserListResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.asy.tests.grpc.proto.user.UserListResponse buildPartial() {
      com.asy.tests.grpc.proto.user.UserListResponse result = new com.asy.tests.grpc.proto.user.UserListResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.asy.tests.grpc.proto.user.UserListResponse result) {
      if (usersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          users_ = java.util.Collections.unmodifiableList(users_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.users_ = users_;
      } else {
        result.users_ = usersBuilder_.build();
      }
    }

    private void buildPartial0(com.asy.tests.grpc.proto.user.UserListResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.asy.tests.grpc.proto.user.UserListResponse) {
        return mergeFrom((com.asy.tests.grpc.proto.user.UserListResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.asy.tests.grpc.proto.user.UserListResponse other) {
      if (other == com.asy.tests.grpc.proto.user.UserListResponse.getDefaultInstance()) return this;
      if (usersBuilder_ == null) {
        if (!other.users_.isEmpty()) {
          if (users_.isEmpty()) {
            users_ = other.users_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUsersIsMutable();
            users_.addAll(other.users_);
          }
          onChanged();
        }
      } else {
        if (!other.users_.isEmpty()) {
          if (usersBuilder_.isEmpty()) {
            usersBuilder_.dispose();
            usersBuilder_ = null;
            users_ = other.users_;
            bitField0_ = (bitField0_ & ~0x00000001);
            usersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getUsersFieldBuilder() : null;
          } else {
            usersBuilder_.addAllMessages(other.users_);
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
              com.asy.tests.grpc.proto.user.UserResponse m =
                  input.readMessage(
                      com.asy.tests.grpc.proto.user.UserResponse.parser(),
                      extensionRegistry);
              if (usersBuilder_ == null) {
                ensureUsersIsMutable();
                users_.add(m);
              } else {
                usersBuilder_.addMessage(m);
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

    private java.util.List<com.asy.tests.grpc.proto.user.UserResponse> users_ =
      java.util.Collections.emptyList();
    private void ensureUsersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        users_ = new java.util.ArrayList<com.asy.tests.grpc.proto.user.UserResponse>(users_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.asy.tests.grpc.proto.user.UserResponse, com.asy.tests.grpc.proto.user.UserResponse.Builder, com.asy.tests.grpc.proto.user.UserResponseOrBuilder> usersBuilder_;

    /**
     * <code>repeated .com.asy.tests.grpc.proto.user.UserResponse users = 1;</code>
     */
    public java.util.List<com.asy.tests.grpc.proto.user.UserResponse> getUsersList() {
      if (usersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(users_);
      } else {
        return usersBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.asy.tests.grpc.proto.user.UserResponse users = 1;</code>
     */
    public int getUsersCount() {
      if (usersBuilder_ == null) {
        return users_.size();
      } else {
        return usersBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.asy.tests.grpc.proto.user.UserResponse users = 1;</code>
     */
    public com.asy.tests.grpc.proto.user.UserResponse getUsers(int index) {
      if (usersBuilder_ == null) {
        return users_.get(index);
      } else {
        return usersBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.asy.tests.grpc.proto.user.UserResponse users = 1;</code>
     */
    public Builder setUsers(
        int index, com.asy.tests.grpc.proto.user.UserResponse value) {
      if (usersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUsersIsMutable();
        users_.set(index, value);
        onChanged();
      } else {
        usersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.asy.tests.grpc.proto.user.UserResponse users = 1;</code>
     */
    public Builder setUsers(
        int index, com.asy.tests.grpc.proto.user.UserResponse.Builder builderForValue) {
      if (usersBuilder_ == null) {
        ensureUsersIsMutable();
        users_.set(index, builderForValue.build());
        onChanged();
      } else {
        usersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.asy.tests.grpc.proto.user.UserResponse users = 1;</code>
     */
    public Builder addUsers(com.asy.tests.grpc.proto.user.UserResponse value) {
      if (usersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUsersIsMutable();
        users_.add(value);
        onChanged();
      } else {
        usersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.asy.tests.grpc.proto.user.UserResponse users = 1;</code>
     */
    public Builder addUsers(
        int index, com.asy.tests.grpc.proto.user.UserResponse value) {
      if (usersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUsersIsMutable();
        users_.add(index, value);
        onChanged();
      } else {
        usersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.asy.tests.grpc.proto.user.UserResponse users = 1;</code>
     */
    public Builder addUsers(
        com.asy.tests.grpc.proto.user.UserResponse.Builder builderForValue) {
      if (usersBuilder_ == null) {
        ensureUsersIsMutable();
        users_.add(builderForValue.build());
        onChanged();
      } else {
        usersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.asy.tests.grpc.proto.user.UserResponse users = 1;</code>
     */
    public Builder addUsers(
        int index, com.asy.tests.grpc.proto.user.UserResponse.Builder builderForValue) {
      if (usersBuilder_ == null) {
        ensureUsersIsMutable();
        users_.add(index, builderForValue.build());
        onChanged();
      } else {
        usersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.asy.tests.grpc.proto.user.UserResponse users = 1;</code>
     */
    public Builder addAllUsers(
        java.lang.Iterable<? extends com.asy.tests.grpc.proto.user.UserResponse> values) {
      if (usersBuilder_ == null) {
        ensureUsersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, users_);
        onChanged();
      } else {
        usersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.asy.tests.grpc.proto.user.UserResponse users = 1;</code>
     */
    public Builder clearUsers() {
      if (usersBuilder_ == null) {
        users_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        usersBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.asy.tests.grpc.proto.user.UserResponse users = 1;</code>
     */
    public Builder removeUsers(int index) {
      if (usersBuilder_ == null) {
        ensureUsersIsMutable();
        users_.remove(index);
        onChanged();
      } else {
        usersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.asy.tests.grpc.proto.user.UserResponse users = 1;</code>
     */
    public com.asy.tests.grpc.proto.user.UserResponse.Builder getUsersBuilder(
        int index) {
      return getUsersFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.asy.tests.grpc.proto.user.UserResponse users = 1;</code>
     */
    public com.asy.tests.grpc.proto.user.UserResponseOrBuilder getUsersOrBuilder(
        int index) {
      if (usersBuilder_ == null) {
        return users_.get(index);  } else {
        return usersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.asy.tests.grpc.proto.user.UserResponse users = 1;</code>
     */
    public java.util.List<? extends com.asy.tests.grpc.proto.user.UserResponseOrBuilder> 
         getUsersOrBuilderList() {
      if (usersBuilder_ != null) {
        return usersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(users_);
      }
    }
    /**
     * <code>repeated .com.asy.tests.grpc.proto.user.UserResponse users = 1;</code>
     */
    public com.asy.tests.grpc.proto.user.UserResponse.Builder addUsersBuilder() {
      return getUsersFieldBuilder().addBuilder(
          com.asy.tests.grpc.proto.user.UserResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .com.asy.tests.grpc.proto.user.UserResponse users = 1;</code>
     */
    public com.asy.tests.grpc.proto.user.UserResponse.Builder addUsersBuilder(
        int index) {
      return getUsersFieldBuilder().addBuilder(
          index, com.asy.tests.grpc.proto.user.UserResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .com.asy.tests.grpc.proto.user.UserResponse users = 1;</code>
     */
    public java.util.List<com.asy.tests.grpc.proto.user.UserResponse.Builder> 
         getUsersBuilderList() {
      return getUsersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.asy.tests.grpc.proto.user.UserResponse, com.asy.tests.grpc.proto.user.UserResponse.Builder, com.asy.tests.grpc.proto.user.UserResponseOrBuilder> 
        getUsersFieldBuilder() {
      if (usersBuilder_ == null) {
        usersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.asy.tests.grpc.proto.user.UserResponse, com.asy.tests.grpc.proto.user.UserResponse.Builder, com.asy.tests.grpc.proto.user.UserResponseOrBuilder>(
                users_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        users_ = null;
      }
      return usersBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.asy.tests.grpc.proto.user.UserListResponse)
  }

  // @@protoc_insertion_point(class_scope:com.asy.tests.grpc.proto.user.UserListResponse)
  private static final com.asy.tests.grpc.proto.user.UserListResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.asy.tests.grpc.proto.user.UserListResponse();
  }

  public static com.asy.tests.grpc.proto.user.UserListResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserListResponse>
      PARSER = new com.google.protobuf.AbstractParser<UserListResponse>() {
    @java.lang.Override
    public UserListResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<UserListResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserListResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.asy.tests.grpc.proto.user.UserListResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

