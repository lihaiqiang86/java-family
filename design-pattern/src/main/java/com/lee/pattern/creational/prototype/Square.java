package com.lee.pattern.creational.prototype;

/**
 * @author lihaiqiang
 * @since 2020/9/2
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
