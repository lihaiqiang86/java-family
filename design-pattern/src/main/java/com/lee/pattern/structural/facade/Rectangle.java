package com.lee.pattern.structural.facade;

/**
 * @author lihaiqiang
 * @since 2020/9/4
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
