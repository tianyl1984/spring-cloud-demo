package com.tianyl.springCloudDemo.feignClient.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("SERVICE1")
public interface TimeClient {

	@RequestMapping("time")
	public String time();

}
