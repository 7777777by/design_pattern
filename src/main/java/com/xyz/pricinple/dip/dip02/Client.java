package com.xyz.pricinple.dip.dip02;

/**
 * @auth: liuyang
 * @date: 2018/9/9 15:59
 */
public class Client {
    public static void main(String[] args) {
        IDriver driver = new Driver();
//        driver.drive(new Benz());
        driver.drive(new BMW());
    }
}
