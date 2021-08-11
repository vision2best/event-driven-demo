package com.example.eventdrivendemo.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @author : Zhang Huang
 * @description : 邮件服务观察者
 * @date : 2021-08-10 8:41 下午
 * @see java.util.Observer
 */
public class MyEmailObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("邮件服务收到通知.jdk");
    }
}
