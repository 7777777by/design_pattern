package com.xyz.pattern.adapter.adapter02;

import java.util.Map;

/**
 * description: 适配器
 *
 * @author 非
 * @create 2018-11-03 14:35
 */
public class OuterUserInfo implements IUserInfo {
    // 源目标对象
    private IOuterUserBaseInfo baseInfo;
    private IOuterUserOfficeInfo officeInfo;
    private IOuterUserHomeInfo homeInfo;
    // 数据处理
    private Map baseMap;
    private Map officeMap;
    private Map homeMap;

    public OuterUserInfo(IOuterUserBaseInfo baseInfo, IOuterUserOfficeInfo officeInfo, IOuterUserHomeInfo homeInfo) {
        this.baseInfo = baseInfo;
        this.officeInfo = officeInfo;
        this.homeInfo = homeInfo;
        // 数据处理
        this.baseMap = this.baseInfo.getUserBaseInfo();
        this.officeMap = this.officeInfo.getUserOfficeInfo();
        this.homeMap = this.homeInfo.getUserHomeInfo();
    }

    public String getUserName() {
        String userName = (String) this.baseMap.get("userName");
        System.out.println(userName);
        return userName;
    }

    public String getHomeAddress() {
        String homeAddress = (String) this.homeMap.get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }

    public String getMobileNumber() {
        String mobileNumber = (String) this.baseMap.get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }

    public String getOfficeTelNumber() {
        String officeTelNumber = (String) this.officeMap.get("officeTelNumber");
        System.out.println(officeTelNumber);
        return officeTelNumber;
    }

    public String getJobPosition() {
        String jobPosition = (String) this.officeMap.get("jobPosition");
        System.out.println(jobPosition);
        return jobPosition;
    }

    public String getHomeTelNumber() {
        String homeTelNumber = (String) this.homeMap.get("homeTelNumber");
        System.out.println(homeTelNumber);
        return homeTelNumber;
    }
}
