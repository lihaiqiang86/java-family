package com.lee.pattern.creational.builder.drink;

/**
 * 可口可乐
 *
 * @author lihaiqiang
 * @since 2020/9/2
 */
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
