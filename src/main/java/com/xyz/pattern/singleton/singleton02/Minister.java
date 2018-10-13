package com.xyz.pattern.singleton.singleton02;

/**
 * @auth: liuyang
 * @date: 2018/9/15 17:42
 * 臣子参拜皇帝的过程
 */
public class Minister {
    public static void main(String[] args) {
        // 第一个5个大臣
        for (int i = 0; i < 5; i++) {
            Emperor emperor = Emperor.getInstance();
            System.out.print("第" + (i + 1) + "个大臣参拜的是：");
            emperor.say();
        }
    }
}
