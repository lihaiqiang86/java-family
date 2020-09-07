package com.lee.pattern.behavioral.state;

/**
 * @author lihaiqiang
 * @since 2020/9/7
 */
public class Context {

    private State state;

    public Context() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
