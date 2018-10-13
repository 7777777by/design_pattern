package com.xyz.pattern.proxy.proxy05;

/**
 * @auth: liuyang
 * @date: 2018/9/22 14:14
 */
public interface IGamePlayer {
    // 登录
    void login(String user, String password);
    // 杀怪
    void killBoss();
    // 升级
    void upgrade();
}
