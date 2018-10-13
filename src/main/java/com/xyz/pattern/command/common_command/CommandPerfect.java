package com.xyz.pattern.command.common_command;

/**
 * @auth: liuyang
 * @date: 2018/9/25 21:00
 * 完美的命令类
 */
public abstract class CommandPerfect {
    // 定义一个子类的全局共享变量
    protected final Receiver receiver;

    // 实现类必须定义一个接受者
    protected CommandPerfect(Receiver receiver) {
        this.receiver = receiver;
    }

    // 每个命令都必须有一个执行命令的方法
    public abstract void execute();
}
