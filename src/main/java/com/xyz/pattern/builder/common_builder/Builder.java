package com.xyz.pattern.builder.common_builder;

/**
 * @auth: liuyang
 * @date: 2018/9/20 21:19
 */
public abstract class Builder {
    // 设置产品的不同部分，以获得不同的产品
    public abstract void setPart();
    // 建造产品
    public abstract Product buildProduct();
}
