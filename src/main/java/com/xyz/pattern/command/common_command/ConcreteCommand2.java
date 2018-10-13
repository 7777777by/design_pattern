package com.xyz.pattern.command.common_command;

/**
 * @auth: liuyang
 * @date: 2018/9/25 20:44
 */
public class ConcreteCommand2 extends Command {
    // 哪个Receiver类进行命令处理
    private Receiver receiver;

    public ConcreteCommand2(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.doSomething();
    }
}