package com.example.eventdrivendemo.spring;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author : Zhang Huang
 * @description : SMS事件监听处理
 * @date : 2021-08-11 8:39 上午
 * @see org.springframework.context.event.SmartApplicationListener 有序监听
 */
@Component
public class SmsPaymentStatusUpdateListener implements SmartApplicationListener {
    @Override
    public boolean supportsEventType(Class<? extends ApplicationEvent> eventType) {
        return eventType == PaymentStatusUpdateEvent.class;
    }

    @Override
    public boolean supportsSourceType(Class<?> sourceType) {
        return sourceType == PaymentInfo.class;
    }

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("短信服务, 收到支付状态更新的通知. " + event + " - Thread: " + Thread.currentThread().getName());
    }

    // 排序
    @Override
    public int getOrder() {
        return 2;
    }

}
