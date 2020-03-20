package com.wtf.demo.service;

import com.wtf.demo.dao.UserMapper;
import com.wtf.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findByUsername(String username) {
        return userMapper.find(username);
    }

    public List<User> listUser() {
        return userMapper.list();
    }


    public int insertUser(User user) {
        return userMapper.insert(user);
    }
}
