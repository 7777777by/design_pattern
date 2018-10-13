package com.xyz.pattern.singleton.singleton01;

/**
 * @auth: liuyang
 * @date: 2018/9/14 19:12
 * 大臣类
 */
public class Minister {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Emperor emperor = Emperor.getInstance();
            emperor.say();
        }
    }
}
