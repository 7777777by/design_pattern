package com.xyz.pattern.iterator.iterator02;

/**
 * description: 项目信息接口
 *
 * @author 非
 * @create 2018-11-04 15:53
 */
public interface IProject {
    // 增加项目
    void add(String name, int num, int cost);
    // 获取项目信息
    String getProjectInfo();
    // 获得一个可以被遍历的对象
    IProjectIterator iterator();
}
