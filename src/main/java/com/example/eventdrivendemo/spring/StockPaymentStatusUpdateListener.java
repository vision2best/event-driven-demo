package com.example.eventdrivendemo.spring;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author : Zhang Huang
 * @description : 库存服务事件监听处理
 * @date : 2021-08-11 8:36 上午
 * @see org.springframework.context.ApplicationListener 无序监听
 */
@Component
public class StockPaymentStatusUpdateListener implements ApplicationListener<PaymentStatusUpdateEvent> {
    @Override
    public void onApplicationEvent(PaymentStatusUpdateEvent event) {
        System.out.println("库存服务, 收到支付状态更新的事件. " + event + " - Thread: " + Thread.currentThread().getName());
    }
}
