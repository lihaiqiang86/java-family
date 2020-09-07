package com.lee.pattern.behavioral.observer;

/**
 * @author lihaiqiang
 * @since 2020/9/7
 */
public abstract class Observer {

    protected Subject subject;

    public abstract void update();
}
