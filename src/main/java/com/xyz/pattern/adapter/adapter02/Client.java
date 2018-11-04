package com.xyz.pattern.adapter.adapter02;

/**
 * description:
 *
 * @author 非
 * @create 2018-11-03 14:40
 */
public class Client {
    public static void main(String[] args) {
        // 外包人员信息
        IOuterUserBaseInfo baseInfo = new OuterUserBaseInfo();
        IOuterUserOfficeInfo officeInfo = new OuterUserOfficeInfo();
        IOuterUserHomeInfo homeInfo = new OuterUserHomeInfo();
        // 传递三个对象
        IUserInfo userInfo = new OuterUserInfo(baseInfo, officeInfo, homeInfo);
        for (int i = 0; i < 10; i++) {
            System.out.println(userInfo.getMobileNumber());
        }
    }
}
