package com.xyz.pattern.mediator.mediator01;

/**
 * @auth: liuyang
 * @date: 2018/9/24 17:07
 */
public class Client {
    public static void main(String[] args) {
        // 采购人员采购电脑
        System.out.println("------采购人员采购电脑------");
        Purchase purchase = new Purchase();
        purchase.buyIBMComputer(100);
        // 销售人员销售电脑
        System.out.println("------销售人员销售电脑------");
        Sale sale = new Sale();
        sale.sellIBMComputer(1);
        // 库房管理人员管理库存
        System.out.println("------库房管理人员管理库存------");
        Stock stock = new Stock();
        stock.clearStock();
    }
}
