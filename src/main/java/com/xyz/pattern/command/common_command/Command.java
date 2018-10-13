package com.xyz.pattern.command.common_command;

/**
 * @auth: liuyang
 * @date: 2018/9/25 20:41
 * 抽象的Command类
 */
public abstract class Command {
    // 每个命令都必须有一个执行命令的方法
    public abstract void execute();
}
