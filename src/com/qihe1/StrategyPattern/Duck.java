package com.qihe1.StrategyPattern;

public abstract class Duck {
    FlyBeHavior flyBeHavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    public void performFly(){
        flyBeHavior.fly();
    }

    public void perforQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All ducks float,even decoys!");
    }

    public void setFlyBeHavior(FlyBeHavior flyBeHavior) {
        this.flyBeHavior = flyBeHavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
