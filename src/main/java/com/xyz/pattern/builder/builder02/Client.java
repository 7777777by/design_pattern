package com.xyz.pattern.builder.builder02;

import com.xyz.pattern.builder.builder01.CarModel;

import java.util.ArrayList;

/**
 * @auth: liuyang
 * @date: 2018/9/20 20:42
 * 场景类：运行顺序排列组合有很多种，不能预知要什么顺序
 */
public class Client {
    public static void main(String[] args) {
        /**
         * 客户告诉**公司，我要这样一个模型，然后**公司就告诉我老大
         * 说要这样一个模型，这样一个顺序，然后我就来制造
         */
        // 存放run的顺序
        ArrayList<String> sequence = new ArrayList<String>();
        sequence.add("engine boom"); // 客户要求，run的时候先发动引擎
        sequence.add("start"); // 启动起来
        sequence.add("stop"); // 开了一段就停下
        // 要一个奔驰车
        BenzBuilder benzBuilder = new BenzBuilder();
        // 把顺序给这个builder类，制造出这样一个车来
        benzBuilder.setSequence(sequence);
        // 制造出一个奔驰车
        CarModel benz = benzBuilder.getCarModel();
        // 奔驰车跑一下
        benz.run();
        // 按照同样的顺序，我再要一个宝马
        BMWBuilder bmwBuilder = new BMWBuilder();
        bmwBuilder.setSequence(sequence);
        CarModel bmw = bmwBuilder.getCarModel();
        bmw.run();
    }
}
