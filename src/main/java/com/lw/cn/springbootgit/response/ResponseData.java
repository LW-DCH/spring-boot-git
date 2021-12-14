package com.lw.cn.springbootgit.response;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.HashMap;

/**
 * @author: BigTeapot
 * @date: 2021/11/30
 * @description:
 */
@Data
@ToString
@NoArgsConstructor
public class ResponseData extends HashMap<String, Object> {

    public static final String STATUS = "status";
    public static final String MESSAGE = "message";
    public static final String DATA = "data";


    private ResponseData(AxiosStatus axiosStatus) {
        super.put(STATUS, axiosStatus.getStatus());
        super.put(MESSAGE, axiosStatus.getMessage());
    }

    public static ResponseData success() {
        return new ResponseData(AxiosStatus.OK);
    }

    public static ResponseData success(AxiosStatus axiosStatus) {
        return new ResponseData(axiosStatus);
    }

    public static ResponseData success(Object data) {
        ResponseData responseData = new ResponseData(AxiosStatus.OK);
        responseData.put(DATA, data);
        return responseData;
    }

    public static ResponseData success(AxiosStatus axiosStatus, Object data) {
        ResponseData responseData = new ResponseData(axiosStatus);
        responseData.put(DATA, data);
        return responseData;
    }

    public static ResponseData fail() {
        return new ResponseData(AxiosStatus.ERROR);
    }

    public static ResponseData fail(AxiosStatus axiosStatus) {
        return new ResponseData(axiosStatus);
    }

    public static ResponseData fail(Object data) {
        ResponseData responseData = new ResponseData(AxiosStatus.ERROR);
        responseData.put(DATA, data);
        return responseData;
    }

    public static ResponseData fail(AxiosStatus axiosStatus, Object obj) {
        ResponseData responseData = new ResponseData(axiosStatus);
        responseData.put(DATA, obj);
        return responseData;
    }


}
