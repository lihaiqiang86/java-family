package com.lee.pattern.creational.builder.drink;

/**
 * 百事可乐
 *
 * @author lihaiqiang
 * @since 2020/9/2
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
