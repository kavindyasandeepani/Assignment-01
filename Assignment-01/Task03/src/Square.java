public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Square:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
