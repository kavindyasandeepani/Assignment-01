public interface Command {
    // Method to execute the command
    void execute();

    // Method to undo the command
    void undo();
}
