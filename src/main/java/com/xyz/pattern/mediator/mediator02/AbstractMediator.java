package com.xyz.pattern.mediator.mediator02;

/**
 * @auth: liuyang
 * @date: 2018/9/24 17:14
 * 抽象中介者
 */
public abstract class AbstractMediator {
    protected Purchase purchase;
    protected Stock stock;
    protected Sale sale;

    // 构造函数
    public AbstractMediator() {
        this.purchase = new Purchase(this);
        this.stock = new Stock(this);
        this.sale = new Sale(this);
    }

    // 中介者最重要的方法叫做事件方法，处理多个对象之间的关系
    public abstract void execute(String str, Object...objects);
}
