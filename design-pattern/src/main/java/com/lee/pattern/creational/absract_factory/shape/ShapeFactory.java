package com.lee.pattern.creational.absract_factory.shape;

import com.lee.pattern.creational.absract_factory.AbstractFactory;
import com.lee.pattern.creational.absract_factory.color.Blue;
import com.lee.pattern.creational.absract_factory.color.Color;
import com.lee.pattern.creational.absract_factory.color.Green;
import com.lee.pattern.creational.absract_factory.color.Red;

/**
 * 工厂类
 *
 * @author lihaiqiang
 * @since 2020/9/2
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }
        if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
