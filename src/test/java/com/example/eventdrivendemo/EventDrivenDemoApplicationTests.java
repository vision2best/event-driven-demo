package com.example.eventdrivendemo;

import com.example.eventdrivendemo.spring.PaymentInfo;
import com.example.eventdrivendemo.spring.PaymentPublish;
import com.example.eventdrivendemo.spring.PaymentStatusUpdateEvent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class EventDrivenDemoApplicationTests {

    @Autowired
    ApplicationContext context;

    @Test
    void contextLoads() {

    }

    @Test
    void springEvent() {
        PaymentPublish paymentService = (PaymentPublish) context.getBean("paymentPublish");
        PaymentInfo paymentInfo = new PaymentInfo();
        paymentInfo.setId(1);
        paymentInfo.setStatus(1);
        paymentService.publishEvent(new PaymentStatusUpdateEvent(paymentInfo));
    }


}
