package com.lee.pattern.creational.builder.drink;

import com.lee.pattern.creational.builder.Item;
import com.lee.pattern.creational.builder.packing.Bottle;
import com.lee.pattern.creational.builder.packing.Packing;

/**
 * 冷饮
 *
 * @author lihaiqiang
 * @since 2020/9/2
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
