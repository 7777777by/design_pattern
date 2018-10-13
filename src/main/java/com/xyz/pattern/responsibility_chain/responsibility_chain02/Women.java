package com.xyz.pattern.responsibility_chain.responsibility_chain02;

/**
 * @auth: liuyang
 * @date: 2018/9/26 19:31
 * 古代妇女
 */
public class Women implements IWomen {
    /*
     * 通过一个int类型的参数来描述妇女的个人情况
     * 1.未出嫁
     * 2.出嫁
     * 3.夫死
     */
    private int type = 0;
    // 妇女的请示
    private String request = "";

    public Women(int type, String request) {
        this.type = type;
        // 为了便于显示，在这里做了点处理
        switch (this.type) {
            case 1:
                this.request = "女儿的请求是：" + request;
                break;
            case 2:
                this.request = "妻子的请求是：" + request;
                break;
            case 3:
                this.request = "母亲的请求是：" + request;
                break;
        }
        this.request = request;
    }

    public int getType() {
        return this.type;
    }

    public String getRequest() {
        return this.request;
    }
}
