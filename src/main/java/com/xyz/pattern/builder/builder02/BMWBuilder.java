package com.xyz.pattern.builder.builder02;

import com.xyz.pattern.builder.builder01.BMWModel;
import com.xyz.pattern.builder.builder01.CarModel;

import java.util.ArrayList;

/**
 * @auth: liuyang
 * @date: 2018/9/20 20:41
 * 宝马车组装者
 */
public class BMWBuilder extends CarBuilder {
    private BMWModel bmw = new BMWModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmw.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmw;
    }
}
