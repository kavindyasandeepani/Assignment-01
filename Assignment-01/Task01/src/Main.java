public class Main {
    public static void main(String[] args) {

        Light kitchenLight = new KitchenRoomLight();
        Light livingRoomLight = new LivingRoomLight();


        Command kitchenLightOn = new LightOnCommand(kitchenLight);
        Command kitchenLightOff = new LightOffCommand(kitchenLight);
        Command kitchenLightDim = new LightDimCommand(kitchenLight, 50);

        Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
        Command livingRoomLightOff = new LightOffCommand(livingRoomLight);
        Command livingRoomLightDim = new LightDimCommand(livingRoomLight, 75);


        RemoteControl remote = new RemoteControl(3);


        remote.setCommand(0, kitchenLightOn);
        remote.setCommand(1, kitchenLightDim);
        remote.setCommand(2, livingRoomLightOff);

        // Execute commands
        remote.pressButton(0); // Turns kitchen light on
        remote.pressButton(1); // Dims kitchen light to 50%
        remote.pressButton(2); // Turns living room light off

        // Undo the last command
        remote.pressUndo(); // Undoes turning off living room light
    }
}
