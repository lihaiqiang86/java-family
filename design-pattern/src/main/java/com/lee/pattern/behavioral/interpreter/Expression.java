package com.lee.pattern.behavioral.interpreter;

/**
 * 一个表达式接口
 *
 * @author lihaiqiang
 * @since 2020/9/5
 */
public interface Expression {

    boolean interpret(String context);
}
