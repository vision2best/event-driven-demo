package com.example.eventdrivendemo.self;

/**
 * @author : Zhang Huang
 * @description : TODO
 * @date : 2021-08-10 8:35 下午
 */
public class Main {
    public static void main(String[] args) {
        // "支付状态更新"->看做一个事件，可以被监听的事件
        // 被观察者。即事件源
        MyPaymentStatusUpdateSubject subject = new MyPaymentStatusUpdateSubject();

        // 观察者。即事件监听器
        MyEmailObserver emailObserver = new MyEmailObserver();
        MyStockObserver stockObserver = new MyStockObserver();

        // 添加观察者
        subject.addObserver(emailObserver);
        subject.addObserver(stockObserver);

        // 发布事件。支付状态更新
        subject.updatePaymentStatus(2);
    }
}
