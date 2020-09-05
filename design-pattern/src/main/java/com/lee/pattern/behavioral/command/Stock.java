package com.lee.pattern.behavioral.command;

/**
 * 请求类
 *
 * @author lihaiqiang
 * @since 2020/9/5
 */
public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("Stock [ Name: " + name + ",Quantity:" + quantity + " ]bought ");
    }

    public void sell() {
        System.out.println("Stock [ Name: " + name + ",Quantity:" + quantity + " ]sold ");
    }
}
