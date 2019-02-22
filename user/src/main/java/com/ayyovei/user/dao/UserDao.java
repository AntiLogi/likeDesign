package com.ayyovei.user.dao;

import com.ayyovei.user.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author chenxiaobin
 * @description
 * @create 2019/2/22
 */
@Repository
public interface UserDao {
    User findByName(String userName);

    List<User> findUsers();
}
