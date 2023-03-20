package com.hard.work;

import com.easy.life.RandomInterface;

public abstract class Worker implements RandomInterface{
    String name;

    Worker(String name) {
        this.name = name;
        System.out.println("Hey, this is " + name);
    }

    public void work(String[] coworkers) {
        whisperAround("Steve");
        whisperAround("Debby");
        sayItLoud("Karen");
        whisperAround("Mandy");
        screamItOut("Thomas");
    }
}
