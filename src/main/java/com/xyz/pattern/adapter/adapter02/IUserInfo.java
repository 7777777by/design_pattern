package com.xyz.pattern.adapter.adapter02;

/**
 * description:员工信息接口
 *
 * @author 非
 * @create 2018-11-03 13:46
 */
public interface IUserInfo {
    // 获得用户姓名
    String getUserName();
    // 获得家庭地址
    String getHomeAddress();
    // 手机号码
    String getMobileNumber();
    // 办公电话
    String getOfficeTelNumber();
    // 职位
    String getJobPosition();
    // 家庭电话
    String getHomeTelNumber();
}
