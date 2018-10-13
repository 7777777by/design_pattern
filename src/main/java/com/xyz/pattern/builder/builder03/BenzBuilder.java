package com.xyz.pattern.builder.builder03;

import java.util.ArrayList;

/**
 * @auth: liuyang
 * @date: 2018/9/20 20:59
 * 奔驰车建造者
 */
public class BenzBuilder extends CarBuilder {
    private BenzModel benz = new BenzModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

    @Override
    public BenzModel getCarModel() {
        return this.benz;
    }
}
