package com.tianyl.springCloudDemo.feignClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

import com.tianyl.springCloudDemo.feignClient.service.TimeService;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class FeignClientApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FeignClientApplication.class, args);
		TimeService timeService = context.getBean(TimeService.class);
		System.out.println(timeService.time());
	}

}
