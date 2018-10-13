package com.xyz.pricinple.isp.isp01;

/**
 * @auth: liuyang
 * @date: 2018/9/10 20:38
 * 星探抽象类
 */
public abstract class AbstractSearcher {
    protected IPrettyGirl prettyGirl;

    public AbstractSearcher(IPrettyGirl prettyGirl) {
        this.prettyGirl = prettyGirl;
    }

    // 搜索美女，列出美女信息
    public abstract void show();
}
