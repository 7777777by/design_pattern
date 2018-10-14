package com.xyz.pattern.decorator.common_decorator;

/**
 * @auth: liuyang
 * @date: 2018/10/14 19:29
 * 具体构件
 */
public class ConcreteComponent extends Component {
    // 具体实现
    @Override
    public void operate() {
        System.out.println("do something!");
    }
}
