package com.qihe6.CommandMode.s1;

import com.qihe6.CommandMode.Command;

public class StereoOnWithCDCommand implements Command {

    Stereo  stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
