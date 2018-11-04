package com.xyz.pattern.adapter.common_adapter;

/**
 * description:
 *
 * @author 非
 * @create 2018-11-03 14:25
 */
public class Client {
    public static void main(String[] args) {
        // 原有的业务逻辑
        Target target = new ConcreteTarget();
        target.request();
        // 现在增加了适配器角色后的业务逻辑
        Target target1 = new Adapter();
        target1.request();
    }
}
