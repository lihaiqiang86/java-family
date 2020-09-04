package com.lee.pattern.structural.decorator;

/**
 * @author lihaiqiang
 * @since 2020/9/4
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
