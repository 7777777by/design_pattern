package com.xyz.pattern.builder.common_builder;

/**
 * @auth: liuyang
 * @date: 2018/9/20 21:21
 * 具体建造者
 * 有多个产品类就有几个具体的建造者
 */
public class ConcreteBuilder extends Builder {
    private Product product = new Product();

    /**
     * 设置产品零件
     */
    @Override
    public void setPart() {
        // 产品类内的逻辑处理
    }

    @Override
    public Product buildProduct() {
        return this.product;
    }
}
