package com.qihe6.CommandMode.s1;

import com.qihe6.CommandMode.Command;

public class GarageDoorUpCommand implements Command {
    GarageDoor garageDoor;
    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor=garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.Up();
    }
}
