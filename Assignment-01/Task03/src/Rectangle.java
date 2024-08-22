public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle:");
        int width = 7;
        int height = 4;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

