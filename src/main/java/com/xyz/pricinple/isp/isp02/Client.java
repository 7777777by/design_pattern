package com.xyz.pricinple.isp.isp02;

/**
 * @auth: liuyang
 * @date: 2018/9/10 23:05
 */
public class Client {
    public static void main(String[] args) {
        IGoodBodyGirl jinger = new PrettyGirl("静儿");
        AbstractSeacher seacher = new Searcher(jinger, null);
        seacher.show();
    }
}
