package com.ayyovei.user.service.impl;

import com.ayyovei.user.dao.UserDao;
import com.ayyovei.user.entity.User;
import com.ayyovei.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chenxiaobin
 * @description
 * @create 2019/2/22
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao;
    @Override
    public User findUserByName(String userName) {
        return userDao.findByName(userName);
    }

    @Override
    public List<User> findUsers() {
        return userDao.findUsers();
    }
}
