package com.xyz.pattern.iterator.common_iterator;

import java.util.Vector;

/**
 * description: 具体迭代器
 *
 * @author 非
 * @create 2018-11-04 16:18
 */
public class ConcreteIterator implements Iterator {
    private Vector vector = new Vector();
    // 定义当前游标
    private int cursor = 0;

    public ConcreteIterator(Vector vector) {
        this.vector = vector;
    }

    public Object next() {
        Object result = null;
        if (this.hasNext()) {
            result = this.vector.get(this.cursor++);
        }
        return result;
    }

    public boolean hasNext() {
        if (this.cursor == this.vector.size()) {
            return false;
        }
        return true;
    }

    public boolean remove() {
        this.vector.remove(this.cursor);
        return true;
    }
}
