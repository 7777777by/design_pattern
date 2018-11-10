package com.xyz.pattern.observer.observer03;

/**
 * description:
 *
 * @author 非
 * @create 2018-11-10 14:36
 */
public class Client {
    public static void main(String[] args) {
        // 三个观察者生产出来
        IObserver liSi = new LiSi();
        IObserver wangSi = new WangSi();
        IObserver zhouSi = new ZhouSi();
        // 定义出韩非子
        HanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.addObserver(liSi);
        hanFeiZi.addObserver(wangSi);
        hanFeiZi.addObserver(zhouSi);
        hanFeiZi.haveBreakfast();
    }
}
