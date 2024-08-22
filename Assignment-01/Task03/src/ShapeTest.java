public class ShapeTest {
    public static void main(String[] args) {
        // Create an instance of ShapeFactory
        ShapeFactory shapeFactory = new ShapeFactory();

        // Test with Square
        Shape square = shapeFactory.getShape("SQUARE");
        if (square != null) {
            square.draw();
        } else {
            System.out.println("Shape type 'SQUARE' is not recognized.");
        }

        System.out.println(); // Adding a blank line for better separation

        // Test with Circle
        Shape circle = shapeFactory.getShape("CIRCLE");
        if (circle != null) {
            circle.draw();
        } else {
            System.out.println("Shape type 'CIRCLE' is not recognized.");
        }

        System.out.println(); // Adding a blank line for better separation

        // Test with Triangle
        Shape triangle = shapeFactory.getShape("TRIANGLE");
        if (triangle != null) {
            triangle.draw();
        } else {
            System.out.println("Shape type 'TRIANGLE' is not recognized.");
        }

        System.out.println(); // Adding a blank line for better separation

        // Test with Rectangle
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        if (rectangle != null) {
            rectangle.draw();
        } else {
            System.out.println("Shape type 'RECTANGLE' is not recognized.");
        }

        System.out.println(); // Adding a blank line for better separation

        // Test with an invalid shape type
        Shape unknown = shapeFactory.getShape("HEXAGON");
        if (unknown != null) {
            unknown.draw();
        } else {
            System.out.println("Shape type 'HEXAGON' is not recognized.");
        }
    }
}
