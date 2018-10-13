package com.xyz.pattern.builder.builder03;

import java.util.ArrayList;

/**
 * @auth: liuyang
 * @date: 2018/9/20 20:58
 * 抽象车模建造类
 */
public abstract class CarBuilder {
    public abstract void setSequence(ArrayList<String> sequence);

    public abstract CarModel getCarModel();
}
