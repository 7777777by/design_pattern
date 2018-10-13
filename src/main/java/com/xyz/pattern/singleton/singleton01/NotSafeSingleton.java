package com.xyz.pattern.singleton.singleton01;

/**
 * @auth: liuyang
 * @date: 2018/9/14 21:44
 * 线程不安全的单例
 */
public class NotSafeSingleton {
    private static NotSafeSingleton singleton = null;

    private NotSafeSingleton() {}

    public static NotSafeSingleton getInstance() {
        if (singleton == null) {
            singleton = new NotSafeSingleton();
        }
        return singleton;
    }
}
