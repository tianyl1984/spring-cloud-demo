package com.tianyl.springCloudDemo.feignClient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tianyl.springCloudDemo.feignClient.client.TimeClient;

@Service
public class TimeService {

	@Autowired
	private TimeClient timeClient;

	public String time() {
		return timeClient.time();
	}
}
