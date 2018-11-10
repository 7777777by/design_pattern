package com.xyz.pattern.observer.common_observer;

import java.util.Vector;

/**
 * description: 被观察者
 *
 * @author 非
 * @create 2018-11-10 14:41
 */
public abstract class Subject {
    // 定义一个观察者数组
    private Vector<IObserver> observerVector = new Vector<IObserver>();

    // 增加一个观察者
    public void addObserver(IObserver observer) {
        this.observerVector.add(observer);
    }
    // 删除一个观察者
    public void deleteObserver(IObserver observer) {
        this.observerVector.remove(observer);
    }
    // 通知所有观察者
    public void notifyObservers() {
        for (IObserver observer : observerVector) {
            observer.update();
        }
    }
}
