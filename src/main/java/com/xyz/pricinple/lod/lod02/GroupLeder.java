package com.xyz.pricinple.lod.lod02;

import java.util.List;

/**
 * @auth: liuyang
 * @date: 2018/9/12 20:22
 * 体育委员类
 */
public class GroupLeder {
    private List<Girl> girlList;

    // 传递全班的女生进来
    public GroupLeder(List<Girl> girlList) {
        this.girlList = girlList;
    }

    // 清查女生数量
    public void countGirls() {
        System.out.println("女生的数量是：" + this.girlList.size());
    }
}
