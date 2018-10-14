package com.xyz.pattern.decorator.decorator01;

/**
 * @auth: liuyang
 * @date: 2018/10/14 18:51
 * 家长类
 */
public class Father {
    public static void main(String[] args) {
        // 把成绩单拿过来
        SchoolReport sr = new FouthGradeSchoolReport();
        // 看成绩单
        sr.report();
        // 签名？休想！
    }
}
