package com.qihe3.Decorate;

public class DarkRoast extends Beverage{
    public DarkRoast() {
        description="DarkRoast";
    }

    @Override
    public double cost() {
        return .88;
    }
}
