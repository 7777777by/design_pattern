package com.xyz.pattern.proxy.proxy01;

/**
 * @auth: liuyang
 * @date: 2018/9/22 12:54
 * 玩家接口
 */
public interface IGamePlayer {
    // 登录游戏
    void login(String user, String password);
    // 杀怪
    void killBoss();
    // 升级
    void upgrade();
}
