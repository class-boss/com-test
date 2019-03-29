package com.qihe1.StrategyPattern;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.perforQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBeHavior(new FlyRocketPpwered());
        model.performFly();
    }
}
