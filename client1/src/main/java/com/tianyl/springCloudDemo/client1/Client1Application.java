package com.tianyl.springCloudDemo.client1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

import com.tianyl.springCloudDemo.client1.service.TimeService;

@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
public class Client1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Client1Application.class, args);
		TimeService timeService = context.getBean(TimeService.class);
		System.out.println(timeService.time());
		context.close();
	}

}
