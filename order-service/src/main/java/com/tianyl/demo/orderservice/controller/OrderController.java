package com.tianyl.demo.orderservice.controller;

import com.tianyl.demo.orderservice.vo.OrderVo;
import com.tianyl.demo.user.api.UserApi;
import com.tianyl.demo.user.api.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private UserApi userApi;

    @GetMapping("/list")
    public List<OrderVo> list() {
        UserDto user = userApi.get(1L);
        return List.of(new OrderVo(1L, "商品A", user.getName()));
    }

}
