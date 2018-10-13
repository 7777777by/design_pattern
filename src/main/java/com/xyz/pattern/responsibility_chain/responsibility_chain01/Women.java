package com.xyz.pattern.responsibility_chain.responsibility_chain01;

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
        this.request = request;
    }

    public int getType() {
        return this.type;
    }

    public String getRequest() {
        return this.request;
    }
}
