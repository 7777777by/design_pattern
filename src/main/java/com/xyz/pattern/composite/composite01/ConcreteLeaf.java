package com.xyz.pattern.composite.composite01;

/**
 * description: 叶子节点的实现类
 *
 * @author 非
 * @create 2018-11-06 19:09
 */
public class ConcreteLeaf implements ILeaf {
    // 叶子叫什么名称
    private String name = "";
    // 叶子的职位
    private String position = "";
    // 叶子的薪水
    private int salary = 0;

    public ConcreteLeaf(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    // 获得自己的信息
    public String getInfo() {
        String info = "";
        info = info + "名称：" + this.name;
        info = info + "\t职位：" + this.position;
        info = info + "\t薪水：" + this.salary;
        return info;
    }
}
