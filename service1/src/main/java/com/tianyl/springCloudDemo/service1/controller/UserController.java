package com.tianyl.springCloudDemo.service1.controller;

import com.tianyl.springCloudDemo.service1.model.User;
import com.tianyl.springCloudDemo.service1.view.BaseResponse;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/users")
public class UserController {

    //curl http://127.0.0.1:6666/users/
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public BaseResponse getUserList() {
        return new BaseResponse(Arrays.asList(new User(1L, "aaaa"), new User(2L, "bbbb")));
    }

    //curl http://127.0.0.1:6666/users/ -X POST --data "name=1231"
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public BaseResponse saveUser(@ModelAttribute User user) {
        System.out.println("save:" + user.getName());
        return new BaseResponse(null);
    }

    //curl http://127.0.0.1:6666/users/123
    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    public BaseResponse get(@PathVariable Long userId) {
        return new BaseResponse(new User(userId, "ccccc"));
    }

    //curl http://127.0.0.1:6666/users/123 -X DELETE
    @RequestMapping(value = "/{userId}", method = RequestMethod.DELETE)
    public BaseResponse delete(@PathVariable Long userId) {
        System.out.println("delete:" + userId);
        return new BaseResponse("delete success");
    }

    //curl http://127.0.0.1:6666/users/123 -X PUT --data "{\"name\":\"aaabbb\"}" --header "Content-Type:application/json"
    @RequestMapping(value = "/{userId}", method = RequestMethod.PUT)
    public BaseResponse update(@PathVariable Long userId, @RequestBody User user) {
        System.out.println("update:" + user.getName());
        return new BaseResponse("update success");
    }

}
