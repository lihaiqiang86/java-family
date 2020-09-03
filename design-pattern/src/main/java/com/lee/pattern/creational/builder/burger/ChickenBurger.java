package com.lee.pattern.creational.builder.burger;

/**
 * 鸡肉汉堡
 *
 * @author lihaiqiang
 * @since 2020/9/2
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
