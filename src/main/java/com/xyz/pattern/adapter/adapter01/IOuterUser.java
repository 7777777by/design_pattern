package com.xyz.pattern.adapter.adapter01;

import java.util.Map;

/**
 * description: 外包公司的人员信息接口
 *
 * @author 非
 * @create 2018-11-03 13:57
 */
public interface IOuterUser {
    // 基本信息，如名称，性别，手机号码等
    Map getUserBaseInfo();
    // 工作区域信息
    Map getUserOfficeInfo();
    // 用户的家庭信息
    Map getUserHomeInfo();
}
