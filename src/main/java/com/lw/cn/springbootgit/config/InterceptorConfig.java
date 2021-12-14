package com.lw.cn.springbootgit.config;

import com.lw.cn.springbootgit.interceptor.HelloInterceptor;
import com.lw.cn.springbootgit.interceptor.WordInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author: BigTeapot
 * @date: 2021/11/30
 * @description:
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new HelloInterceptor()).addPathPatterns("/**").order(2);
        registry.addInterceptor(new WordInterceptor()).addPathPatterns("/**").order(1);
    }
}
