package com.lw.cn.springbootgit.error;

import com.lw.cn.springbootgit.response.AxiosStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: BigTeapot
 * @date: 2021/12/1
 * @description:
 */
@Data
@NoArgsConstructor
public class GlobalError extends RuntimeException{
    private AxiosStatus axiosStatus;

    public GlobalError(AxiosStatus axiosStatus) {
        this.axiosStatus = axiosStatus;
    }
}
