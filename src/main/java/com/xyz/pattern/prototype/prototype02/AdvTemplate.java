package com.xyz.pattern.prototype.prototype02;

/**
 * @auth: liuyang
 * @date: 2018/9/24 15:10
 * 广告信模板
 */
public class AdvTemplate {
    // 广告信名称
    private String advSubject = "XX银行国庆信用卡抽奖活动";
    // 广告信内容
    private String advContext = "国庆抽奖活动通知：只要啥卡就送你一百万！...";

    public String getAdvSubject() {
        return advSubject;
    }

    public String getAdvContext() {
        return advContext;
    }
}
