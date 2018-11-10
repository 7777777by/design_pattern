package com.xyz.pattern.composite.common_composite;

import java.util.List;

/**
 * description:
 *
 * @author 非
 * @create 2018-11-10 13:16
 */
public class Client {
    public static void main(String[] args) {
        // 创建一个根节点
        Composite root = new Composite();
        root.doSomething();
        // 创建一个树枝构件
        Composite branch = new Composite();
        // 创建一个树叶构件
        Leaf leaf = new Leaf();
        // 建立整体
        branch.add(leaf);
        root.add(branch);
    }

    // 通过递归遍历树
    public static void display(Composite root) {
        List<Component> children = root.getChildren();
        for (Component child : children) {
            if (child instanceof Leaf) {
                child.doSomething();
            } else {
                display((Composite) child);
            }
        }
    }
}
