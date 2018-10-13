package com.xyz.pricinple.isp.isp01;

/**
 * @auth: liuyang
 * @date: 2018/9/10 20:43
 */
public class Client {
    public static void main(String[] args) {
        IPrettyGirl jinger = new PrettyGirl("静儿");
        AbstractSearcher searcher = new Searcher(jinger);
        searcher.show();
    }
}
