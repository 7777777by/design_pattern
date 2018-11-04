package com.xyz.pattern.iterator.iterator01;

/**
 * description: 项目信息的实现
 *
 * @author 非
 * @create 2018-11-04 15:43
 */
public class Project implements IProject {
    private String name; //项目名称
    private int num = 0; //项目成员数量
    private int cost = 0; //项目费用

    public Project(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    public String getProjectInfo() {
        String info = "";
        info = info + "项目名称是：" + this.name;
        info = info + "\t项目人数：" + this.num;
        info = info + "\t项目费用：" + this.cost;
        return info;
    }
}
