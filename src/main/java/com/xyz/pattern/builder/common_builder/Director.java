package com.xyz.pattern.builder.common_builder;

/**
 * @auth: liuyang
 * @date: 2018/9/20 21:23
 * 导演类
 */
public class Director {
    private Builder builder = new ConcreteBuilder();
    // 构建不同的产品
    public Product getAProduct() {
        builder.setPart();
        return builder.buildProduct();
    }
}
