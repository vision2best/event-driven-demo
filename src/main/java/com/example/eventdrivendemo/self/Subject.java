package com.example.eventdrivendemo.self;

/**
 * @author : Zhang Huang
 * @description : 事件源 被观察者
 * @date : 2021-08-10 8:29 下午
 */
public interface Subject {
    /**
     * 添加观察者
     *
     * @param observer
     */
    void addObserver(Observer observer);

    /**
     * 删除观察者
     *
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者
     */
    void notifyObservers();
}
