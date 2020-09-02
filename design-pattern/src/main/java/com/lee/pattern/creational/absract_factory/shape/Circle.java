package com.lee.pattern.creational.absract_factory.shape;

/**
 * 圆
 *
 * @author lihaiqiang
 * @since 2020/9/2
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
