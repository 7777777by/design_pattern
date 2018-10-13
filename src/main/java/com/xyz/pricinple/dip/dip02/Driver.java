package com.xyz.pricinple.dip.dip02;

/**
 * @auth: liuyang
 * @date: 2018/9/9 15:58
 */
public class Driver implements IDriver {
    private ICar car;


    public Driver() {
    }

    // 构造函数注入
    public Driver(ICar car) {
        this.car = car;
    }

    // setter依赖注入
    public void setCar(ICar car) {
        this.car = car;
    }

    public void drive(ICar iCar) {
        iCar.run();
    }

    public void drive() {
        this.car.run();
    }
}
