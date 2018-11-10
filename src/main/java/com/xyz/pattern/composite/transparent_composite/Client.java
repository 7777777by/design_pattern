package com.xyz.pattern.composite.transparent_composite;

/**
 * description: 透明模式的组合模式场景类
 *
 * @author 非
 * @create 2018-11-10 13:36
 */
public class Client {
    public static void display(Component root) {
        for (Component child : root.getChildren()) {
            if (child instanceof Leaf) {
                child.doSomething();
            } else {
                display(child);
            }
        }
    }
}
