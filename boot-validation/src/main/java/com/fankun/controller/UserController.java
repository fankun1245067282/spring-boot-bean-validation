package com.fankun.controller;

import com.fankun.domain.User;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * web控制器
 */
@RestController
public class UserController {


    @PostMapping("/user/save") //@Valid是为了走校验
    public User save(@Valid @RequestBody User user){
        return user;
    }

    @PostMapping("/user/save2") //@Valid是为了走校验
    public User save2(@RequestBody User user){
        Assert.hasText("名称不能为空！",user.getName());
        return user;
    }
}
