package com.qihe1.StrategyPattern;

public class FlyWithWings implements FlyBeHavior {
    @Override
    public void fly() {
        System.out.println(" I'm flying! !");
    }
}
