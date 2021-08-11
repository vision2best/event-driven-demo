package com.example.eventdrivendemo.javabean;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * @author : Zhang Huang
 * @description : 库存服务观察者
 * @date : 2021-08-10 8:35 下午
 */
public class MyStockObserver implements PropertyChangeListener {
    public void update() {
        System.out.println("库存服务收到通知.javabean");
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.printf("库存服务收到通知.javabean. %s \n", evt.getNewValue());

    }
}
