package com.lee.pattern.creational.builder.packing;

import com.lee.pattern.creational.builder.packing.Packing;

/**
 * 瓶子包装
 *
 * @author lihaiqiang
 * @since 2020/9/2
 */
public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}
