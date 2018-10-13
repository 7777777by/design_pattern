package com.xyz.pattern.command.command02;

/**
 * @auth: liuyang
 * @date: 2018/9/25 20:29
 */
public class Client {
    public static void main(String[] args) {
        // 定义我们的接头人
        Invoker xiaosan = new Invoker();
        // 客户要求增加一项需求
        //System.out.println("------客户要求增加一项需求------");
        // 客户要求删除一个页面
        System.out.println("------客户要求删除一个页面------");
        // 客户给我们下命令来
        //Command command = new AddRequirementCommand();
        Command command = new DeletePageCommand();
        // 接头人接收到命令
        xiaosan.setCommand(command);
        // 接头人执行命令
        xiaosan.action();
    }
}
