package com.xyz.pattern.factory.lazy_initialization;

import java.util.HashMap;
import java.util.Map;

/**
 * @auth: liuyang
 * @date: 2018/9/15 19:17
 */
public class ProductFactory {
    private static Map<String, Product> productMap = new HashMap<String, Product>();

    public static synchronized Product createProduct(String type) {
        Product product = null;
        // 如果productMap中已经有这个对象
        if (productMap.containsKey(type)) {
            product = productMap.get(type);
        } else {
            if (type.equals("Product1")) {
                product = new ConcreteProduct1();
            } else {
                product = new ConcreteProduct2();
            }
            // 同时把对象放到缓存容器中
            productMap.put(type, product);
        }
        return product;
    }
}
