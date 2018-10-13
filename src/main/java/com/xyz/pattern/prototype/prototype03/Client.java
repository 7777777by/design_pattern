package com.xyz.pattern.prototype.prototype03;

/**
 * @auth: liuyang
 * @date: 2018/9/24 15:35
 * 原型模式的构造函数不会被执行
 */
public class Client {
    public static void main(String[] args) {
        // 产生一个对象
        Thing thing = new Thing();
        // 拷贝一个对象
        Thing cloneThing = thing.clone();
    }
}
