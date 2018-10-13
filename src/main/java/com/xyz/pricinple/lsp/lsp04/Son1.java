package com.xyz.pricinple.lsp.lsp04;

import java.util.Collection;
import java.util.HashMap;

/**
 * @auth: liuyang
 * @date: 2018/9/9 15:13
 */
public class Son1 extends Father1 {
    public Collection doSomething(HashMap map) {
        System.out.println("子类被执行...");
        return map.values();
    }
}
