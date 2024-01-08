package com.onetoone.onetoone.user.controller;

import com.onetoone.onetoone.response.CustomResponse;
import com.onetoone.onetoone.user.model.User;
import com.onetoone.onetoone.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.UsesSunHttpServer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public CustomResponse<User> save(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping("/get")
    public CustomResponse<List<User>> get(){
        return userService.get();
    }
}
