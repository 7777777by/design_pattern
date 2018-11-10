package com.xyz.pattern.observer.common_observer;

/**
 * description: 场景类
 *
 * @author 非
 * @create 2018-11-10 14:47
 */
public class Client {
    public static void main(String[] args) {
        // 创建一个被观察者
        Subject subject = new ConcreteSubject();
        // 定义一个观察者
        IObserver observer = new ConcreteObserver();
        // 观察者观察被观察者
        subject.addObserver(observer);
        // 被观察者开始活动了
        ((ConcreteSubject) subject).doSomething();
    }
}
