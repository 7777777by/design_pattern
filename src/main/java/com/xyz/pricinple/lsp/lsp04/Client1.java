package com.xyz.pricinple.lsp.lsp04;

import java.util.HashMap;

/**
 * @auth: liuyang
 * @date: 2018/9/9 15:14
 */
public class Client1 {
    /**
     * 子类的前置条件较小，运行结果不一致，违反里氏替换原则
     */
    public static void invoke() {
//        Father1 f = new Father1();
        Son1 s = new Son1();
        HashMap map = new HashMap();
//        f.doSomething(map);
        s.doSomething(map);
    }

    public static void main(String[] args) {
        invoke();
    }
}
