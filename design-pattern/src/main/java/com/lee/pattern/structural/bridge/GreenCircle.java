package com.lee.pattern.structural.bridge;

/**
 * @author lihaiqiang
 * @since 2020/9/3
 */
public class GreenCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
