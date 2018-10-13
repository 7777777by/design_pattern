package com.xyz.pricinple.lsp.lsp04;

import java.util.Collection;
import java.util.HashMap;

/**
 * @auth: liuyang
 * @date: 2018/9/9 14:59
 */
public class Father {
    public Collection doSomething(HashMap map) {
        System.out.println("父类被执行...");
        return map.values();
    }
}
