package com.xyz.pattern.template_method.template_method02;

/**
 * @auth: liuyang
 * @date: 2018/9/16 16:17
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass class1 = new ConcreteClass1();
        AbstractClass class2 = new ConcreteClass2();
        class1.templateMethod();
        class2.templateMethod();
    }
}
