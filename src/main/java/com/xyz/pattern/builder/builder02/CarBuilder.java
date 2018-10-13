package com.xyz.pattern.builder.builder02;

import com.xyz.pattern.builder.builder01.CarModel;

import java.util.ArrayList;

/**
 * @auth: liuyang
 * @date: 2018/9/20 20:37
 * 抽象汽车组装者
 */
public abstract class CarBuilder {
    // 建造一个模型，你要给我一个顺序要求，就是组装顺序
    public abstract void setSequence(ArrayList<String> sequence);
    // 设置完毕顺序后，就可以直接拿到这个车辆模型
    public abstract CarModel getCarModel();
}
