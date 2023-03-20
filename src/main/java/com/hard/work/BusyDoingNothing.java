package com.hard.work;

interface SomeInterface {
  void workHard(int time);
}

class SomeOtherClass implements SomeInterface{
  int i;
  SomeOtherClass(int i) {
    this.i = i;
    System.out.println("new SomeOtherClass");
  }

  @Override
  public void workHard(int time) {
    System.out.println("Work very hard!");
  }
}
public class BusyDoingNothing {
  private class PrivateClass {
    PrivateClass() {
      System.out.println("new Private Class");
    }
  }

  public BusyDoingNothing() {
    PrivateClass privateClass = new PrivateClass();
    SomeOtherClass someOtherClass = new SomeOtherClass(5);
  }
  public static void main(String[] args) {
    System.out.println("Hello world!");
    BusyDoingNothing busyDoingNothing = new BusyDoingNothing();
    SecondFile secondFile = new SecondFile();
    Worker clive = new SmartWorker("Clive");
  }
}