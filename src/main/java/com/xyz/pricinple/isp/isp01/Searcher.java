package com.xyz.pricinple.isp.isp01;

/**
 * @auth: liuyang
 * @date: 2018/9/10 20:40
 * 星探类
 */
public class Searcher extends AbstractSearcher {
    public Searcher(IPrettyGirl prettyGirl) {
        super(prettyGirl);
    }

    // 展示美女的信息
    @Override
    public void show() {
        System.out.println("------美女的信息如下------");
        // 展示面容
        super.prettyGirl.goodLooking();
        // 展示身材
        super.prettyGirl.niceFigure();
        // 展示气质
        super.prettyGirl.greatTemperament();
    }
}
