package com.xyz.pattern.factory.simple_factory_pattern;

import javax.sound.midi.Soundbank;

/**
 * @auth: liuyang
 * @date: 2018/9/15 18:40
 * 具体产品类1
 */
public class ConcreteProduct1 extends Product {
    @Override
    public void method2() {
        System.out.println("具体产品类1被生产");
    }
}
