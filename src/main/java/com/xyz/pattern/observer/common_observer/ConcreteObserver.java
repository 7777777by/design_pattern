package com.xyz.pattern.observer.common_observer;

/**
 * description: 具体的观察者
 *
 * @author 非
 * @create 2018-11-10 14:47
 */
public class ConcreteObserver implements IObserver {
    public void update() {
        System.out.println("接收到信息，并进行处理");
    }
}
