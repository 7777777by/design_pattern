package com.xyz.pattern.builder.builder03;

import java.util.ArrayList;

/**
 * @auth: liuyang
 * @date: 2018/9/20 21:01
 */
public class BMWBuilder extends CarBuilder {
    private BMWModel bmw = new BMWModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmw.setSequence(sequence);
    }

    @Override
    public BMWModel getCarModel() {
        return this.bmw;
    }
}
