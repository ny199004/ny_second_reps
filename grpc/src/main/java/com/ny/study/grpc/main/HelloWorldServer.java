package com.ny.study.grpc.main;

import biz.shxn.grpcDemo.entity.GreeterGrpc.GreeterImplBase;
import biz.shxn.grpcDemo.entity.HelloReply;
import biz.shxn.grpcDemo.entity.HelloRequest;
import io.grpc.stub.StreamObserver;

public class HelloWorldServer extends GreeterImplBase {

	@Override
	public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
		// TODO Auto-generated method stub
	   //	super.sayHello(request, responseObserver);
		HelloReply helloReply=HelloReply.newBuilder().setMessage("Hello,"+request.getName()).build();
		responseObserver.onNext(helloReply);
		responseObserver.onCompleted();
	}

}
