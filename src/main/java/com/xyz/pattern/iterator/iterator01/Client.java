package com.xyz.pattern.iterator.iterator01;

import java.util.ArrayList;
import java.util.List;

/**
 * description:
 *
 * @author 非
 * @create 2018-11-04 15:47
 */
public class Client {
    public static void main(String[] args) {
        // 定义一个List，存放所有的项目对象
        List<IProject> projectList = new ArrayList<IProject>();
        projectList.add(new Project("星球大战项目", 10, 100000));
        projectList.add(new Project("扭转时空项目", 100, 10000000));
        projectList.add(new Project("超人改造项目", 1000, 1000000000));
        // 这边100个项目
        for (int i = 4; i < 104; i++) {
            projectList.add(new Project("第" + i + "个项目", i * 5, i * 1000000));
        }
        // 取出所有数据
        for (IProject project : projectList) {
            System.out.println(project.getProjectInfo());
        }
    }
}
