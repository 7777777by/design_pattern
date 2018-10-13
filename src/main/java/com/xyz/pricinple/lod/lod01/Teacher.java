package com.xyz.pricinple.lod.lod01;

import java.util.ArrayList;
import java.util.List;

/**
 * @auth: liuyang
 * @date: 2018/9/12 19:59
 * 老师类：有一个朋友类GroupLeader，却又依赖了Girl类，违反了迪米特法则
 * 朋友类：出现在成员变量、方法的输入输出参数中的类称为成员朋友类，而出现在方法体内部的类不属于朋友类
 */
public class Teacher {
    // 老师对学生发布命令，清一下女生
    public void command(GroupLeader groupLeader){
        List<Girl> girlList = new ArrayList<Girl>();
        // 初始化女生
        for (int i = 0; i < 20; i++) {
            girlList.add(new Girl());
        }
        // 告诉体育委员开始执行清查任务
        groupLeader.countGirls(girlList);
    }
}
