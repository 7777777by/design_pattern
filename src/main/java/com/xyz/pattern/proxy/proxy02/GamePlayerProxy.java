package com.xyz.pattern.proxy.proxy02;

/**
 * @auth: liuyang
 * @date: 2018/9/22 13:03
 * 代练玩家（代理）
 */
public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer player;

    public GamePlayerProxy(IGamePlayer player) {
        this.player = player;
    }

    // 代练登录
    public void login(String user, String password) {
        this.player.login(user, password);
    }

    // 代练杀怪
    public void killBoss() {
        this.player.killBoss();
    }

    // 代练升级
    public void upgrade() {
        this.player.upgrade();
    }
}
