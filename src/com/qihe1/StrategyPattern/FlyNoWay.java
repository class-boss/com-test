package com.qihe1.StrategyPattern;

public class FlyNoWay implements FlyBeHavior {
    @Override
    public void fly() {
        System.out.println(" I can't fly ");
    }
}
