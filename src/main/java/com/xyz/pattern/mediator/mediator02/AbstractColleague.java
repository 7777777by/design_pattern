package com.xyz.pattern.mediator.mediator02;

/**
 * @auth: liuyang
 * @date: 2018/9/24 17:52
 * 抽象同事类
 */
public abstract class AbstractColleague {
    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}
