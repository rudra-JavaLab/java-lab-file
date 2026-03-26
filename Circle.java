// Point class
class Point {
    int x, y;

    // Constructor
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Display point
    void displayPoint() {
        System.out.println("Center Point: (" + x + ", " + y + ")");
    }
}

// Circle class (also contains main method)
public class Circle {
    Point center;
    double radius;

    // Constructor
    Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    // Calculate area
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Display details
    void displayCircle() {
        center.displayPoint();
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
    }

    // Main method
    public static void main(String[] args) {
        Point p = new Point(3, 4);
        Circle c = new Circle(p, 5);
        c.displayCircle();
    }
}