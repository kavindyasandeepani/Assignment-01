public class KitchenRoomLight implements Light {
    private int brightnessLevel = 100; // Default brightness level (100 means full brightness)

    @Override
    public void on() {
        System.out.println("Kitchen Room Light is ON at full brightness.");
        brightnessLevel = 100;
    }

    @Override
    public void off() {
        System.out.println("Kitchen Room Light is OFF.");
        brightnessLevel = 0;
    }

    @Override
    public void dim(int level) {
        if (level < 0) {
            level = 0; // Minimum brightness level
        } else if (level > 100) {
            level = 100; // Maximum brightness level
        }
        brightnessLevel = level;
        System.out.println("Kitchen Room Light dimmed to " + brightnessLevel + "%.");
    }

    @Override
    public int getBrightnessLevel() {
        return brightnessLevel;
    }
}
