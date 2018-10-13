package com.xyz.pattern.command.common_command;

/**
 * @auth: liuyang
 * @date: 2018/9/25 20:42
 */
public class ConcreteCommand1Perfect extends CommandPerfect {
    // 声明自己的默认接收者
    public ConcreteCommand1Perfect() {
        super(new ConcreteReceiver1());
    }

    // 设置新的接收者
    public ConcreteCommand1Perfect(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        // 业务处理
        this.receiver.doSomething();
    }
}