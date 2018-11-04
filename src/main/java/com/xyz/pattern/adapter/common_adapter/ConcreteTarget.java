package com.xyz.pattern.adapter.common_adapter;

/**
 * description: 目标角色的实现类
 *
 * @author 非
 * @create 2018-11-03 14:20
 */
public class ConcreteTarget implements Target {
    public void request() {
        System.out.println("if you need any help,pls call me!");
    }
}
