package com.example.eventdrivendemo.javabean;

import java.beans.PropertyChangeListener;
import java.beans.PropertyEditorSupport;

/**
 * @author : Zhang Huang
 * @description : PropertyEditorSupport
 * @date : 2021-08-10 8:49 下午
 * @see PropertyEditorSupport
 * @see PropertyChangeListener
 */
public class PaymentStatusUpdateBean1 {
    Payment payment = new Payment();
    PropertyEditorSupport propertyEditorSupport = new PropertyEditorSupport(payment);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyEditorSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyEditorSupport.removePropertyChangeListener(listener);
    }

    public void updateStatus(int newStatus) {
        payment.setStatus(3);
        // 模拟业务逻辑
        System.out.println("支付状态更新： " + newStatus);
        // 触发通知
        propertyEditorSupport.firePropertyChange();
    }

}
