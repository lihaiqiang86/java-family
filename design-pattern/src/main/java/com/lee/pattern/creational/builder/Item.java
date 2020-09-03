package com.lee.pattern.creational.builder;

import com.lee.pattern.creational.builder.packing.Packing;

/**
 * 食物条目接口
 *
 * @author lihaiqiang
 * @since 2020/9/2
 */
public interface Item {

    String name();

    Packing packing();

    float price();
}
