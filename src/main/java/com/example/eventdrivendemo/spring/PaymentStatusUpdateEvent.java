package com.example.eventdrivendemo.spring;

import org.springframework.context.ApplicationEvent;

/**
 * @author : Zhang Huang
 * @description : 支付状态更新的事件
 * @date : 2021-08-11 8:35 上午
 * @see org.springframework.context.ApplicationEvent
 */
public class PaymentStatusUpdateEvent extends ApplicationEvent {
    public PaymentStatusUpdateEvent(PaymentInfo source) {
        super(source);
    }
}
