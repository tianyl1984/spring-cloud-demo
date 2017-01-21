package com.tianyl.springCloudDemo.service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

import com.tianyl.springCloudDemo.service1.conf.ServerConfig;

@SpringBootApplication
@EnableDiscoveryClient
public class Service1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Service1Application.class, args);
		ServerConfig config = context.getBean(ServerConfig.class);
		System.out.println(config.getAaaaa());
	}

}
