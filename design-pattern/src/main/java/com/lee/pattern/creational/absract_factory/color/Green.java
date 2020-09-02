package com.lee.pattern.creational.absract_factory.color;

/**
 * 红色
 *
 * @author lihaiqiang
 * @since 2020/9/2
 */
public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
