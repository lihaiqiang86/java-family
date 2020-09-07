package com.lee.pattern.behavioral.visitor;

/**
 * @author lihaiqiang
 * @since 2020/9/7
 */
public interface ComputerPartVisitor {

    void visit(Computer computer);

    void visit(Mouse mouse);

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);
}
