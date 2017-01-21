package com.tianyl.springCloudDemo.feignClient.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "SERVICE1", fallback = FailTimeClient.class)
public interface TimeClient {

	@RequestMapping("time")
	public String time();

}
