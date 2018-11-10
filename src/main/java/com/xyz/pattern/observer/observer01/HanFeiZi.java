package com.xyz.pattern.observer.observer01;

/**
 * description: 具体的被观察者
 *
 * @author 非
 * @create 2018-11-10 13:56
 */
public class HanFeiZi implements IHanFeiZi {
    // 是否在吃饭，作为监控的标准
    private boolean isHavingBreakFast = false;
    // 是否在娱乐
    private boolean isHavingFun = false;

    public boolean isHavingBreakFast() {
        return isHavingBreakFast;
    }

    public void setHavingBreakFast(boolean havingBreakFast) {
        isHavingBreakFast = havingBreakFast;
    }

    public boolean isHavingFun() {
        return isHavingFun;
    }

    public void setHavingFun(boolean havingFun) {
        isHavingFun = havingFun;
    }

    public void haveBreakfast() {
        System.out.println("韩非子：开始吃饭了...");
        this.isHavingBreakFast = true;
    }

    public void haveFun() {
        System.out.println("韩非子：开始娱乐了...");
        this.isHavingFun = true;
    }
}
