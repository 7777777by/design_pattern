package com.xyz.pattern.responsibility_chain.responsibility_chain01;

/**
 * @auth: liuyang
 * @date: 2018/9/26 19:37
 * 丈夫类
 */
public class Husband implements IHandler {
    // 妻子向丈夫请示
    public void handleMessage(IWomen women) {
        System.out.println("妻子的请示是：" + women.getRequest());
        System.out.println("丈夫的答复是：同意");
    }
}
