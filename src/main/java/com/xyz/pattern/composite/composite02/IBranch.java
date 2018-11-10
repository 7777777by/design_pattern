package com.xyz.pattern.composite.composite02;

import java.util.List;

/**
 * description: 树枝节点接口
 *
 * @author 非
 * @create 2018-11-10 12:36
 */
public interface IBranch extends ICorp {
    // 能够增加小兵（树叶节点）或者是经理（树枝节点）
    void addSubordinate(ICorp corp);
    // 获得下属信息
    List<ICorp> getSubordinate();
}
