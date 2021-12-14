package com.lw.cn.springbootgit.config;

import com.lw.cn.springbootgit.error.GlobalError;
import com.lw.cn.springbootgit.response.ResponseData;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author: BigTeapot
 * @date: 2021/12/1
 * @description:
 */

@RestControllerAdvice
public class ErrorConfig {

    @ExceptionHandler(GlobalError.class)
    public ResponseData globalError(GlobalError error){
        if (error.getAxiosStatus()!=null) {
            return ResponseData.fail(error.getAxiosStatus());
        }
        return ResponseData.fail();
    }

}
