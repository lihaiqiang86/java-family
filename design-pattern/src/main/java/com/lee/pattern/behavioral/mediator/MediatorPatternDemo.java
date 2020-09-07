package com.lee.pattern.behavioral.mediator;

/**
 * @author lihaiqiang
 * @since 2020/9/7
 */
public class MediatorPatternDemo {

    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
