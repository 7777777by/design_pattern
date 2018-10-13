package com.xyz.pricinple.lsp.lsp04;

import java.util.Collection;
import java.util.Map;

/**
 * @auth: liuyang
 * @date: 2018/9/9 15:12
 */
public class Father1 {
    public Collection doSomething(Map map) {
        System.out.println("父类被执行...");
        return map.values();
    }
}
