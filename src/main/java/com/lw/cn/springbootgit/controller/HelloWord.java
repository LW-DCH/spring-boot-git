package com.lw.cn.springbootgit.controller;

import com.lw.cn.springbootgit.entity.User;
import com.lw.cn.springbootgit.error.GlobalError;
import com.lw.cn.springbootgit.response.AxiosStatus;
import lombok.extern.slf4j.Slf4j;
import org.omg.CORBA.INTERNAL;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.annotation.WebFilter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: BigTeapot
 * @date: 2021/11/29
 * @description:
 */
@Slf4j
@RestController
public class HelloWord {

    @GetMapping("hello")
    public String hello(){

        return "Hello Spring Boot";
    }


    @GetMapping("user")
    public User user(){
        User user = new User("张三",10);
        return user;
    }


    @GetMapping("user1")
    public List<User> user1(){
        User user = new User("张三",10);
        User user1 = new User("李四",20);
        ArrayList<User> users = new ArrayList<>();
        users.add(user);
        users.add(user1);
        return users;
    }

    @GetMapping("error")
    public String error(){
        throw new GlobalError(AxiosStatus.EXT_ERROR);
    }

    @GetMapping("error1")
    public int error1(){
        int a=0;

        try {
            a=10/0;
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalError(AxiosStatus.ERROR);
        }
        return a;
    }
}
