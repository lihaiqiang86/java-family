package com.lee.pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令调用类
 *
 * @author lihaiqiang
 * @since 2020/9/5
 */
public class Broker {

    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
