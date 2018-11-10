package com.xyz.pattern.observer.observer01;

/**
 * description: 间谍
 *
 * @author 非
 * @create 2018-11-10 14:03
 */
public class Spy implements Runnable {
    private HanFeiZi hanFeiZi;
    private LiSi liSi;
    private String type;

    public Spy(HanFeiZi hanFeiZi, LiSi liSi, String type) {
        this.hanFeiZi = hanFeiZi;
        this.liSi = liSi;
        this.type = type;
    }

    public void run() {
        while (true) {
            if (this.type.equals("breakfast")) {
                // 监控是否在吃早餐
                if (this.hanFeiZi.isHavingBreakFast()) {
                    // 如果发现韩非子在吃饭，就通知李斯
                    this.liSi.update("韩非子在吃饭");
                    // 重置状态，继续监控
                    this.hanFeiZi.setHavingBreakFast(false);
                } else {
                    // 监控是否在娱乐
                    if (this.hanFeiZi.isHavingFun()) {
                        this.liSi.update("韩非子在娱乐");
                        this.hanFeiZi.setHavingFun(false);
                    }
                }
            }
        }
    }
}
