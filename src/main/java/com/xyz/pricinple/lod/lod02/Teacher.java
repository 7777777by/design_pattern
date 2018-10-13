package com.xyz.pricinple.lod.lod02;

/**
 * @auth: liuyang
 * @date: 2018/9/12 20:24
 * 老师类
 */
public class Teacher {
    // 老师对体育委员发布命令，清一下女生
    public void command(GroupLeder groupLeder) {
        // 告诉体育委员开始执行清查任务
        groupLeder.countGirls();
    }
}
