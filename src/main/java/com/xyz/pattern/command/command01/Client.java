package com.xyz.pattern.command.command01;

/**
 * @auth: liuyang
 * @date: 2018/9/25 20:10
 * 场景类
 */
public class Client {
    // 场景1
    private static void one() {
        // 首先客户找到需求组说，过来谈需求，并修改
        System.out.println("------客户要求增加一项需求------");
        Group rg = new RequirementGroup();
        // 找到需求组
        rg.find();
        // 增加一个需求
        rg.add();
        // 要求变更计划
        rg.plan();
    }
    // 场景2
    private static void two() {
        // 首先客户找到美工组说，过来谈页面，并修改
        System.out.println("------客户要求删除一个页面------");
        Group pg = new PageGroup();
        // 找到美工组
        pg.find();
        // 删除一个页面
        pg.delete();
        // 要求变更计划
        pg.plan();
    }

    public static void main(String[] args) {
        one();
        two();
    }
}
