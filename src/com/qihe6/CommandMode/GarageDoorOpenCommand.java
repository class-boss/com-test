package com.qihe6.CommandMode;

public class GarageDoorOpenCommand implements Command{

    Light light;

    public GarageDoorOpenCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
