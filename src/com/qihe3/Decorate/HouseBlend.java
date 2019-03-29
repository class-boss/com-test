package com.qihe3.Decorate;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description="House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
