package com.xyz.pattern.observer.observer02;

/**
 * description: 具体的被观察者
 *
 * @author 非
 * @create 2018-11-10 14:15
 */
public class HanFeiZi implements IHanFeiZi {
    // 把李斯声明出来
    private ILiSi liSi = new LiSi();

    public void haveBreakfast() {
        System.out.println("韩非子：开始吃饭了...");
        this.liSi.update("韩非子在吃饭");
    }

    public void haveFun() {
        System.out.println("韩非子：开始娱乐了...");
        this.liSi.update("韩非子在娱乐");
    }
}
