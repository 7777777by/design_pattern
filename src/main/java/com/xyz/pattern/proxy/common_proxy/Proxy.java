package com.xyz.pattern.proxy.common_proxy;

/**
 * @auth: liuyang
 * @date: 2018/9/22 13:16
 * 代理类：负责对真实角色的应用，把所有抽象主题类定义的方法限制委托给真实主题角色实现，
 * 并且在真实主题角色处理完毕前后做预处理和善后处理工作
 */
public class Proxy implements Subject {
    // 要代理哪个实现类
    private Subject subject;

    // 默认被代理者
    public Proxy() {
        this.subject = new Proxy();
    }
    // 通过构造函数传递被代理者
    public Proxy(Object...objects) {

    }

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }

    // 预处理
    private void before(){

    }
    // 善后处理
    private void after() {

    }
}
