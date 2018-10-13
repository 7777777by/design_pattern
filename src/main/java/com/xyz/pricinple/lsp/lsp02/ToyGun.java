package com.xyz.pricinple.lsp.lsp02;

/**
 * @auth: liuyang
 * @date: 2018/9/9 14:29
 * 玩具枪类，继承玩具类
 */
public class ToyGun extends AbstractToy {
    // 玩具枪是不能射击的，但是编译器又要求实现这个方法，怎么办？ 虚构一个呗！
    @Override
    public void shoot() {
        // 玩具枪不能射击，这个方法就不实现了
    }
}
