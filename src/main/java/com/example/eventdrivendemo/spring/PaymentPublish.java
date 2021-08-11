package com.example.eventdrivendemo.spring;

import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

/**
 * @author : Zhang Huang
 * @description : 发布事件
 * @date : 2021-08-11 8:51 上午
 * @see org.springframework.context.ApplicationEventPublisherAware
 * @see ApplicationContextAware
 */
@Service
public class PaymentPublish implements ApplicationEventPublisherAware {


    private ApplicationEventPublisher applicationEventPublisher;


    public void publishEvent(ApplicationEvent event) {
        System.out.println("into My Publisher's method");
        applicationEventPublisher.publishEvent(event);
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}
