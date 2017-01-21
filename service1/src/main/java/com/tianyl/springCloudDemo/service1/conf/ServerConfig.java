package com.tianyl.springCloudDemo.service1.conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServerConfig {

	@Value("${aaaaa}")
	private String aaaaa;

	public String getAaaaa() {
		return aaaaa;
	}

	public void setAaaaa(String aaaaa) {
		this.aaaaa = aaaaa;
	}

}
