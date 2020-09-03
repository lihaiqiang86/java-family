package com.lee.pattern.creational.builder.burger;

/**
 * 蔬菜汉堡
 *
 * @author lihaiqiang
 * @since 2020/9/2
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
