package com.asy.tests.grpc.client;

import com.asy.tests.grpc.proto.user.CreateUserRequest;
import com.asy.tests.grpc.proto.user.CreateUserResponse;
import com.asy.tests.grpc.proto.user.UserServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class UserClient {

    public static void main(String[] args) {
        // Channel is used by the client to communicate with the server using the domain localhost and port 5003.
        // This is the port where our server is starting.
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 5003)
                .usePlaintext()
                .build();

        // Auto generated stub class with the constructor wrapping the channel.
        UserServiceGrpc.UserServiceBlockingStub stub =UserServiceGrpc.newBlockingStub(channel);

        // Start calling the `parkVehicle` method
        CreateUserRequest userRequest = CreateUserRequest.newBuilder()
                .setActive(true)
                .build();

        CreateUserResponse response = stub.createUser(userRequest);
        System.out.println("Response for the first call: " + response.getMessage());
    }

}
