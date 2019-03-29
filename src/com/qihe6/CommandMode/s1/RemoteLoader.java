package com.qihe6.CommandMode.s1;

import com.qihe6.CommandMode.GarageDoorOpenCommand;
import com.qihe6.CommandMode.Light;
import com.qihe6.CommandMode.LightOnCommand;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl= new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("living room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn =
                new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff =
                new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn =
                new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff =
                new LightOffCommand(kitchenLight);

        CeilingFanOnCommmand ceilingFanOn =
                new CeilingFanOnCommmand(ceilingFan);
        CeilingFanOffCommmand ceilingFanOff=
                new CeilingFanOffCommmand(ceilingFan);

        GarageDoorUpCommand garageDoorUp =
                new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown =
                new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD=
                new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff =
                new StereoOffCommand(stereo);

        remoteControl.setCommand(0,livingRoomLightOn,livingRoomLightOff);
       //remoteControl.setCommand(1,);






    }
}
