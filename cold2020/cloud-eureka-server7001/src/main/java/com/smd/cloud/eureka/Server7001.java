package com.smd.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Server7001
{
	public static void main(String[] args)
	{
		SpringApplication.run(Server7001.class,args);
	}
}
