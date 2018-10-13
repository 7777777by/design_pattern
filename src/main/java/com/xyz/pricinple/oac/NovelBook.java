package com.xyz.pricinple.oac;

/**
 * @auth: liuyang
 * @date: 2018/9/13 20:07
 * 小说类
 */
public class NovelBook implements IBook {
    private String name;
    private int price;
    private String author;

    // 通过构造函数传递书籍数据
    public NovelBook(String name, int price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public String getAuthor() {
        return this.author;
    }
}
