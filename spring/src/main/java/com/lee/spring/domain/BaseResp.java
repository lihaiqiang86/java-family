package com.lee.spring.domain;

import java.io.Serializable;

/**
 * @author lihaiqiang
 * @since 2020/1/14
 */
public class BaseResp implements Serializable {

    private String code;

    private String desc;

    private Object data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
