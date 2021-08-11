package com.example.eventdrivendemo.jdk;

import java.util.Observable;

/**
 * @author : Zhang Huang
 * @description : 支付状态改变被观察者 事件源
 * @date : 2021-08-10 8:43 下午
 * @see java.util.Observable
 */
public class MyPaymentStatusUpdateSubject extends Observable {

    public void updatePaymentStatus(int newStatus) {
        // 业务逻辑操作
        System.out.println("更新新的支付状态为：" + newStatus);

        // 通知观察者
        this.setChanged();//需要调用一下这这方法，表示被观察者的状态已发生变更，Observable才会通知观察者
        this.notifyObservers();
    }

}
