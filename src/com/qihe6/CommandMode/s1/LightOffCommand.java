package com.qihe6.CommandMode.s1;

import com.qihe6.CommandMode.Command;
import com.qihe6.CommandMode.Light;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
