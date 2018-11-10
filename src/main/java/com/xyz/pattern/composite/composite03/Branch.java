package com.xyz.pattern.composite.composite03;

import java.util.ArrayList;
import java.util.List;

/**
 * description: 树枝节点
 *
 * @author 非
 * @create 2018-11-10 13:00
 */
public class Branch extends Corp {
    private List<Corp> subordinateList = new ArrayList<Corp>();

    public Branch(String name, String position, int salary) {
        super(name, position, salary);
    }

    public void addSubordinate(Corp corp) {
        corp.setParent(this);
        this.subordinateList.add(corp);
    }

    public List<Corp> getSubordinateList() {
        return this.subordinateList;
    }
}
