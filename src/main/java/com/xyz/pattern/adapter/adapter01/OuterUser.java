package com.xyz.pattern.adapter.adapter01;

import java.util.HashMap;
import java.util.Map;

/**
 * description: 外包公司的人员实现
 *
 * @author 非
 * @create 2018-11-03 13:59
 */
public class OuterUser implements IOuterUser {
    public Map getUserBaseInfo() {
        Map baseInfoMap = new HashMap();
        baseInfoMap.put("userName", "这个员工的名字叫混世魔王...");
        baseInfoMap.put("mobileNumber", "这个员工的电话是...");
        return baseInfoMap;
    }

    public Map getUserOfficeInfo() {
        Map officeInfoMap = new HashMap();
        officeInfoMap.put("jobPisition", "这个人的职位是...");
        officeInfoMap.put("officeTelNumber", "员工的办公电话是...");
        return officeInfoMap;
    }

    public Map getUserHomeInfo() {
        Map homeInfoMap = new HashMap();
        homeInfoMap.put("homeTelNumber", "员工的家庭电话是...");
        homeInfoMap.put("homeAddress", "员工的家庭地址是...");
        return homeInfoMap;
    }
}
