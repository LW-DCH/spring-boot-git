package com.lw.cn.springbootgit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: BigTeapot
 * @date: 2021/11/29
 * @description:
 */

@RestController
public class HelloWord {

    @GetMapping("hello")
    public String hello(){
        return "Hello Spring Boot";
    }
}
