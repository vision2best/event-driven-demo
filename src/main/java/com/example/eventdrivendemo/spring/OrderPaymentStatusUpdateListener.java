package com.example.eventdrivendemo.spring;

import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author : Zhang Huang
 * @description : 利用注解的形式实现定边服务监听
 * @date : 2021-08-11 10:20 上午
 */
@Component
public class OrderPaymentStatusUpdateListener {
    @EventListener(classes = {PaymentStatusUpdateEvent.class})
    @Async //异步监听
    @Order(0)//使用order指定顺序，越小优先级越高
    public void eventListener(PaymentStatusUpdateEvent event) {
        System.out.println("订单服务, 收到支付状态更新的通知. " + event + " - Thread: " + Thread.currentThread().getName());
    }
}
