
# Experimental gRPC Demo
This project is intended to demonstrate how gRPC works.

This example project uses [proto3](https://protobuf.dev/programming-guides/proto3/).

## gRPC Compilation

See [What is gRPC](https://grpc.io/docs/what-is-grpc/introduction/)

protobuf-maven-plugin is responsible for Java gRPC code generation.

### Protobuf Class Generation
To manually generate codes, add protoc to system path then from terminal go to resources/proto and run this command:

`protoc *.proto --java_out=../../java`

It generates corresponding java file(s) under given location.
