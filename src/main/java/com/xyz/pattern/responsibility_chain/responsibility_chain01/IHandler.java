package com.xyz.pattern.responsibility_chain.responsibility_chain01;

/**
 * @auth: liuyang
 * @date: 2018/9/26 19:34
 * 有处理权的人员接口
 */
public interface IHandler {
    // 一个女性（女儿、妻子或者母亲）要求逛街，你要处理这个请求
    void handleMessage(IWomen women);
}
