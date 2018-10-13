package com.xyz.pricinple.lod.lod03;

/**
 * @auth: liuyang
 * @date: 2018/9/12 20:36
 * 场景类
 */
public class Client {
    public static void main(String[] args) {
        InstallSoftware installSoftware = new InstallSoftware();
        installSoftware.installWizard(new Wizard());
    }
}
