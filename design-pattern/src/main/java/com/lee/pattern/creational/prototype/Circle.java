package com.lee.pattern.creational.prototype;

/**
 * @author lihaiqiang
 * @since 2020/9/2
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
