package com.xyz.pattern.decorator.decorator03;

/**
 * @auth: liuyang
 * @date: 2018/10/14 19:16
 * 老爸查看修饰后的成绩单
 */
public class Father {
    public static void main(String[] args) {
        // 把成绩单拿过来
        SchoolReport sr;
        // 原装的成绩单
        sr = new FouthGradeSchoolReport();
        // 加强的最高分说明的成绩单
        sr = new HighScoreDecorator(sr);
        // 又加了成绩排名的说明
        sr = new SortDecorator(sr);
        // 看成绩单
        sr.report();
        // 然后老爸一看，很开心，就签名了
        sr.sign("老三");
    }
}
