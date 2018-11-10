package com.xyz.pattern.composite.composite01;

import java.util.List;

/**
 * description: 根节点接口
 *
 * @author 非
 * @create 2018-11-06 18:53
 */
public interface IRoot {
    // 得到总经理信息
    String getInfo();
    // 增加下属
    void add(IBranch branch);
    // 增加叶子节点
    void add(ILeaf leaf);
    // 遍历查看下属
    List getSubordinateInfo();
}
