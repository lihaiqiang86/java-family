package com.lee.pattern.creational.absract_factory;

import com.lee.pattern.creational.absract_factory.color.ColorFactory;
import com.lee.pattern.creational.absract_factory.shape.ShapeFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
