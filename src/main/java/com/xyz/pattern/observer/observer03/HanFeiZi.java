package com.xyz.pattern.observer.observer03;

import java.util.ArrayList;
import java.util.List;

/**
 * description: 被观察者韩非子
 *
 * @author 非
 * @create 2018-11-10 14:27
 */
public class HanFeiZi implements IHanFeiZi, IObservable {
    // 定义一个变长数组，存放所有的观察者
    private List<IObserver> observerList = new ArrayList<IObserver>();

    // 吃饭
    public void haveBreakfast() {
        System.out.println("韩非子：开始吃饭了...");
        // 通知所有的观察者
        this.notifyObservers("韩非子在吃饭");
    }
    // 娱乐
    public void haveFun() {
        System.out.println("韩非子：开始娱乐了...");
        // 通知所有的观察者
        this.notifyObservers("韩非子在娱乐");
    }
    // 增加观察者
    public void addObserver(IObserver observer) {
        this.observerList.add(observer);
    }
    // 删除观察者
    public void deleteObserver(IObserver observer) {
        this.observerList.remove(observer);
    }
    // 通知观察者
    public void notifyObservers(String context) {
        for (IObserver observer : observerList) {
            observer.update(context);
        }
    }
}
