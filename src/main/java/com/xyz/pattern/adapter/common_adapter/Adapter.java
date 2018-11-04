package com.xyz.pattern.adapter.common_adapter;

/**
 * description: 适配器角色
 *
 * @author 非
 * @create 2018-11-03 14:23
 */
public class Adapter extends Adaptee implements Target {
    public void request() {
        super.doSomething();
    }
}
