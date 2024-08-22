public class RemoteControl {
    private Command[] commands;
    private Command lastCommand;

    // Constructor initializes the command slots
    public RemoteControl(int numSlots) {
        commands = new Command[numSlots];
    }

    // Method to set a command for a specific slot
    public void setCommand(int slot, Command command) {
        if (slot >= 0 && slot < commands.length) {
            commands[slot] = command;
        } else {
            System.out.println("Invalid slot number.");
        }
    }

    // Method to execute the command in the specified slot
    public void pressButton(int slot) {
        if (slot >= 0 && slot < commands.length && commands[slot] != null) {
            commands[slot].execute();
            lastCommand = commands[slot]; // Track the last executed command for undo
        } else {
            System.out.println("No command assigned to slot " + slot + ".");
        }
    }

    // Method to undo the last executed command
    public void pressUndo() {
        if (lastCommand != null) {
            lastCommand.undo();
            lastCommand = null; // Reset last command after undo
        } else {
            System.out.println("No command to undo.");
        }
    }
}
