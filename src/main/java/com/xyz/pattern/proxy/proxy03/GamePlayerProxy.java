package com.xyz.pattern.proxy.proxy03;

/**
 * @auth: liuyang
 * @date: 2018/9/22 13:36
 * 普通代理的代理者
 */
public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer;

    // 通过构造函数传递要对谁进行代练
    public GamePlayerProxy(String name) {
        try {
            gamePlayer = new GamePlayer(this, name);
        } catch (Exception e) {
            // 异常处理
        }
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
