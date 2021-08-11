package com.example.eventdrivendemo.spring;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author : Zhang Huang
 * @description : Mail事件监听处理
 * @date : 2021-08-11 8:37 上午
 */
@Component
public class MailPaymentStatusUpdateListener implements SmartApplicationListener {

    @Override
    public boolean supportsEventType(Class<? extends ApplicationEvent> aClass) {
        return aClass == PaymentStatusUpdateEvent.class;
    }

    @Override
    public boolean supportsSourceType(Class<?> sourceType) {
        return sourceType == PaymentInfo.class;
    }

    @Override
    public int getOrder() {
        return 1;
    }

    @Override
    public String getListenerId() {
        return SmartApplicationListener.super.getListenerId();
    }

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("邮件服务, 收到支付状态更新的通知. " + event + " - Thread: " + Thread.currentThread().getName());
    }
}
