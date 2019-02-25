package com.ayyovei.user.web;

import com.ayyovei.user.entity.User;
import com.ayyovei.user.service.IUserService;
import com.ayyovei.user.service.impl.UserServiceImpl;
import com.ayyovei.user.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author chenxiaobin
 * @description
 * @create 2019/2/22
 */
@RestController
public class UserController {

    @Autowired
    private IUserService userService;
    @RequestMapping("/getUser/{userName}")
    public Result<User> getUser(@PathVariable String userName){

        return Result.success(userService.findUserByName(userName));
    }
    @RequestMapping("/getUsers")
    public Result<List> getUsers(){
        List<User> users = userService.findUsers();

        return Result.success(users);
    }
}
