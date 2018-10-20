package com.xyz.pattern.strategy.strategy01;

/**
 * @auth: liuyang
 * @date: 2018/10/20 16:38
 * 赵云根据诸葛亮的交代，依次拆开妙计
 */
public class ZhaoYun {
    public static void main(String[] args) {
        System.out.println("---刚刚到吴国的时候拆第一个---");
        Context context = new Context(new BackDoor()); // 拿到妙计
        context.operat(); // 拆开执行
        System.out.println("---刘备乐不思蜀了，拆第二个---");
        context = new Context(new GivenGreenLight());
        context.operat(); // 执行了第二个锦囊
        System.out.println("--孙权的小兵追来了，咋办？拆第三个---");
        context = new Context(new BlockEnemy());
        context.operat(); // 孙夫人退兵
    }
}
