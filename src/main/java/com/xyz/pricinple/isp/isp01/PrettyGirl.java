package com.xyz.pricinple.isp.isp01;

/**
 * @auth: liuyang
 * @date: 2018/9/10 20:28
 * 美女实现类
 */
public class PrettyGirl implements IPrettyGirl {
    private String name;

    public PrettyGirl(String name) {
        this.name = name;
    }

    public void goodLooking() {
        System.out.println(this.name + "-----脸蛋很漂亮!");
    }

    public void niceFigure() {
        System.out.println(this.name + "-----身材非常棒！");
    }

    public void greatTemperament() {
        System.out.println(this.name + "-----气质非常好！");
    }
}
