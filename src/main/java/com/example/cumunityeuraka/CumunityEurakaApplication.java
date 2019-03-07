package com.example.cumunityeuraka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CumunityEurakaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CumunityEurakaApplication.class, args);
	}
}
