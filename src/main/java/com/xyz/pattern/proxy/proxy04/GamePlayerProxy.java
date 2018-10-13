package com.xyz.pattern.proxy.proxy04;

/**
 * @auth: liuyang
 * @date: 2018/9/22 13:36
 * 强制代理的代理者
 */
public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer;

    // 通过构造函数传递用户
    public GamePlayerProxy(IGamePlayer player) {
        this.gamePlayer = player;
    }

    // 代理的代理暂时还没有，就是自己
    public IGamePlayer getProxy() {
        return this;
    }

    public void login(String user, String password) {
        this.gamePlayer.login(user, password);
    }

    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    public void upgrade() {
        this.gamePlayer.upgrade();
    }
}
