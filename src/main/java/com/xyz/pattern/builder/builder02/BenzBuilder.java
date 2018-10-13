package com.xyz.pattern.builder.builder02;

import com.xyz.pattern.builder.builder01.BenzModel;
import com.xyz.pattern.builder.builder01.CarModel;

import java.util.ArrayList;

/**
 * @auth: liuyang
 * @date: 2018/9/20 20:40
 * 奔驰车组装者
 */
public class BenzBuilder extends CarBuilder {
    private BenzModel benz = new BenzModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benz;
    }
}
