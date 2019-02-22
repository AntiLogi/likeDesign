package com.ayyovei.user.service.impl;

import com.ayyovei.user.entity.User;
import com.ayyovei.user.service.IUserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * @author chenxiaobin
 * @description
 * @create 2019/2/22
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceImplTest {
    @Autowired
    private IUserService userService;

    @Test
    public void findUserByName() {
        User mike = userService.findUserByName("mike");
        Assert.assertThat(mike.getMobile(),is("18600002408"));
    }

    @Test
    public void findUsers() {
        List<User> users = userService.findUsers();
        Assert.assertThat(users.size(), is(1));

    }
}