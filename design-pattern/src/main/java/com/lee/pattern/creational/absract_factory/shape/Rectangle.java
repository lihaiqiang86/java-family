package com.lee.pattern.creational.absract_factory.shape;

/**
 * 矩形
 *
 * @author lihaiqiang
 * @since 2020/9/2
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
