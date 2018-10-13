package com.xyz.pattern.proxy.proxy03;

/**
 * @auth: liuyang
 * @date: 2018/9/22 13:30
 * 玩家接口
 */
public interface IGamePlayer {
    // 登录
    void login(String user, String password);
    // 打怪
    void killBoss();
    // 升级
    void upgrade();
}
