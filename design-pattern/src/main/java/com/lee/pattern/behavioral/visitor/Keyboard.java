package com.lee.pattern.behavioral.visitor;

/**
 * @author lihaiqiang
 * @since 2020/9/7
 */
public class Keyboard implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
