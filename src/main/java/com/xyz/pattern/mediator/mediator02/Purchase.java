package com.xyz.pattern.mediator.mediator02;

/**
 * @auth: liuyang
 * @date: 2018/9/24 17:15
 * 采购管理
 */
public class Purchase extends AbstractColleague {
    public Purchase(AbstractMediator mediator) {
        super(mediator);
    }

    // 采购IBM电脑
    public void buyIBMComputer(int number) {
        super.mediator.execute("purchase.buy", number);
    }

    // 不再采购IBM电脑
    public void refuseBuyIBMComputer() {
        System.out.println("不再采购IBM电脑");
    }
}
