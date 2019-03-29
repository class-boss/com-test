package com.qihe1.StrategyPattern;

public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBeHavior = new FlyWithWings();

    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
