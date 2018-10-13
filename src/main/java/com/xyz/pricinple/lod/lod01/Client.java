package com.xyz.pricinple.lod.lod01;

/**
 * @auth: liuyang
 * @date: 2018/9/12 20:04
 * 迪米特法则 场景类
 */
public class Client {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        GroupLeader groupLeader = new GroupLeader();
        teacher.command(groupLeader);
    }
}
