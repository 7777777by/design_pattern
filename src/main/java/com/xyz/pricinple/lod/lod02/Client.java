package com.xyz.pricinple.lod.lod02;

import java.util.ArrayList;
import java.util.List;

/**
 * @auth: liuyang
 * @date: 2018/9/12 20:25
 * 场景类
 */
public class Client {
    public static void main(String[] args) {
        // 产生一个女生群体
        List<Girl> girlList = new ArrayList<Girl>();
        for (int i = 0; i < 20; i++) {
            // 初始化女生
            girlList.add(new Girl());
        }
        GroupLeder groupLeder = new GroupLeder(girlList);
        Teacher teacher = new Teacher();
        teacher.command(groupLeder);
    }
}
