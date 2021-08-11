package com.example.eventdrivendemo.javabean;

/**
 * @author : Zhang Huang
 * @description : TODO
 * @date : 2021-08-10 8:52 下午
 */
public class Main {
    public static void main(String[] args) {
        PaymentStatusUpdateBean paymentStatusUpdateBean = new PaymentStatusUpdateBean();
        paymentStatusUpdateBean.addPropertyChangeListener(new MyStockObserver());
        paymentStatusUpdateBean.updateStatus(3);

        PaymentStatusUpdateBean1 paymentStatusUpdateBean1 = new PaymentStatusUpdateBean1();
        paymentStatusUpdateBean1.addPropertyChangeListener(new MyEmailObserver());
        paymentStatusUpdateBean1.updateStatus(3);
    }
}
