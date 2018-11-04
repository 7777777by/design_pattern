package com.xyz.pattern.iterator.iterator02;

/**
 * description:
 *
 * @author 非
 * @create 2018-11-04 16:08
 */
public class Boss {
    public static void main(String[] args) {
        // 定义一个List，存放所有的项目信息
        IProject project = new Project();
        project.add("星球大战项目dddd", 10, 100000);
        project.add("扭转时空项目", 100, 10000000);
        project.add("超人改造项目", 1000, 1000000000);
        // 这边100个项目
        for (int i = 4; i < 104; i++) {
            project.add("第" + i + "个项目", i * 5, i * 1000000);
        }
        IProjectIterator projectIterator = project.iterator();
        while (projectIterator.hasNext()) {
            IProject p = (IProject) projectIterator.next();
            System.out.println(p.getProjectInfo());
        }
    }
}
