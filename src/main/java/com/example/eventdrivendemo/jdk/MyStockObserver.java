package com.example.eventdrivendemo.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @author : Zhang Huang
 * @description : 库存服务观察者
 * @date : 2021-08-10 8:41 下午
 * @see java.util.Observer
 */
public class MyStockObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("库存服收到通知.jdk");
    }
}
