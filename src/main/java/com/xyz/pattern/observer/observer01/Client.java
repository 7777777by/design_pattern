package com.xyz.pattern.observer.observer01;

/**
 * description:
 *
 * @author 非
 * @create 2018-11-10 14:08
 */
public class Client {
    public static void main(String[] args) throws InterruptedException {
        // 定义出韩非子和李斯
        LiSi liSi = new LiSi();
        HanFeiZi hanFeiZi = new HanFeiZi();
        // 观察早餐
        Spy spy = new Spy(hanFeiZi, liSi, "breakfast");
        // 开始启动线程，监控
        spy.run();
        // 观察娱乐情况
        Spy spy1 = new Spy(hanFeiZi, liSi, "fun");
        spy1.run();
        // 然后我们看看韩非子在干什么
        Thread.sleep(1000); // 主线程等待1秒后再往下执行
        hanFeiZi.haveBreakfast();
        Thread.sleep(1000);
        hanFeiZi.haveFun();
    }
}
