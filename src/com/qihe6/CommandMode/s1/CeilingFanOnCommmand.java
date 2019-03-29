package com.qihe6.CommandMode.s1;

import com.qihe6.CommandMode.Command;

public class CeilingFanOnCommmand implements Command {
    CeilingFan ceilingFan;

    public CeilingFanOnCommmand(CeilingFan ceilingFan) {
        this.ceilingFan=ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.On();
    }
}
