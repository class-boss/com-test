package com.qihe6.CommandMode;

public class RemoteContrllTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("99");
        LightOnCommand lightOn = new LightOnCommand(light);

        remote.setSlot(lightOn);
        remote.buttonWasPressed();
    }
}
