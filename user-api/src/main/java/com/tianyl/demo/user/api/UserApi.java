package com.tianyl.demo.user.api;

import com.tianyl.demo.user.api.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "user-app", path = "/user")
public interface UserApi {

    @GetMapping("/list")
    public List<UserDto> list();

    @GetMapping("/get")
    public UserDto get(@RequestParam(name = "id") Long id);
}
