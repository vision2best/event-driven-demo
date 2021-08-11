package com.example.eventdrivendemo.self;

/**
 * @author : Zhang Huang
 * @description : 库存服务观察者
 * @date : 2021-08-10 8:35 下午
 */
public class MyStockObserver implements Observer {
    @Override
    public void update() {
        System.out.println("库存服务收到通知.self");
    }
}
