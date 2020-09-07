package com.lee.pattern.behavioral.strategy;

/**
 * @author lihaiqiang
 * @since 2020/9/7
 */
public class OperationAdd implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
