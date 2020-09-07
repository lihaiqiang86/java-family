package com.lee.pattern.behavioral.null_object;

/**
 * @author lihaiqiang
 * @since 2020/9/7
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNil() {
        return false;
    }
}
