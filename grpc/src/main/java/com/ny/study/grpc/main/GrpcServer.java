package com.ny.study.grpc.main;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class GrpcServer {
 
	public static void main(String[] args) {
		
		try {
			Server server=ServerBuilder.forPort(8080).addService(new HelloWorldServer()).build();
			server.start();
			System.out.println("server start at 8080");
			server.awaitTermination();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
    
}
