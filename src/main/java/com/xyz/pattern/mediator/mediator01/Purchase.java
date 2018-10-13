package com.xyz.pattern.mediator.mediator01;

/**
 * @auth: liuyang
 * @date: 2018/9/24 16:48
 * 采购管理
 */
public class Purchase {
    // 采购IBM电脑
    public void buyIBMComputer(int number) {
        // 访问库存
        Stock stock = new Stock();
        // 访问销售
        Sale sale = new Sale();
        // 电脑的销售情况
        int saleStatus = sale.getSaleStatus();
        if (saleStatus > 80) {
            // 销售情况良好
            System.out.println("采购IBM电脑：" + number + "台");
            stock.increase(number);
        } else {
            // 销售情况不好
            int buyNum = number / 2;
            System.out.println("采购IBM电脑：" + buyNum + "台");
            stock.increase(buyNum);
        }
    }

    // 不再采购IBM电脑
    public void refuseBuyIBMComputer() {
        System.out.println("不再采购IBM电脑");
    }
}
