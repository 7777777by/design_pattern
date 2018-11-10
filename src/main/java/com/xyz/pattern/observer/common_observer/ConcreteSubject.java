package com.xyz.pattern.observer.common_observer;

/**
 * description: 具体的被观察者
 *
 * @author 非
 * @create 2018-11-10 14:45
 */
public class ConcreteSubject extends Subject {
    // 具体的业务逻辑
    public void doSomething() {
        // doSomething
        super.notifyObservers();
    }
}
