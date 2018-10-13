package com.xyz.pricinple.oac;

import junit.framework.TestCase;

/**
 * @auth: liuyang
 * @date: 2018/9/13 20:33
 */
public class NovelBookTest extends TestCase {
    private String name = "平凡的世界";
    private int price = 6000;
    private String author = "路遥";

    private IBook novelBook = new NovelBook(name, price, author);

    // 测试getPrice() 方法
    public void testGetPrice() {
        // 原价销售，根据输入和输出的值是否相等进行断言
        super.assertEquals(this.price, this.novelBook.getPrice());
    }
}
