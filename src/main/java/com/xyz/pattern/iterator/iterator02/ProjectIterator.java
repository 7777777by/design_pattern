package com.xyz.pattern.iterator.iterator02;

import java.util.ArrayList;
import java.util.List;

/**
 * description:
 *
 * @author 非
 * @create 2018-11-04 15:56
 */
public class ProjectIterator implements IProjectIterator {
    // 所有的项目都放在List中
    private List<IProject> projectList = new ArrayList<IProject>();
    private int currentItem = 0;

    public ProjectIterator(List<IProject> projectList) {
        this.projectList = projectList;
    }

    public boolean hasNext() {
        // 定义一个返回值
        boolean b = true;
        if (this.currentItem >= projectList.size() || this.projectList.get(this.currentItem) == null) {
            b = false;
        }
        return b;
    }

    public IProject next() {
        return this.projectList.get(this.currentItem++);
    }

    public void remove() {

    }
}
