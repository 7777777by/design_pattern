package com.xyz.pricinple.lod.lod03_1;

import com.xyz.pricinple.lod.lod03.InstallSoftware;
import com.xyz.pricinple.lod.lod03.Wizard;

/**
 * @auth: liuyang
 * @date: 2018/9/12 20:36
 * 场景类
 */
public class Client {
    public static void main(String[] args) {
        com.xyz.pricinple.lod.lod03.InstallSoftware installSoftware = new InstallSoftware();
        installSoftware.installWizard(new Wizard());
    }
}
