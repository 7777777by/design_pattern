package com.xyz.pattern.observer.observer04;

import java.util.Observable;

/**
 * description: 优化后的被观察者
 *
 * @author 非
 * @create 2018-11-10 14:55
 */
public class HanFeiZi extends Observable implements IHanFeiZi {
    // 吃饭
    public void haveBreakfast() {
        System.out.println("韩非子：开始吃饭了...");
        // 通知所有的观察者
        super.setChanged();
        super.notifyObservers("韩非子在吃饭");
    }
    // 娱乐
    public void haveFun() {
        System.out.println("韩非子：开始娱乐了...");
        // 通知所有的观察者
        super.setChanged();
        super.notifyObservers("韩非子在娱乐");
    }
}
