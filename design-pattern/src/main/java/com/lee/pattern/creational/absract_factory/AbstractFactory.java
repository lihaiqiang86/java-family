package com.lee.pattern.creational.absract_factory;

import com.lee.pattern.creational.absract_factory.color.Color;
import com.lee.pattern.creational.absract_factory.shape.Shape;

/**
 * @author lihaiqiang
 * @since 2020/9/2
 */
public abstract class AbstractFactory {

    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
