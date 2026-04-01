package com.jayson.socialfeed.controller;

import com.jayson.socialfeed.model.User;
import com.jayson.socialfeed.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    public UserController(UserService userService) {

        this.userService = userService;
    }

    @PostMapping("/register")
    public User register(@RequestBody User user) {

        return  userService.register(user);
    }
}