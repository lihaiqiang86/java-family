package com.lee.pattern.behavioral.null_object;

/**
 * @author lihaiqiang
 * @since 2020/9/7
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}
