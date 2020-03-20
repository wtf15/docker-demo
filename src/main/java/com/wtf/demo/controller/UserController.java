package com.wtf.demo.controller;

import com.wtf.demo.domain.User;
import com.wtf.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/user",method = {RequestMethod.GET,RequestMethod.POST})
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/listone")
    @ResponseBody
    public User listOne(String username){
        return userService.findByUsername(username);
    }


    @RequestMapping("/listall")
    @ResponseBody
    public List<User> listAll(){
        return userService.listUser();
    }

    @RequestMapping(value="/add",method = RequestMethod.POST)
    @ResponseBody
    public String add(User user){
        int result=userService.insertUser(user);
        if(result>=1){
            return "添加成功";
        }else{
            return "添加失败";
        }
    }
}