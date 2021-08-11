package com.example.eventdrivendemo.self;

import java.util.List;
import java.util.Vector;

/**
 * @author : Zhang Huang
 * @description : 更改支付状态的被观察者 事件源
 * @date : 2021-08-10 8:32 下午
 */
public class MyPaymentStatusUpdateSubject implements Subject {

    private List<Observer> observers = new Vector<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void updatePaymentStatus(int newStatus) {

        // 业务逻辑操作
        System.out.println("更新新的支付状态为：" + newStatus);

        // 通知观察者
        this.notifyObservers();
    }

}
