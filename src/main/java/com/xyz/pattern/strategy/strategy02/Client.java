package com.xyz.pattern.strategy.strategy02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @auth: liuyang
 * @date: 2018/10/20 17:06
 */
public class Client {
    public static void main(String[] args) {
        // 输入两个参数是数字
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入第一个数字：");
        int a  = scanner.nextInt();
        System.out.print("输入第二个数字：");
        int b = scanner.nextInt();
        System.out.print("输入运算符号：");
        String symbol = scanner.next(); // 符号
        // 生成一个运算器
        Calculator cal = new Calculator();
        System.out.println("运算结果为：" + a + symbol + b + "=" + cal.exec(a, b, symbol));
    }
}
