package com.xyz.pattern.adapter.adapter02;

import java.util.HashMap;
import java.util.Map;

/**
 * description:
 *
 * @author 非
 * @create 2018-11-03 14:33
 */
public class OuterUserBaseInfo implements IOuterUserBaseInfo {
    public Map getUserBaseInfo() {
        Map baseInfoMap = new HashMap();
        baseInfoMap.put("userName", "这个员工的名字叫混世魔王...");
        baseInfoMap.put("mobileNumber", "这个员工的电话是...");
        return baseInfoMap;
    }
}
