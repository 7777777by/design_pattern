package com.xyz.pattern.observer.observer03;

/**
 * description: 观察者接口
 *
 * @author 非
 * @create 2018-11-10 14:24
 */
public interface IObserver {
    // 一旦发现别人有动静，自己也要行动起来
    void update(String context);
}
