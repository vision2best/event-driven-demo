package com.example.eventdrivendemo.javabean;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * @author : Zhang Huang
 * @description : 邮件服务观察者
 * @date : 2021-08-10 8:52 下午
 * @see java.beans.PropertyChangeListener
 */
public class MyEmailObserver implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        Payment source = (Payment) evt.getSource();
        System.out.printf("库存服务收到通知.javabean. %s \n", source.getStatus());
    }
}
