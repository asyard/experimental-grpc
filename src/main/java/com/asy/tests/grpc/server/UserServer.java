package com.asy.tests.grpc.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class UserServer {

    public static void main(String[] args) throws IOException, InterruptedException {

        Server server = ServerBuilder.forPort(5003)
                .addService(new UserServiceImpl())
                .build();

        server.start();

        // Server is kept alive for the client to communicate.
        server.awaitTermination();
    }
}
