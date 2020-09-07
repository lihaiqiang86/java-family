package com.lee.pattern.behavioral.mediator;

import java.util.Date;

/**
 * @author lihaiqiang
 * @since 2020/9/7
 */
public class ChatRoom {

    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
