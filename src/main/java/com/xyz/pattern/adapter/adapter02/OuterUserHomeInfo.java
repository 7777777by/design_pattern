package com.xyz.pattern.adapter.adapter02;

import java.util.HashMap;
import java.util.Map;

/**
 * description:
 *
 * @author 非
 * @create 2018-11-03 14:34
 */
public class OuterUserHomeInfo implements IOuterUserHomeInfo {
    public Map getUserHomeInfo() {
        Map officeInfoMap = new HashMap();
        officeInfoMap.put("jobPisition", "这个人的职位是...");
        officeInfoMap.put("officeTelNumber", "员工的办公电话是...");
        return officeInfoMap;
    }
}
