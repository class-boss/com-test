package com.qihe1.StrategyPattern;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBeHavior = new FlyNoWay();
        quackBehavior= new Quack();
    }

    @Override
    public void display() {

    }
}
