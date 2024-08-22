public class Test {
    public static void main(String[] args) {

        Light kitchenLight = new KitchenRoomLight();
        Light livingRoomLight = new LivingRoomLight();


        Command kitchenLightOn = new LightOnCommand(kitchenLight);
        Command kitchenLightOff = new LightOffCommand(kitchenLight);
        Command kitchenLightDimTo50 = new LightDimCommand(kitchenLight, 50);
        Command kitchenLightDimTo100 = new LightDimCommand(kitchenLight, 100);

        Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
        Command livingRoomLightOff = new LightOffCommand(livingRoomLight);
        Command livingRoomLightDimTo30 = new LightDimCommand(livingRoomLight, 30);
        Command livingRoomLightDimTo100 = new LightDimCommand(livingRoomLight, 100);


        RemoteControl remote = new RemoteControl(3);

        // Set commands to slots
        remote.setCommand(0, kitchenLightOn);
        remote.setCommand(1, kitchenLightOff);
        remote.setCommand(2, livingRoomLightOn);

        // Execute commands

        remote.pressButton(0); // Turns kitchen light on
        remote.pressButton(1); // Turns kitchen light off
        remote.pressButton(0); // Turns kitchen light on

        remote.setCommand(0, livingRoomLightOn);
        remote.setCommand(1, livingRoomLightOff);
        remote.setCommand(2, livingRoomLightDimTo30);

        // Continue testing

        remote.pressButton(0); // Turns living room light on
        remote.pressButton(1); // Turns living room light off
        remote.pressButton(0); // Turns living room light on

        // Dim commands
        remote.setCommand(0, kitchenLightDimTo50);
        remote.setCommand(1, kitchenLightDimTo100);
        remote.setCommand(2, livingRoomLightDimTo30);


        remote.pressButton(0); // Dim kitchen light to 50%
        remote.pressButton(1); // Dim kitchen light to 100%
        remote.pressButton(2); // Dim living room light to 30%
        remote.pressUndo();    // Undo dimming living room light to 30%
    }
}
