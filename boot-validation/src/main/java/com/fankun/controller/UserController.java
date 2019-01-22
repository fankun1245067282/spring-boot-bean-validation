package com.fankun.controller;

import com.fankun.domain.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * web控制器
 */
@RestController
public class UserController {


    @PostMapping("/user/save")
    public User save(@Valid @RequestBody User user){
        return user;
    }
}
