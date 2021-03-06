package com.lee.pattern.creational.factory;

/**
 * 正方形
 *
 * @author lihaiqiang
 * @since 2020/9/2
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
