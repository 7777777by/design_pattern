package com.xyz.pattern.decorator.decorator02;

/**
 * @auth: liuyang
 * @date: 2018/10/14 18:51
 * 家长类
 */
public class Father {
    public static void main(String[] args) {
        // 把美化过的成绩单拿过来
        SchoolReport sr = new SugarFouthGradeSchoolReport();
        // 看成绩单
        sr.report();
        // 然后老爸一看，很开心，就签名了
        sr.sign("老三");
    }
}
