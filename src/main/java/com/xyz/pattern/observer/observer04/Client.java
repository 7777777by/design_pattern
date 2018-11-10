package com.xyz.pattern.observer.observer04;

import java.util.Observer;

/**
 * description:
 *
 * @author 非
 * @create 2018-11-10 14:36
 */
public class Client {
    public static void main(String[] args) {
        // 三个观察者生产出来
        LiSi liSi = new LiSi();
        // 定义出韩非子
        HanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.addObserver(liSi);
        hanFeiZi.haveBreakfast();
    }
}
