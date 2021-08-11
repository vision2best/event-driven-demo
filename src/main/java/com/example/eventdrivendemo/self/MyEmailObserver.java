package com.example.eventdrivendemo.self;

/**
 * @author : Zhang Huang
 * @description : 邮件服务观察者
 * @date : 2021-08-10 8:34 下午
 */
public class MyEmailObserver implements Observer {
    @Override
    public void update() {
        System.out.println("邮件服务收到通知.self");
    }
}
