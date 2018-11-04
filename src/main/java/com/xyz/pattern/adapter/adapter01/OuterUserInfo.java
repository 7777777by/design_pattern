package com.xyz.pattern.adapter.adapter01;

import java.util.Map;

/**
 * description: 中转角色
 *
 * @author 非
 * @create 2018-11-03 14:03
 */
public class OuterUserInfo extends OuterUser implements IUserInfo {
    private Map baseInfoMap = super.getUserBaseInfo();  // 员工的基本信息
    private Map officeInfoMap = super.getUserOfficeInfo();  //员工的工作信息
    private Map homeInfoMap = super.getUserHomeInfo();  //员工的家庭信息

    public String getUserName() {
        String userName = (String) baseInfoMap.get("userName");
        System.out.println(userName);
        return userName;
    }

    public String getHomeAddress() {
        String homeAddress = (String) homeInfoMap.get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }

    public String getMobileNumber() {
        String mobileNumber = (String) baseInfoMap.get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }

    public String getOfficeTelNumber() {
        String officeTelNumber = (String) officeInfoMap.get("officeTelNumber");
        System.out.println(officeTelNumber);
        return officeTelNumber;
    }

    public String getJobPosition() {
        String jobPosition = (String) officeInfoMap.get("jobPosition");
        System.out.println(jobPosition);
        return jobPosition;
    }

    public String getHomeTelNumber() {
        String homeTelNumber = (String) homeInfoMap.get("homeTelNumber");
        System.out.println(homeTelNumber);
        return homeTelNumber;
    }
}
