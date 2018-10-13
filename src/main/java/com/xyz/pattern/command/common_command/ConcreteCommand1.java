package com.xyz.pattern.command.common_command;

/**
 * @auth: liuyang
 * @date: 2018/9/25 20:42
 */
public class ConcreteCommand1 extends Command {
    // 对哪个Receiver类进行命令处理
    private Receiver receiver;

    public ConcreteCommand1(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        // 业务处理
        this.receiver.doSomething();
    }
}