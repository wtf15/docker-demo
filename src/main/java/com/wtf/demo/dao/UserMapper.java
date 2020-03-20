package com.wtf.demo.dao;


import com.wtf.demo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {

    User find(String username);
    List<User> list();
    int insert(User user);
}
