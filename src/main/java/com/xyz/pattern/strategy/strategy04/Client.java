package com.xyz.pattern.strategy.strategy04;

/**
 * @auth: liuyang
 * @date: 2018/10/20 17:35
 */
public class Client {
    public static void main(String[] args) {
        System.out.println(Calculator.ADD.exec(1, 2));
        System.out.println(Calculator.ADD.value);
    }
}
