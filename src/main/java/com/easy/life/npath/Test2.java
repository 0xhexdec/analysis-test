package com.easy.life.npath;

public abstract class Test2 {
  // 128
  public void foo() { // violation, NPath complexity is 128 (max allowed is 100)
    int a, b, t, m, n;
    a = b = t = m = n = 0;

    // Complexity is achieved by choosing from 2 options 7 times (2^7 = 128 possible outcomes)
    if (a > b) { // non-nested if-else decision tree multiplies complexity by 2
      bar();
    } else {
      baz();
    }

    print(t > 1 ? bar() : baz()); // 5 ternary statements multiply complexity by 2^5
    print(t > 2 ? bar() : baz());
    print(t > 3 ? bar() : baz());
    print(t > 4 ? bar() : baz());
    print(t > 5 ? bar() : baz());

    if (m > n) { // multiplies complexity by 2
      baz();
    } else {
      bar();
    }
  }

  // 1
  public abstract String bar();

  // 1
  public abstract String baz();

  // 1
  public abstract void print(String str);
}