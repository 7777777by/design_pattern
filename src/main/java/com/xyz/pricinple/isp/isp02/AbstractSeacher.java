package com.xyz.pricinple.isp.isp02;

/**
 * @auth: liuyang
 * @date: 2018/9/10 23:01
 */
public abstract class AbstractSeacher {
    protected IGoodBodyGirl goodBodyGirl;
    protected IGreatTemperamentGirl greatTemperamentGirl;

    public AbstractSeacher(IGoodBodyGirl goodBodyGirl, IGreatTemperamentGirl greatTemperamentGirl) {
        this.goodBodyGirl = goodBodyGirl;
        this.greatTemperamentGirl = greatTemperamentGirl;
    }

    // 搜索美女，列出美女信息
    public abstract void show();
}
