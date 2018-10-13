package com.xyz.pattern.command.command02;

/**
 * @auth: liuyang
 * @date: 2018/9/25 20:26
 * 增加需求的命令
 */
public class AddRequirementCommand extends Command {
    // 执行增加一项需求的命令
    @Override
    public void execute() {
        // 找到需求组
        super.rg.find();
        // 增加一个需求
        super.rg.add();
        // 页面也需要增加
        super.pg.add();
        // 代码也需要增加
        super.cg.add();
        // 给出计划
        super.rg.plan();
    }
}
