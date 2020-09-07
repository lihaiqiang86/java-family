package com.lee.pattern.behavioral.visitor;

/**
 * @author lihaiqiang
 * @since 2020/9/7
 */
public class VisitorPatternDemo {

    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
