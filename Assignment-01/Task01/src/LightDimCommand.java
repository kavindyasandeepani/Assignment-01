public class LightDimCommand implements Command {
    private Light light;
    private int previousLevel;
    private int newLevel;

    public LightDimCommand(Light light, int newLevel) {
        this.light = light;
        this.newLevel = newLevel;
        this.previousLevel = light.getBrightnessLevel(); // Save the current brightness level
    }

    @Override
    public void execute() {
        light.dim(newLevel);
    }

    @Override
    public void undo() {
        light.dim(previousLevel); // Restore the previous brightness level
    }
}
