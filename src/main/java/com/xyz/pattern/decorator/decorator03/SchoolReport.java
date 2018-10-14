package com.xyz.pattern.decorator.decorator03;

/**
 * @auth: liuyang
 * @date: 2018/10/14 19:06
 * 抽象成绩单类
 */
public abstract class SchoolReport {
    // 成绩单
    public abstract void report();
    // 家长签名
    public abstract void sign(String name);
}
