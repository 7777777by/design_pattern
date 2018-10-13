package com.xyz.pattern.singleton.singleton01;

/**
 * @auth: liuyang
 * @date: 2018/9/14 19:14
 * 单例模式通用代码
 */
public class SingleTon {
    private static final SingleTon SINGLE_TON = new SingleTon();

    // 限制产生多个对象
    private SingleTon() {}

    //通过该方法获得实例对象
    public static SingleTon getInstance() {
        return SINGLE_TON;
    }

    // 类中其他方法，尽量是static
    public static void doSomething() {}
}
