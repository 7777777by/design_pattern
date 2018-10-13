package com.xyz.pattern.prototype.common_prototype;

/**
 * @auth: liuyang
 * @date: 2018/9/24 15:25
 * 原型模式通用代码
 */
public class PrototpyeClass implements Cloneable {
    public PrototpyeClass clone() {
        PrototpyeClass prototpyeClass = null;
        try {
            prototpyeClass = (PrototpyeClass) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototpyeClass;
    }
}
