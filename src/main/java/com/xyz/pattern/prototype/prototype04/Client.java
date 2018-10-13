package com.xyz.pattern.prototype.prototype04;

/**
 * @auth: liuyang
 * @date: 2018/9/24 15:40
 * 浅拷贝测试
 */
public class Client {
    public static void main(String[] args) {
        // 产生一个对象
//        Thing thing = new Thing();
        Thing1 thing = new Thing1();
        // 设置一个值
        thing.setValue("张三");
        // 拷贝一个对象
        Thing1 cloneThing = thing.clone();
        cloneThing.setValue("李四");
        System.out.println(thing.getValue());
    }
}
