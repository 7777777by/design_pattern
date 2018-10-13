package com.xyz.pattern.builder.builder01;

import java.util.ArrayList;

/**
 * @auth: liuyang
 * @date: 2018/9/20 20:22
 * 车辆模型的抽象类
 */
public abstract class CarModel {
    // 这个参数是各个基本方法执行的顺序
    private ArrayList<String> sequence = new ArrayList<String>();
    // 启动
    protected abstract void start();
    // 停止
    protected abstract void stop();
    // 鸣笛
    protected abstract void alarm();
    // 引擎
    protected abstract void engineBoom();
    // 运行
    final public void run() {
        // 循环，谁在前，就先执行谁
        for (String actionName : sequence) {
            if (actionName.equalsIgnoreCase("start")) {
                this.start();
            } else if (actionName.equalsIgnoreCase("stop")) {
                this.stop();
            } else if (actionName.equalsIgnoreCase("alarm")) {
                this.alarm();
            } else if (actionName.equalsIgnoreCase("engine boom")) {
                this.engineBoom();
            }
        }
    }
    // 把传递过来的值传递到类内
    final public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }
}
