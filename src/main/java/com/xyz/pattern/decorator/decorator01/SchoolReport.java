package com.xyz.pattern.decorator.decorator01;

/**
 * @auth: liuyang
 * @date: 2018/10/14 18:43
 * 抽象成绩单
 */
public abstract class SchoolReport {
    // 成绩单主要展示的就是成绩
    public abstract void report();
    // 成绩单要家长签字
    public abstract void sign(String name);
}
