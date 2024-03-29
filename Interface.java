//  interface shape {

//      void draw();
//      double area();
// }
// class Circle implements shape {
//     void draw(){

//     }
// }

// public class Interface {
    
// }
// Interface definition
interface Shape {
    // Abstract method declaration
    void draw();
    
    // Another abstract method declaration
    double calculateArea();
}

// Class implementing the Shape interface
class Circle implements Shape {
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of draw() method
    public void draw() {
        System.out.println("Drawing a circle");
    }

    // Implementation of calculateArea() method
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Class implementing the Shape interface
class Rectangle implements Shape {
    double length;
    double width;

    // Constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of draw() method
    public void draw() {
        System.out.println("Drawing a rectangle");
    }

    // Implementation of calculateArea() method
    public double calculateArea() {
        return length * width;
    }
}

public class Interface {
    public static void main(String[] args) {
        // Creating objects of classes implementing the Shape interface
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        // Calling methods defined in the interface
        circle.draw();
        System.out.println("Area of circle: " + circle.calculateArea());

        rectangle.draw();
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
    }
}
