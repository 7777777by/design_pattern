package com.xyz.pattern.factory.replace_singleton;

import java.lang.reflect.Constructor;

/**
 * @auth: liuyang
 * @date: 2018/9/15 19:08
 * 负责生成单例的工厂类
 */
public class SingletonFactory {
    private static Singleton singleton;

    static {
        try {
           Class c1 = Class.forName(Singleton.class.getName());
           // 获得无参构造
            Constructor constructor = c1.getDeclaredConstructor();
            // 设置无参构造是可访问的
            constructor.setAccessible(true);
            // 产生一个实例对象
            singleton = (Singleton) constructor.newInstance();
        } catch (Exception e) {
            // 异常处理
        }
    }

    public static Singleton getSingleton() {
        return singleton;
    }
}
