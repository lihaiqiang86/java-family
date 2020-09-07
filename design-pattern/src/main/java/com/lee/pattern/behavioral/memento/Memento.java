package com.lee.pattern.behavioral.memento;

/**
 * @author lihaiqiang
 * @since 2020/9/7
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
