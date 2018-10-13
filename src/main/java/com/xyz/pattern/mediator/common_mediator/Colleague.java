package com.xyz.pattern.mediator.common_mediator;

/**
 * @auth: liuyang
 * @date: 2018/9/24 18:25
 * 抽象同事类
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
