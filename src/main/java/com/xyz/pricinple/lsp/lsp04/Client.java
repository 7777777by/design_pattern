package com.xyz.pricinple.lsp.lsp04;

import java.util.HashMap;

/**
 * @auth: liuyang
 * @date: 2018/9/9 15:02
 * 子类中方法的前置条件必须与超类中被覆写的方法的前置条件相同或更宽松
 */
public class Client {
    public static void main(String[] args) {
        // 父类存在的地方，子类就应该能够存在
//        Father father = new Father();
        Son son = new Son();
        HashMap map = new HashMap();
//        father.doSomething(map);
        son.doSomething(map);
    }
}
