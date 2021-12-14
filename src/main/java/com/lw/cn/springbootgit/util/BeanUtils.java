package com.lw.cn.springbootgit.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author: BigTeapot
 * @date: 2021/12/2
 * @description: 从容器中获取Bean
 */
@Component
public class BeanUtils implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        BeanUtils.applicationContext =applicationContext;
    }

    public static <T> T getBean(Class<T> tClass){
        return applicationContext.getBean(tClass);
    }
}
