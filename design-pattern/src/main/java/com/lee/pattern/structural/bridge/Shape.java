package com.lee.pattern.structural.bridge;

/**
 * @author lihaiqiang
 * @since 2020/9/3
 */
public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
