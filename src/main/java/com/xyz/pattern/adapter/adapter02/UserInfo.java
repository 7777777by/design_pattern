package com.xyz.pattern.adapter.adapter02;

/**
 * description:员工信息
 *
 * @author 非
 * @create 2018-11-03 13:49
 */
public class UserInfo implements IUserInfo {
    public String getUserName() {
        System.out.println("姓名叫做...");
        return null;
    }

    public String getHomeAddress() {
        System.out.println("这里是员工的家庭地址...");
        return null;
    }

    public String getMobileNumber() {
        System.out.println("手机号码是0000...");
        return null;
    }

    public String getOfficeTelNumber() {
        System.out.println("办公室电话是...");
        return null;
    }

    public String getJobPosition() {
        System.out.println("职位是...");
        return null;
    }

    public String getHomeTelNumber() {
        System.out.println("员工的家庭电话是...");
        return null;
    }
}
