package com.xyz.pricinple.isp.isp02;

/**
 * @auth: liuyang
 * @date: 2018/9/10 23:03
 */
public class Searcher extends AbstractSeacher {
    public Searcher(IGoodBodyGirl goodBodyGirl, IGreatTemperamentGirl greatTemperamentGirl) {
        super(goodBodyGirl, greatTemperamentGirl);
    }

    @Override
    public void show() {
        System.out.println("------美女的信息如下------");
        if (super.goodBodyGirl != null) {
            // 展示面容
            super.goodBodyGirl.goodLooking();
            // 展示身材
            super.goodBodyGirl.niceFigure();
        }
        if (super.greatTemperamentGirl != null) {
            // 展示气质
            super.greatTemperamentGirl.greatTemperament();
        }
    }
}
