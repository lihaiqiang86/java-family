package com.lee.pattern.behavioral.visitor;

/**
 * @author lihaiqiang
 * @since 2020/9/7
 */
public interface ComputerPart {

    void accept(ComputerPartVisitor computerPartVisitor);
}
