package com.xyz.pattern.command.command02;

/**
 * @auth: liuyang
 * @date: 2018/9/25 20:55
 * 撤销删除页面命令
 */
public class CancelDeletePageCommand extends Command {
    @Override
    public void execute() {
        super.pg.roleback();
    }
}
