// File: Main.java
public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        Fan ceilingFan = new Fan();
        Door frontDoor = new Door();

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        FanOnCommand ceilingFanOn = new FanOnCommand(ceilingFan);
        FanOffCommand ceilingFanOff = new FanOffCommand(ceilingFan);
        DoorOpenCommand frontDoorOpen = new DoorOpenCommand(frontDoor);
        DoorCloseCommand frontDoorClose = new DoorCloseCommand(frontDoor);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.addCommand(livingRoomLightOn);
        remoteControl.addCommand(ceilingFanOn);
        remoteControl.addCommand(frontDoorOpen);
        remoteControl.addCommand(livingRoomLightOff);
        remoteControl.addCommand(ceilingFanOff);
        remoteControl.addCommand(frontDoorClose);

        remoteControl.executeCommands();
    }
}
