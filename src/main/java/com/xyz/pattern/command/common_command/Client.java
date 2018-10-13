package com.xyz.pattern.command.common_command;

/**
 * @auth: liuyang
 * @date: 2018/9/25 20:46
 */
public class Client {
    public static void main(String[] args) {
        // 首先声明调用者Invoker
        Invoker invoker = new Invoker();
        // 定义接受者
        Receiver receiver = new ConcreteReceiver1();
        // 定义一个发送给接受者的命令
        Command command = new ConcreteCommand1(receiver);
        // 把命令交给接受者去执行
        invoker.setCommand(command);
        invoker.action();

        // 修改后的调用方式
        // 首先声明调用者Invoker
        Invoker invoker1 = new Invoker();
        // 定义一个发送给接受者的命令
        CommandPerfect commandPerfect = new ConcreteCommand1Perfect();
        // 把命令交给接受者去执行
        invoker.setCommand(commandPerfect);
        invoker.action();
    }
}
