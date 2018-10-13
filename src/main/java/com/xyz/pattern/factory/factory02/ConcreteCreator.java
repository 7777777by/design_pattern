package com.xyz.pattern.factory.factory02;

/**
 * @auth: liuyang
 * @date: 2018/9/15 18:22
 * 具体工厂类
 */
public class ConcreteCreator extends Creator {
    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            // 异常处理
        }
        return (T) product;
    }
}
