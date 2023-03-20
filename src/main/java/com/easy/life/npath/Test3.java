package com.easy.life.npath;

public class Test3 {
    private int actr = 0;

    // should be npath = 16
    public void test(String ch) {
        if (ch == "a") {
            actr++;
            func_a();
        }
        if (ch == "b") {
            actr++;
            func_a();
        }
        if (ch == "c") {
            actr++;
            func_a();
        }
        if (ch == "d") {
            actr++;
            func_a();
        }
    }

    // should be npath = 80
    public void test2(String c) {
        if (c == "a") {
            actr++;
        }
        if (c == "b") {
            actr++;
        }
        if (c == "c") {
            actr++;
        }
        if (c == "d") {
            actr++;
        }
        if (c != "a" && c != "b" && c != "c" &&
                c != "d") {
            actr++;
        }
    }
    // should be npath = 5
    public void test3(String c) {
        switch (c) {
            case "a":
                actr++;
                break;
            case "b":
                actr++;
                break;
            case "c":
                actr++;
                break;
            case "d":
                actr++;
                break;
            default:
                actr++;
                break;
        }
    }

    // should be 3
    public void test3(int c, int b) {
        while (c > 0 && b > 10) {
            c--;
            b--;
        }
    }

    private void func_a() {
    }

}
