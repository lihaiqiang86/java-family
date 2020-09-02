package com.lee.pattern.creational.absract_factory.color;

import com.lee.pattern.creational.absract_factory.AbstractFactory;
import com.lee.pattern.creational.absract_factory.shape.Shape;

/**
 * 工厂类
 *
 * @author lihaiqiang
 * @since 2020/9/2
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }
}
