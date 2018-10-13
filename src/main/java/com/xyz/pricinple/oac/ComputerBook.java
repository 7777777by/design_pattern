package com.xyz.pricinple.oac;

/**
 * @auth: liuyang
 * @date: 2018/9/13 20:51
 * 计算机书籍类
 */
public class ComputerBook implements IComputerBook {
    private String name;
    private int price;
    private String author;
    private String scope;

    public ComputerBook(String name, int price, String author, String scope) {
        this.name = name;
        this.price = price;
        this.author = author;
        this.scope = scope;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public String getScope() {
        return scope;
    }
}
