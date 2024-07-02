package org.amit2.topics.designPattern.creational.singleton;

// LAZY LOADING SINGLETON DESIGN , WE ARE HANDLING   MULTITHREADING ASPECT HERE AS WELL

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Singleton {

    private int a ;
    private static Singleton instance ;
    //private static final Singleton instance = new Singleton() ;// -- > this is EAGERLY LOADING AND MULTI THREADING Access is Handled auto
    private Singleton(){

    }
//    public static Singleton getInstance(){
//        return instance;
//    }
    public static Singleton getInstance(){
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }



}
