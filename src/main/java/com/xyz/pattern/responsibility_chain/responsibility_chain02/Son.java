package com.xyz.pattern.responsibility_chain.responsibility_chain02;

/**
 * @auth: liuyang
 * @date: 2018/9/26 20:04
 * 儿子类
 */
public class Son extends Handler {
    // 儿子只处理母亲的请求
    public Son() {
        super(Handler.SON_LEVEL_REQUEST);
    }

    // 儿子的答复
    @Override
    protected void response(IWomen women) {
        System.out.println("------ 母亲向儿子请示 ------");
        System.out.println(women.getRequest());
        System.out.println("儿子的答复是：同意");
    }
}
