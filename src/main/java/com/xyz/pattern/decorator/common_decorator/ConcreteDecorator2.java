package com.xyz.pattern.decorator.common_decorator;

/**
 * @auth: liuyang
 * @date: 2018/10/14 19:32
 * 具体的装饰类
 */
public class ConcreteDecorator2 extends Decorator {
    public ConcreteDecorator2(Component component) {
        super(component);
    }

    // 定义自己的修饰方法
    private void method2() {
        System.out.println("method2 修饰");
    }

    @Override
    public void operate() {
        super.operate();
        this.method2();
    }
}
