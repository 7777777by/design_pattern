package com.xyz.pattern.iterator.common_iterator;

import java.util.Vector;

/**
 * description: 具体容器
 *
 * @author 非
 * @create 2018-11-04 16:24
 */
public class ConcreteAggregate implements Aggregate {
    // 容纳对象的容器
    private Vector vector = new Vector();

    public void add(Object object) {
        this.vector.add(object);
    }

    public void remove(Object object) {
        this.vector.remove(object);
    }

    public Iterator iterator() {
        return new ConcreteIterator(this.vector);
    }
}
