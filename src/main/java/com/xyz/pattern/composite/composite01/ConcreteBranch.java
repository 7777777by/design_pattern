package com.xyz.pattern.composite.composite01;

import java.util.ArrayList;
import java.util.List;

/**
 * description: 树枝节点实现类
 *
 * @author 非
 * @create 2018-11-06 19:05
 */
public class ConcreteBranch implements IBranch {
    // 存储子节点的信息
    private List subordinateList = new ArrayList();
    // 树枝节点的名称
    private String name = "";
    // 树枝节点的职位
    private String position = "";
    // 树枝节点的薪水
    private int salary = 0;

    public ConcreteBranch(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    // 获得自己树枝节点的信息
    public String getInfo() {
        String info = "";
        info = info + "名称：" + this.name;
        info = info + "\t职位：" + this.position;
        info = info + "\t薪水：" + this.salary;
        return info;
    }

    // 增加一个树枝节点
    public void add(IBranch branch) {
        this.subordinateList.add(branch);
    }

    // 增加一个叶子节点
    public void add(ILeaf leaf) {
        this.subordinateList.add(leaf);
    }

    // 获得下级的信息
    public List getSubordinateInfo() {
        return this.subordinateList;
    }
}
