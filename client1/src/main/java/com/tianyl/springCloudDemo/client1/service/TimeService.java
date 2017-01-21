package com.tianyl.springCloudDemo.client1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class TimeService {

	@Autowired
	private RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "callFail")
	public String time() {
		return restTemplate.getForEntity("http://SERVICE1/time", String.class).getBody();
	}

	public String callFail() {
		return "call fail";
	}

}
