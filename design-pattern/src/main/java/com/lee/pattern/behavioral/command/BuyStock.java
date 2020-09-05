package com.lee.pattern.behavioral.command;

/**
 * 实现了 Order 接口的实体类
 *
 * @author lihaiqiang
 * @since 2020/9/5
 */
public class BuyStock implements Order {

    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
