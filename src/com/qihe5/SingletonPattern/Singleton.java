package com.qihe5.SingletonPattern;

public class Singleton {
    private volatile static Singleton uniqueInstance;

    private Singleton() {
    }
    //双重检查加锁
    public static Singleton getInstance(){
        if(uniqueInstance==null){
            synchronized(Singleton.class){
                if(uniqueInstance==null){
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }


}
