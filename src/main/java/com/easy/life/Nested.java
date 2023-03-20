package com.easy.life;

public class Nested {
    public void heavyNested() {
        if(true) {
            while(true) {
                for(int i = 0; i < 100; i++) {
                    if(i > 50) {

                    } else {
                        if(true) {
                            System.out.println("Ayyy");
                        }
                    }
                }
            }
        }
    }
    public void heavyNested2(int a) {
        synchronized(this) {
            switch (a) {
                case 5:
                    
                    break;
            
                default:
                    break;
            }
        }
    }
}
