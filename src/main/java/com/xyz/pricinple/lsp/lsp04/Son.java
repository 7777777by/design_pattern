package com.xyz.pricinple.lsp.lsp04;

import java.util.Collection;
import java.util.Map;

/**
 * @auth: liuyang
 * @date: 2018/9/9 15:00
 */
public class Son extends Father {
    // 放大输入参数类型，由于参数不同，相当于重载了方法doSomething
    public Collection doSomething(Map map) {
        System.out.println("子类被执行...");
        return map.values();
    }
}
