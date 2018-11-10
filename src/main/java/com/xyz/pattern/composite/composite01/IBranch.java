package com.xyz.pattern.composite.composite01;

import java.util.List;

/**
 * description: 树枝节点
 *
 * @author 非
 * @create 2018-11-06 18:56
 */
public interface IBranch {
    // 获得信息
    String getInfo();
    // 增加树枝节点
    void add(IBranch branch);
    // 增加叶子结点
    void add(ILeaf leaf);
    // 获得下级信息
    List getSubordinateInfo();
}
