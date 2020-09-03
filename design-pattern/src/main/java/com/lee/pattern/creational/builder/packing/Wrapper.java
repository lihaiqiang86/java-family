package com.lee.pattern.creational.builder.packing;

import com.lee.pattern.creational.builder.packing.Packing;

/**
 * 纸包装
 *
 * @author lihaiqiang
 * @since 2020/9/2
 */
public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
}
