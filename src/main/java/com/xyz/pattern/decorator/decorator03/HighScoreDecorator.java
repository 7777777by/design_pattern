package com.xyz.pattern.decorator.decorator03;

/**
 * @auth: liuyang
 * @date: 2018/10/14 19:11
 * 最高成绩修饰
 */
public class HighScoreDecorator extends Decorator {
    public HighScoreDecorator(SchoolReport sr) {
        super(sr);
    }

    // 我要汇报最高成绩
    private void reportHighScore() {
        System.out.println("这次考试语文最高是78， 数学是75， 自然是80");
    }

    // 我要在老爸看成绩单前告诉他最高成绩，否则等他一看，就抡起扫帚揍我，我哪里还有机会说啊
    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }
}
