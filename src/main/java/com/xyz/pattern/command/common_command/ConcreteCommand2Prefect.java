package com.xyz.pattern.command.common_command;

/**
 * @auth: liuyang
 * @date: 2018/9/25 21:04
 */
public class ConcreteCommand2Prefect extends CommandPerfect {
    // 声明自己的默认接收者
    public ConcreteCommand2Prefect() {
        super(new ConcreteReceiver2());
    }

    // 设置新的接收者
    public ConcreteCommand2Prefect(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        this.receiver.doSomething();
    }
}
