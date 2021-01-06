package com.lee.protobuf;

import com.lee.protobuf.message.User;

/**
 * @author lihaiqiang
 * @since 2021/1/6
 */
public class Test {

    public static void main(String[] args) {
        User.LoginMessage.Builder loginMsgBuilder = User.LoginMessage.newBuilder();
        loginMsgBuilder.setUserName("lee");
        loginMsgBuilder.setPassword("123456");
        System.out.println(loginMsgBuilder.build().toString());

        loginMsgBuilder.clear();
        loginMsgBuilder.setPassword("654321");
        System.out.println(loginMsgBuilder.build().toString());

        //
        User.LogoutMessage.Builder logoutMsgBuilder = User.LogoutMessage.newBuilder();
        logoutMsgBuilder.setUserName("lee");
        logoutMsgBuilder.setPassword("123456");
        System.out.println(logoutMsgBuilder.build().toString());
    }
}
