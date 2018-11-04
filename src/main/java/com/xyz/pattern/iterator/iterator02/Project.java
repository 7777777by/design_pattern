package com.xyz.pattern.iterator.iterator02;

import java.util.ArrayList;
import java.util.List;

/**
 * description: 项目信息实现类
 *
 * @author 非
 * @create 2018-11-04 15:57
 */
public class Project implements IProject {
    // 定义一个项目列表，所有的项目都放在这里
    private List<IProject> projectList = new ArrayList<IProject>();
    private String name; // 项目名称
    private int num = 0; // 项目人数
    private int cost = 0; // 项目费用

    public Project() {
    }

    public Project(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    public void add(String name, int num, int cost) {
        this.projectList.add(new Project(name, num, cost));
    }

    public String getProjectInfo() {
        String info = "";
        info = info + "项目名称是：" + this.name;
        info = info + "\t项目人数：" + this.num;
        info = info + "\t项目费用：" + this.cost;
        return info;
    }

    public IProjectIterator iterator() {
        return new ProjectIterator(this.projectList);
    }
}
