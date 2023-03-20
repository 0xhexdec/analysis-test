package com.hard.work;

import com.easy.life.ColorsIKnow;

public class SmartWorker extends Worker {
    SmartWorker(String name) {
        super(name);
        work(null);
    }


    @Override
    public void hakunaMatata() {
        System.out.println("Whooo-Zaaaahhh!");
    }


    @Override
    public void whisperAround(String nameString) {
        System.out.print("What should I take?");
        for(ColorsIKnow color : ColorsIKnow.values())
        System.out.print(" " + color.name() + " ...");    
        System.out.println(" Hmm?");
    }
    
    
    @Override
    public void sayItLoud(String nameString) {
        System.out.println("Damn " + nameString + ", that was my yoghurt.");
    }


    @Override
    public void screamItOut(String nameString) {
        System.out.println("THE PRINTER ISN'T WORKNG, AGAIN! CALL " + nameString + " FROM THE IT!");
    }
}
