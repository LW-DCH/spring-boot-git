package com.lw.cn.springbootgit.config;

import com.lw.cn.springbootgit.filter.OneFilter;
import com.lw.cn.springbootgit.filter.TwoFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;

/**
 * @author: BigTeapot
 * @date: 2021/11/30
 * @description:
 */
@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<OneFilter> oneFilter1(){
        FilterRegistrationBean<OneFilter> oneFilterFilterRegistrationBean = new FilterRegistrationBean<>();
        oneFilterFilterRegistrationBean.setFilter(new OneFilter());
        oneFilterFilterRegistrationBean.addUrlPatterns("/*");
        oneFilterFilterRegistrationBean.setOrder(Ordered.LOWEST_PRECEDENCE-1);
        return oneFilterFilterRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean<TwoFilter> twoFilter2(){
        FilterRegistrationBean<TwoFilter> twoFilterFilterRegistrationBean = new FilterRegistrationBean<>();
        twoFilterFilterRegistrationBean.setFilter(new TwoFilter());
        twoFilterFilterRegistrationBean.addUrlPatterns("/*");
        twoFilterFilterRegistrationBean.setOrder(Ordered.LOWEST_PRECEDENCE-2);
        return twoFilterFilterRegistrationBean;
    }
}
