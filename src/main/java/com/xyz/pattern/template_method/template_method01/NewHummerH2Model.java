package com.xyz.pattern.template_method.template_method01;

/**
 * @auth: liuyang
 * @date: 2018/9/16 15:51
 * H2型号悍马模型
 */
public class NewHummerH2Model extends NewHummerModel {
    @Override
    public void start() {
        System.out.println("悍马H2发动...");
    }

    @Override
    public void stop() {
        System.out.println("悍马H2停车...");
    }

    @Override
    public void alarm() {
        System.out.println("悍马H2鸣笛...");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H2引擎声音是这样的");
    }

    /*@Override
    public void run() {
        // 发动汽车
        this.start();
        // 引擎开始轰鸣
        this.engineBoom();
        // 然后就开始跑了，中途遇见一条狗挡路，就按喇叭
        this.alarm();
        // 到达目的地就停车
        this.stop();
    }*/

    @Override
    protected boolean isAlarm() {
        return false;
    }
}
