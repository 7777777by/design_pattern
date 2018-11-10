package com.xyz.pattern.observer.observer03;

/**
 * description: 被观察者接口
 *
 * @author 非
 * @create 2018-11-10 14:23
 */
public interface IObservable {
    // 增加一个观察者
    void addObserver(IObserver observer);
    // 删除一个观察者
    void deleteObserver(IObserver observer);
    // 既然要观察，我发生改变了他也应该有所动作，通知观察者
    void notifyObservers(String context);
}
