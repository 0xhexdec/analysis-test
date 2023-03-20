package com.easy.life.npath;

public class Test {
    private int a;

    // 1
    public Test(int a) {
        this.a = a;
    }

    // 2
    public boolean booleanTest() {
        return false || a >= 10 && a != 33;
    }

    // 2
    public boolean path1(int a) {
        if (a > 10) {
            return true;
        } else {
            a += 1;
        }
        return false;
    }

    // 4
    public boolean path2(int a, int b) {
        return a > 10 && b>1  ? (a+100 <= 105 || a < 10) : a/5 > 10;
    }
}
