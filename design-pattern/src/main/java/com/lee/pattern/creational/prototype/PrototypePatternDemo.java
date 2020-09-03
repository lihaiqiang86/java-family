package com.lee.pattern.creational.prototype;

/**
 * @author lihaiqiang
 * @since 2020/9/2
 */
public class PrototypePatternDemo {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape11 = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape11.getType());
        System.out.println("Cloned hash code : " + clonedShape11.hashCode());
        clonedShape11.draw();
        System.out.println("===========================================================");
        Shape clonedShape12 = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape12.getType());
        System.out.println("Cloned hash code : " + clonedShape12.hashCode());
        clonedShape12.draw();

        System.out.println("\n\n");

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());
        System.out.println("Cloned hash code : " + clonedShape2.hashCode());
        clonedShape2.draw();

        System.out.println("\n\n");

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
        System.out.println("Cloned hash code : " + clonedShape3.hashCode());
        clonedShape3.draw();
    }
}
