package com.lee.pattern.behavioral.chain_of_responsibility;

/**
 * @author lihaiqiang
 * @since 2020/9/5
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
