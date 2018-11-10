package com.xyz.pattern.composite.composite03;

/**
 * description:
 *
 * @author 非
 * @create 2018-11-10 12:59
 */
public abstract class Corp {
    // 姓名
    private String name = "";
    // 职位
    private String position = "";
    // 薪水
    private int salary = 0;
    // 父类是谁
    private Corp parent;

    public Corp getParent() {
        return parent;
    }

    public void setParent(Corp parent) {
        this.parent = parent;
    }

    public Corp(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    // 获得员工信息
    public String getInfo() {
        String info = "";
        info = info + "名称：" + this.name;
        info = info + "\t职位：" + this.position;
        info = info + "\t薪水：" + this.salary;
        return info;
    }
}
