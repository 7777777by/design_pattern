package com.xyz.pattern.responsibility_chain.responsibility_chain02;

/**
 * @auth: liuyang
 * @date: 2018/9/26 19:50
 * 女性接口
 */
public interface IWomen {
    // 获得个人情况
    int getType();
    // 获得个人请示，你要干什么？出去逛街？约会？还是看电影？
    String getRequest();
}
