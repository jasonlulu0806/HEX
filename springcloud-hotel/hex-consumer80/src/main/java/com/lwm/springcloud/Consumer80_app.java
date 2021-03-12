package com.lwm.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("com.lwm.springcloud.dao")
@EnableEurekaClient
public class Consumer80_app {

	public static void main(String[] args) {
		SpringApplication.run(Consumer80_app.class, args);
	}
}
