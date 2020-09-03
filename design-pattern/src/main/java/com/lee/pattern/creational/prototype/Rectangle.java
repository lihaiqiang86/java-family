package com.lee.pattern.creational.prototype;

/**
 * @author lihaiqiang
 * @since 2020/9/2
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
