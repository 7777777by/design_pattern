package com.xyz.pricinple.dip.dip02;

/**
 * @auth: liuyang
 * @date: 2018/9/9 15:57
 * 司机接口
 */
public interface IDriver {
    void drive(ICar iCar);
    void drive();
    // 车辆型号
    void setCar(ICar car);
}
