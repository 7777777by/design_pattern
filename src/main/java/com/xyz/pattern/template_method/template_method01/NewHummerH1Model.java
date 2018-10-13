package com.xyz.pattern.template_method.template_method01;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @auth: liuyang
 * @date: 2018/9/16 15:51
 * H1型号悍马模型
 */
public class NewHummerH1Model extends NewHummerModel {
    private boolean alarmFlag = true;

    @Override
    public void start() {
        System.out.println("悍马H1发动...");
    }

    @Override
    public void stop() {
        System.out.println("悍马H1停车...");
    }

    @Override
    public void alarm() {
        System.out.println("悍马H1鸣笛...");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H1引擎声音是这样的");
    }

    @Override
    protected boolean isAlarm() {
        return this.alarmFlag;
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

    public void setAlarm(boolean isAlarm) {
        this.alarmFlag = isAlarm;
    }
}
