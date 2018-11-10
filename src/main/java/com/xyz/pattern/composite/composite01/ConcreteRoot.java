package com.xyz.pattern.composite.composite01;

import java.util.ArrayList;
import java.util.List;

/**
 * description: 根节点的实现
 *
 * @author 非
 * @create 2018-11-06 18:58
 */
public class ConcreteRoot implements IRoot {
    // 保存根节点下的树枝节点和叶子节点，Subordinate的意思是下级
    private List subordinateList = new ArrayList();
    // 根节点的名称
    private String name = "";
    // 根节点的职位
    private String position = "";
    // 根节点的薪水
    private int salary = 0;

    public ConcreteRoot(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    // 得到自己的信息
    public String getInfo() {
        String info = "";
        info = info + "名称：" + this.name;
        info = info + "\t职位：" + this.position;
        info = info + "\t薪水：" + this.salary;
        return info;
    }

    // 增加树枝节点
    public void add(IBranch branch) {
        this.subordinateList.add(branch);
    }

    // 增加叶子节点
    public void add(ILeaf leaf) {
        this.subordinateList.add(leaf);
    }

    // 得到下级的信息
    public List getSubordinateInfo() {
        return this.subordinateList;
    }
}
