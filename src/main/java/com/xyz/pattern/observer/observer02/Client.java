package com.xyz.pattern.observer.observer02;

/**
 * description:
 *
 * @author 非
 * @create 2018-11-10 14:18
 */
public class Client {
    public static void main(String[] args) {
        // 定义出韩非子
        HanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();
    }
}
