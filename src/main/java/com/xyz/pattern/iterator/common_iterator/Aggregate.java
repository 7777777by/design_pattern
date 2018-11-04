package com.xyz.pattern.iterator.common_iterator;

/**
 * description: 抽象容器
 *
 * @author 非
 * @create 2018-11-04 16:22
 */
public interface Aggregate {
    // 是容器必然后元素的添加
    void add(Object object);
    // 减少元素
    void remove(Object object);
    // 有迭代器遍历所有的元素
    Iterator iterator();
}
