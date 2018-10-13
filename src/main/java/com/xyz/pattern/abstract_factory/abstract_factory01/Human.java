package com.xyz.pattern.abstract_factory.abstract_factory01;

/**
 * @auth: liuyang
 * @date: 2018/9/15 19:33
 * 人类接口
 */
public interface Human {
    // 每个人种都有相应的颜色
    void getColor();
    // 人类会说话
    void talk();
    // 每个人都有性别
    void getSex();
}
