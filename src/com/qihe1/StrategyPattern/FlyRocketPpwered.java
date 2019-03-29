package com.qihe1.StrategyPattern;

public class FlyRocketPpwered implements FlyBeHavior {
    @Override
    public void fly() {
        System.out.println("I'm fyling with a rocket !");
    }
}
