package com.xyz.pattern.proxy.proxy04;

/**
 * @auth: liuyang
 * @date: 2018/9/22 13:31
 * 强制代理的玩家类
 */
public class GamePlayer implements IGamePlayer {
    private String name;
    // 我的代理是谁
    private IGamePlayer proxy;

    public GamePlayer(String name) {
        this.name = name;
    }

    // 找到自己的代理
    public IGamePlayer getProxy() {
        this.proxy = new GamePlayerProxy(this);
        return this.proxy;
    }

    // 校验是否是代理访问
    private boolean isProxy() {
        if (this.proxy == null) {
            return false;
        } else {
            return true;
        }
    }

    public void login(String user, String password) {
        if (this.isProxy()) {
            System.out.println("登录名为" + user + "的玩家" + this.name + "登录成功！");
        } else {
            System.out.println("请使用指定的代理访问");
        }
    }

    public void killBoss() {
        if (this.isProxy()) {
            System.out.println(this.name + "在打怪");
        } else {
            System.out.println("请使用指定的代理访问");
        }
    }

    public void upgrade() {
        if (this.isProxy()) {
            System.out.println(this.name + " 又升了一级");
        } else {
            System.out.println("请使用指定的代理访问");
        }
    }
}
