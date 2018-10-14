package com.xyz.pattern.decorator.decorator03;

/**
 * @auth: liuyang
 * @date: 2018/10/14 19:08
 * 修饰的抽象类
 */
public abstract class Decorator extends SchoolReport {
    // 首先我要知道是哪个成绩单
    private SchoolReport sr;

    public Decorator(SchoolReport sr) {
        this.sr = sr;
    }

    // 成绩单还是要被看到的
    public void report() {
        this.sr.report();
    }

    // 看完还是要签名的
    public void sign(String name) {
        this.sr.sign(name);
    }
}
