package com.xyz.pattern.mediator.mediator02;

/**
 * @auth: liuyang
 * @date: 2018/9/24 17:15
 * 库存管理
 */
public class Stock extends AbstractColleague {
    public Stock(AbstractMediator mediator) {
        super(mediator);
    }

    // 刚开始有100台电脑
    private static int COMPUTER_COUNT = 100;

    // 库存增加
    public void increase(int number) {
        COMPUTER_COUNT += number;
        System.out.println("库存数量为：" + COMPUTER_COUNT);
    }

    // 库存降低
    public void decrease(int number) {
        COMPUTER_COUNT -= number;
        System.out.println("库存数量为：" + COMPUTER_COUNT);
    }

    // 获得库存数量
    public int getStockNumber() {
        return COMPUTER_COUNT;
    }

    // 存货压力大了，就要通知采购人员停止采购，销售人员要尽快销售
    public void clearStock() {
        System.out.println("清理库存数量为：" + COMPUTER_COUNT);
        super.mediator.execute("stock.clear");
    }
}
