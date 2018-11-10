package com.xyz.pattern.composite.composite02;

import java.util.ArrayList;
import java.util.List;

/**
 * description:
 *
 * @author 非
 * @create 2018-11-10 12:40
 */
public class Branch implements IBranch {
    private String name = "";
    private String position = "";
    private int salary = 0;
    private List<ICorp> corpList = new ArrayList<ICorp>();

    public Branch(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void addSubordinate(ICorp corp) {
        this.corpList.add(corp);
    }

    public List<ICorp> getSubordinate() {
        return this.corpList;
    }

    public String getInfo() {
        String info = "";
        info = info + "名称：" + this.name;
        info = info + "\t职位：" + this.position;
        info = info + "\t薪水：" + this.salary;
        return info;
    }
}
