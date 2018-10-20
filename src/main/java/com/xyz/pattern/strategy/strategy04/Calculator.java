package com.xyz.pattern.strategy.strategy04;

/**
 * @auth: liuyang
 * @date: 2018/10/20 17:29
 */
public enum Calculator {
    ADD("+"){
        @Override
        public int exec(int a, int b) {
            return a + b;
        }
    },
    SUB("-"){
        @Override
        public int exec(int a, int b) {
            return a - b;
        }
    };

    String value = "";

    private Calculator(String value) {
        this.value = value;
    }

    public abstract int exec(int a, int b);
}
