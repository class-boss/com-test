package com.qihe6.CommandMode.s1;

import com.qihe6.CommandMode.Command;

public class CeilingFanOffCommmand implements Command {
    CeilingFan ceilingFan;
    public CeilingFanOffCommmand(CeilingFan ceilingFan) {
            this.ceilingFan=ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.Off();
    }
}
