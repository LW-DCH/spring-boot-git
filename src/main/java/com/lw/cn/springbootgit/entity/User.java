package com.lw.cn.springbootgit.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: BigTeapot
 * @date: 2021/11/30
 * @description:
 */
@Data
@NoArgsConstructor
public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
