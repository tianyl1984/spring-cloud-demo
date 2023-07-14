package com.tianyl.demo.userservice.controller;

import com.tianyl.demo.user.api.UserApi;
import com.tianyl.demo.user.api.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController implements UserApi {

    @GetMapping("/list")
    public List<UserDto> list() {
        return Arrays.asList(new UserDto("zhangsan", 12), new UserDto("李四", 34));
    }

    @GetMapping("/get")
    public UserDto get(@RequestParam(name = "id") Long id) {
        return new UserDto("lisi", 23);
    }
}
