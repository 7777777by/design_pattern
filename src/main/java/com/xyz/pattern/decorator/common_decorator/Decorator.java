package com.xyz.pattern.decorator.common_decorator;

/**
 * @auth: liuyang
 * @date: 2018/10/14 19:30
 * 抽象装饰者
 */
public class Decorator extends Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    // 委托给被修饰者执行
    @Override
    public void operate() {
        this.component.operate();
    }
}
