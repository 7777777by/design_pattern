package com.xyz.pattern.responsibility_chain.responsibility_chain01;

/**
 * @auth: liuyang
 * @date: 2018/9/26 19:36
 * 父亲类
 */
public class Father implements IHandler {
    // 未出嫁的女儿来请求父亲
    public void handleMessage(IWomen women) {
        System.out.println("女儿的请示是：" + women.getRequest());
        System.out.println("父亲的答复是：同意");
    }
}
