package com.tianyl.springCloudDemo.feignClient.client;

import org.springframework.stereotype.Component;

@Component
public class FailTimeClient implements TimeClient {

	@Override
	public String time() {
		return "fail call time";
	}

}
