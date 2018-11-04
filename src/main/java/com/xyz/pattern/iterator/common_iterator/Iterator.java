package com.xyz.pattern.iterator.common_iterator;

/**
 * description: 抽象迭代器
 *
 * @author 非
 * @create 2018-11-04 16:17
 */
public interface Iterator {
    // 遍历到下一个元素
    Object next();
    // 是否已经遍历到尾部
    boolean hasNext();
    // 删除当前指向的元素
    boolean remove();
}
