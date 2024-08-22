public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle:");
        int height = 5;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
