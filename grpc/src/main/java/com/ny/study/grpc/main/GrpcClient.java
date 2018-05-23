package com.ny.study.grpc.main;

import java.util.concurrent.ExecutionException;

import com.google.common.util.concurrent.ListenableFuture;

import biz.shxn.grpcDemo.entity.GreeterGrpc;
import biz.shxn.grpcDemo.entity.HelloReply;
import biz.shxn.grpcDemo.entity.HelloRequest;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HelloRequest helloRequest=HelloRequest.newBuilder().setName("xiao min121556564df").build();   
       final  ManagedChannel mc=ManagedChannelBuilder.forAddress("localhost", 8080).usePlaintext(true).build();
      //  GreeterGrpc.GreeterBlockingStub stub= GreeterGrpc.newBlockingStub(mc);
        GreeterGrpc.GreeterFutureStub stub=GreeterGrpc.newFutureStub(mc);
       ListenableFuture<HelloReply> response=stub.sayHello(helloRequest);
       try {
		System.out.println(response.get().toString());
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ExecutionException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 }

}
