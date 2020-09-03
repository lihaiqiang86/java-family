package com.lee.pattern.creational.builder.burger;

import com.lee.pattern.creational.builder.Item;
import com.lee.pattern.creational.builder.packing.Packing;
import com.lee.pattern.creational.builder.packing.Wrapper;

/**
 * 汉堡
 *
 * @author lihaiqiang
 * @since 2020/9/2
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
