package com.ayyovei.user.service;

import com.ayyovei.user.entity.User;

import java.util.List;

/**
 * @author chenxiaobin
 * @description
 * @create 2019/2/22
 */
public interface IUserService {

    User findUserByName(String userName);

    List<User> findUsers();

 }
