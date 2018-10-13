package com.xyz.pattern.proxy.proxy05;

/**
 * @auth: liuyang
 * @date: 2018/9/22 14:17
 */
public class GamePlayerProxy implements IGamePlayer, IProxy {
    private IGamePlayer gamePlayer;

    public GamePlayerProxy(String name) {
        try {
            this.gamePlayer = new GamePlayer(this, name);
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
        this.count();
    }

    public void count() {
        System.out.println("升级总费用是：150元");
    }
}
