package com.xyz.pricinple.oac;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @auth: liuyang
 * @date: 2018/9/13 20:25
 * 书店打折销售类
 */
public class OffBookStore {
    private static final List<IBook> BOOK_LIST = new ArrayList<IBook>();

    // 静态模块初始化数据，实际项目中一般是由持久层完成
    static {
        BOOK_LIST.add(new OffNovelBook("天龙八部", 3200, "金庸"));
        BOOK_LIST.add(new OffNovelBook("巴黎圣母院", 5600, "雨果"));
        BOOK_LIST.add(new OffNovelBook("悲惨世界", 3500, "雨果"));
        BOOK_LIST.add(new OffNovelBook("诛仙", 4300, "萧鼎"));
    }

    // 模拟书店买书
    public static void main(String[] args) {
        NumberFormat formater = NumberFormat.getCurrencyInstance();
        formater.setMaximumFractionDigits(2);
        System.out.println("------书店卖出去的书籍记录如下------");
        for (IBook book : BOOK_LIST) {
            System.out.println("书籍名称：" + book.getName() + "\t书籍作者：" + book.getAuthor() + "\t" + "书籍价格：" +
                    formater.format(book.getPrice() / 100) + "元");
        }
    }
}
