package com.xyz.pricinple.isp.isp02;

/**
 * @auth: liuyang
 * @date: 2018/9/10 22:58
 * 最标准的美女类，既可以指外形好看，又可以指气质出众
 */
public class PrettyGirl implements IGoodBodyGirl, IGreatTemperamentGirl {
    private String name;

    public PrettyGirl(String name) {
        this.name = name;
    }

    public void goodLooking() {
        System.out.println(this.name + "-----脸蛋很漂亮！");
    }

    public void niceFigure() {
        System.out.println(this.name + "-----身材非常棒！");
    }

    public void greatTemperament() {
        System.out.println(this.name + "-----气质非常好！");
    }
}
