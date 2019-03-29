package com.qihe6.CommandMode.s1;

import com.qihe6.CommandMode.Command;

public class Nocommand implements Command {

    @Override
    public void execute() {
        System.out.println("NO command");
    }
}
