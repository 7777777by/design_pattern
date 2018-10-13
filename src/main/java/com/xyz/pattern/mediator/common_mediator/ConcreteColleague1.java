package com.xyz.pattern.mediator.common_mediator;

/**
 * @auth: liuyang
 * @date: 2018/9/24 18:26
 */
public class ConcreteColleague1 extends Colleague {
    // 通过构造函数传递中介者
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    // 自有方法 self-method
    public void selfMethod1() {
        // 处理自己的业务逻辑
    }

    // 依赖方法 dep-mehod
    public void depMethod1() {
        // 处理自己的业务逻辑
        // 自己不能处理的业务逻辑，委托给中介处理
        super.mediator.doSomething1();
    }
}
