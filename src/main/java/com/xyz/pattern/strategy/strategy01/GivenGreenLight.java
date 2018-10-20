package com.xyz.pattern.strategy.strategy01;

/**
 * @auth: liuyang
 * @date: 2018/10/20 16:34
 * 吴国太开绿灯
 */
public class GivenGreenLight implements IStrategy {
    public void operate() {
        System.out.println("找吴国太开绿灯，放行！");
    }
}
