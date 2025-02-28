package com.gulshan.insurance.dto;

import org.springframework.stereotype.Component;

// T is used for generic type. T allows data to store any object type, making ResponseStructure reusable for Claim, Client, InsurancePolicy, etc.
@Component
public class ResponseStructure<T> {

    private int statusCode;
    private String msg;
    private T data;

    public int getStatusCode() {
        return statusCode;
    }
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }


}