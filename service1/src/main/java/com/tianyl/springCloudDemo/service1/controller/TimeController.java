package com.tianyl.springCloudDemo.service1.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tianyl.springCloudDemo.service1.util.WebUtil;

@RestController
public class TimeController {

	@RequestMapping("/time")
	@ResponseBody
	public String time(HttpServletRequest req) {
		System.out.println("请求时间");
		WebUtil.printHeader(req);
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA).format(new Date());
	}

}
