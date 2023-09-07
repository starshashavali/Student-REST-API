package com.gis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient

public class StudentRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentRestApiApplication.class, args);
	}

}
