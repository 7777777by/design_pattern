package com.xyz.pricinple.dip.dip01;

/**
 * @auth: liuyang
 * @date: 2018/9/9 15:46
 * 司机
 */
public class Driver {
    // 司机的主要职责就是驾驶汽车
    // 现在司机只能开奔驰，不能开宝马，同是C驾照，不现实，若要开宝马，需要修改Driver类，耦合性中，不稳定
    public void drive(BenZ benZ) {
        benZ.run();
    }
}
