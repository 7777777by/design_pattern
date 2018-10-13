package com.xyz.pattern.command.command02;

/**
 * @auth: liuyang
 * @date: 2018/9/25 20:24
 *
 */
public class DeletePageCommand extends Command {
    // 执行删除一个页面的命令
    @Override
    public void execute() {
        // 找到美工组
        super.pg.find();
        // 删除一个页面
        super.pg.delete();
        // 给出计划
        super.pg.plan();
    }
}
