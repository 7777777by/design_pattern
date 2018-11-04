package com.xyz.pattern.iterator.common_iterator;

/**
 * description:
 *
 * @author 非
 * @create 2018-11-04 16:26
 */
public class Client {
    public static void main(String[] args) {
        // 声明出容器
        Aggregate aggregate = new ConcreteAggregate();
        // 产生对象数据放进去
        aggregate.add("abc");
        aggregate.add("aaa");
        aggregate.add("123");
        // 遍历
        Iterator iterator = aggregate.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
