package com.xyz.pricinple.oac;

/**
 * @auth: liuyang
 * @date: 2018/9/13 20:21
 * 扩展一个新类，用于处理打折出售的小说
 */
public class OffNovelBook extends NovelBook {
    public OffNovelBook(String name, int price, String author) {
        super(name, price, author);
    }

    // 覆写销售价格
    @Override
    public int getPrice() {
        // 原价
        int selfPrice = super.getPrice();
        int offPrice = 0;
        if (selfPrice > 4000) {
            // 原价大于40元时，打9折
            offPrice = selfPrice * 90 / 100;
        } else {
            offPrice = selfPrice * 80 / 100;
        }
        return offPrice;
    }
}
