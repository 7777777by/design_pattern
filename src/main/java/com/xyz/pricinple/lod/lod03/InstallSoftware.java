package com.xyz.pricinple.lod.lod03;

/**
 * @auth: liuyang
 * @date: 2018/9/12 20:34
 * 软件安装类
 */
public class InstallSoftware {
    public void installWizard(Wizard wizard) {
        int first = wizard.first();
        // 根据first返回的结果，判断是否需要执行second
        if (first > 50) {
            int second = wizard.second();
            if (second > 50) {
                int third = wizard.third();
                if (third > 50) {
                    wizard.first();
                }
            }
        }
    }
}
