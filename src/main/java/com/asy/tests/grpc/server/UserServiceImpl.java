package com.asy.tests.grpc.server;

import com.asy.tests.grpc.proto.user.CreateUserRequest;
import com.asy.tests.grpc.proto.user.CreateUserResponse;
import com.asy.tests.grpc.proto.user.UserServiceGrpc;
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
}
