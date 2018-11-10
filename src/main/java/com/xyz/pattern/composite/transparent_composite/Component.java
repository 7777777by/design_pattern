package com.xyz.pattern.composite.transparent_composite;

import java.util.List;

/**
 * description: 抽象构件
 *
 * @author 非
 * @create 2018-11-10 13:31
 */
public abstract class Component {
    // 个体和整体都具有的共享
    public void doSomething() {
        // 编写业务逻辑
    }
    // 增加一个叶子构件或树枝构件
    public abstract void add(Component component);
    // 删除一个叶子构件或树枝构件
    public abstract void delete(Component component);
    // 获得分支下的所有叶子构件和树枝构件
    public abstract List<Component> getChildren();
}
