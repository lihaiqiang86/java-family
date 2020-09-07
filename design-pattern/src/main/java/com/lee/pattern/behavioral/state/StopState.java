package com.lee.pattern.behavioral.state;

/**
 * @author lihaiqiang
 * @since 2020/9/7
 */
public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}
