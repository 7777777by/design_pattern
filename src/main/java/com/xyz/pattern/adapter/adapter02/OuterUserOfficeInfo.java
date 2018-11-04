package com.xyz.pattern.adapter.adapter02;

import java.util.HashMap;
import java.util.Map;

/**
 * description:
 *
 * @author 非
 * @create 2018-11-03 14:35
 */
public class OuterUserOfficeInfo implements IOuterUserOfficeInfo {
    public Map getUserOfficeInfo() {
        Map homeInfoMap = new HashMap();
        homeInfoMap.put("homeTelNumber", "员工的家庭电话是...");
        homeInfoMap.put("homeAddress", "员工的家庭地址是...");
        return homeInfoMap;
    }
}
