package com.xyz.pattern.prototype.prototype04;

import java.util.ArrayList;

/**
 * @auth: liuyang
 * @date: 2018/9/24 15:38
 * 浅拷贝
 */
public class Thing implements Cloneable {
    // 定义一个私有变量
    private ArrayList<String> arrayList = new ArrayList<String>();

    public Thing clone() {
        Thing thing = null;
        try {
            thing = (Thing) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }

    // 设置HashMap的值
    public void setValue(String value) {
        this.arrayList.add(value);
    }

    // 取得ArrayList的值
    public ArrayList<String> getValue() {
        return this.arrayList;
    }
}
