public class TestSimpleCircle {
    /** Main method */
    public static void main(String[] args) {
        // Create a circle with radius 1
    	SimpleCircleTwoConstructors circle1 = new SimpleCircleTwoConstructors();
        System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());

        // Create a circle with radius 25
        SimpleCircleTwoConstructors circle2 = new SimpleCircleTwoConstructors(25);
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());

        // Create a circle with radius 125
        SimpleCircleTwoConstructors circle3 = new SimpleCircleTwoConstructors(125);
        System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());

        // Modify circle radius
        circle2.radius = 100; // or circle2.setRadius(100)
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
    }
}

// Define the circle class with two constructors
class SimpleCircleTwoConstructors {
    double radius;

    /** Construct a circle with radius 1 */
    SimpleCircleTwoConstructors() {
        radius = 1;
    }

    /** Construct a circle with specified radius */
    SimpleCircleTwoConstructors(double newRadius) {
        radius = newRadius;
    }

    /** Return the area of this circle */
    double getArea() {
        return radius * radius * Math.PI;
    }

    /** Return the perimeter of this circle */
    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /** Set a new radius for this circle */
    void setRadius(double newRadius) {
        radius = newRadius;
    }
}