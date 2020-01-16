package com.lee.domain;

import java.io.Serializable;

/**
 * @author lihaiqiang
 * @since 2020/1/14
 */
public class LogoutInfo implements Serializable {

    private String userName;

    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
