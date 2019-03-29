package com.qihe6.CommandMode.s1;

import com.qihe6.CommandMode.Command;

public class GarageDoorDownCommand implements Command {
    GarageDoor garageDoor;
    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor=garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.Down();
    }
}
