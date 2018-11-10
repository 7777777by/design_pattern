package com.xyz.pattern.composite.composite02;

/**
 * description: 树叶实现类
 *
 * @author 非
 * @create 2018-11-10 12:39
 */
public class Leaf implements ILeaf {
    private String name = "";
    private String position = "";
    private int salary = 0;

    public Leaf(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getInfo() {
        String info = "";
        info = info + "名称：" + this.name;
        info = info + "\t职位：" + this.position;
        info = info + "\t薪水：" + this.salary;
        return info;
    }
}
