package com.xyz.pattern.prototype.prototype01;

import java.util.Random;

/**
 * @auth: liuyang
 * @date: 2018/9/24 14:54
 * 场景类:单线程发送没问题，但邮件数量庞大的时候，发送时间就很长
 */
public class Client {
    // 发送账单的数量，这个值是从数据库中获得
    private static int MAX_COUNT = 6;

    public static void main(String[] args) {
        // 模拟发送邮件
        int i = 0;
        // 把模板定义出来，这个是从数据库中获得
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("XXX银行版权所有");
        while (i < MAX_COUNT) {
            // 以下是每封邮件不同的地方
            mail.setAppellation(getRandString(5) + " 先生（女士） ");
            mail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");
            // 然后发送邮件
            sendMail(mail);
            i++;
        }
    }

    // 发送邮件
    public static void sendMail(Mail mail) {
        System.out.println("标题：" + mail.getSubject() + "\t收件人：" + mail.getReceiver() + "\t...发送成功！");
    }

    public static String getRandString(int maxLength) {
        String source = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random rand = new Random();
        for (int i = 0; i < maxLength; i++) {
            sb.append(source.charAt(rand.nextInt(source.length())));
        }
        return sb.toString();
    }
}
