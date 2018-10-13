package com.xyz.pricinple.oac;

/**
 * @auth: liuyang
 * @date: 2018/9/13 20:49
 * 新增计算机书籍接口，用来销售计算机类图书
 */
public interface IComputerBook extends IBook {
    // 计算机书籍有一个范围
    String getScope();
}
