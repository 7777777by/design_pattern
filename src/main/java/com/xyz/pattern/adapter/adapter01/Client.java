package com.xyz.pattern.adapter.adapter01;

/**
 * description:
 *
 * @author 非
 * @create 2018-11-03 14:11
 */
public class Client {
    public static void main(String[] args) {
        // 没有与外系统连接的时候，这样写的
        IUserInfo userInfo = new UserInfo();
        // 从数据库中查到10个
        for (int i = 0; i < 10; i++) {
            userInfo.getMobileNumber();
        }
        // 查看外包人员的信息
        IUserInfo youngGirl = new OuterUserInfo();
        for (int i = 0; i < 100; i++) {
            youngGirl.getMobileNumber();
        }
    }
}
