package com.xyz.pattern.command.common_command;

/**
 * @auth: liuyang
 * @date: 2018/9/25 20:45
 * 调用者Invoker类
 */
public class Invoker {
    private Command command;
    private CommandPerfect commandPerfect;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void setCommand(CommandPerfect commandPerfect) {
        this.commandPerfect = commandPerfect;
    }
    // 执行命令
    public void action() {
        this.command.execute();
        this.commandPerfect.execute();
    }
}
