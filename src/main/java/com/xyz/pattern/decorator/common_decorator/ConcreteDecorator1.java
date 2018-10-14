package com.xyz.pattern.decorator.common_decorator;

/**
 * @auth: liuyang
 * @date: 2018/10/14 19:32
 * 具体的装饰类
 */
public class ConcreteDecorator1 extends Decorator {
    public ConcreteDecorator1(Component component) {
        super(component);
    }

    // 定义自己的修饰方法
    private void method1() {
        System.out.println("method1 修饰");
    }

    @Override
    public void operate() {
        this.method1();
        super.operate();
    }
}
