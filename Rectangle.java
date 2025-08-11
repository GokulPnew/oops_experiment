// Define a class called Rectangle
public class Rectangle {

    // Number variables (fields)
    double length;
    double width;

    // Constructor to initialize the variables
    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    // Method to calculate area
    public double getArea() {
        return length * width;
    }

    // Method to calculate perimeter
    public double getPerimeter() {
        return 2 * (length + width);
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Create an object of Rectangle class
        Rectangle rect = new Rectangle(5.0, 3.0);

        // Display area and perimeter
        System.out.println("Length: " + rect.length);
        System.out.println("Width: " + rect.width);
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());
    }
}
