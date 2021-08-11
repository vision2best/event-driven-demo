package com.example.eventdrivendemo.javabean;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * @author : Zhang Huang
 * @description : PropertyChangeSupport
 * @date : 2021-08-10 8:49 下午
 * @see PropertyChangeSupport
 * @see PropertyChangeListener
 */
public class PaymentStatusUpdateBean {

    PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    public void updateStatus(int newStatus) {
        // 模拟业务逻辑
        System.out.println("支付状态更新： " + newStatus);
        // 触发通知
        propertyChangeSupport.firePropertyChange("paymentStatusUpdate", 0, newStatus);
    }

}
