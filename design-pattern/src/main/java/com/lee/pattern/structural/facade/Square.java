package com.lee.pattern.structural.facade;

/**
 * @author lihaiqiang
 * @since 2020/9/4
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
