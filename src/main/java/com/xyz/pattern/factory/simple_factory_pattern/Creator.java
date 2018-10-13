package com.xyz.pattern.factory.simple_factory_pattern;

/**
 * @auth: liuyang
 * @date: 2018/9/15 18:39
 * 简单工厂类
 */
public class Creator {
    public static <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            // 异常处理
        }
        return (T) product;
    }
}
