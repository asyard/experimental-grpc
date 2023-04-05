package com.asy.tests.grpc.server;

import com.asy.tests.grpc.proto.user.*;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;

import java.util.Date;

public class UserServiceImpl extends UserServiceGrpc.UserServiceImplBase {

    //  Unary request
    @Override
    public void createUser(CreateUserRequest request, StreamObserver<CreateUserResponse> responseObserver) {
        System.out.println("id: " + request.getId());
        System.out.println("name : " + request.getName());
        System.out.println("e-mail : " + request.getEmail());
        System.out.println("type : " + request.getType());
        System.out.println("type value : " + request.getTypeValue());
        System.out.println("birth date : " + new Date(request.getBirthdate().getNanos()));
        System.out.println("active : " + request.getActive());
        System.out.println("numbers : " + request.getNumbersList());

        CreateUserResponse createUserResponse = CreateUserResponse.newBuilder().setStatus(1).setMessage("ok").build();

        // Send the response to client
        responseObserver.onNext(createUserResponse);

        // Close the stream
        responseObserver.onCompleted();
        System.out.println("Operation completed");
    }

    @Override
    public void listAll(Empty request, StreamObserver<UserListResponse> responseObserver) {
        UserResponse userResponse1 = UserResponse.newBuilder().setName("NAME1").setActive(true).build();
        UserResponse userResponse2 = UserResponse.newBuilder().setName("NAME2").setActive(false).build();
        UserResponse userResponse3 = UserResponse.newBuilder().setName("NAME3").setActive(true).build();
        UserResponse userResponse4 = UserResponse.newBuilder().setName("NAME4").setActive(true).build();
        UserResponse userResponse5 = UserResponse.newBuilder().setName("NAME5").setActive(true).build();

        UserListResponse userListResponse = UserListResponse.newBuilder()
                .addUsers(userResponse1)
                .addUsers(userResponse2)
                .addUsers(userResponse3)
                .addUsers(userResponse4)
                .addUsers(userResponse5)
                .build();

        // Send the response to client
        responseObserver.onNext(userListResponse);

        // Close the stream
        responseObserver.onCompleted();
        System.out.println("Operation completed");
    }
}
