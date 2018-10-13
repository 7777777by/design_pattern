package com.xyz.pattern.template_method.template_method01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @auth: liuyang
 * @date: 2018/9/16 19:00
 */
public class NewClient {
    public static void main(String[] args) throws IOException {
        System.out.println("-----H1型号悍马-----");
        System.out.println("H1型号的悍马是否需要喇叭声响？0 - 不需要     1 - 需要");
        String type = new BufferedReader(new InputStreamReader(System.in)).readLine();
        NewHummerH1Model h1 = new NewHummerH1Model();
        if ("0".equals(type)) {
            h1.setAlarm(false);
        }
        h1.run();
        System.out.println("\n-----H1型号悍马-----");
        NewHummerH2Model h2 = new NewHummerH2Model();
        h2.run();
    }
}
