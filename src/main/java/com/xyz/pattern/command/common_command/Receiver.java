package com.xyz.pattern.command.common_command;

/**
 * @auth: liuyang
 * @date: 2018/9/25 20:39
 * 通用Receiver类
 */
public abstract class Receiver {
    // 抽象接收者，定义每个接受者都必须完成的任务
    public abstract void doSomething();
}
