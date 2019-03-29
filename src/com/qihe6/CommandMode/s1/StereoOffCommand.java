package com.qihe6.CommandMode.s1;

import com.qihe6.CommandMode.Command;

public class StereoOffCommand implements Command {
    Stereo  stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo=stereo;
    }

    @Override
    public void execute() {
        stereo.setCD();

    }
}
