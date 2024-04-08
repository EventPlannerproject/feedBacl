package com.java.feedBack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FeedBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeedBackApplication.class, args);
	}

}
