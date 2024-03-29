// Abstract class
abstract class Shape {
    // Abstract method
    abstract void draw();

    // Concrete method
    void display() {
        System.out.println("This is a shape.");
    }
}

// Concrete subclass
class Circle extends Shape {
    // Implementation of abstract method
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

// Concrete subclass
class Rectangle extends Shape {
    // Implementation of abstract method
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class Abstract {
    public static void main(String[] args) {
        // Creating objects of concrete subclasses
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        // Calling abstract method (polymorphism)
        circle.draw(); // Output: Drawing a circle
        rectangle.draw(); // Output: Drawing a rectangle

        // Calling concrete method
        circle.display(); // Output: This is a shape.
        rectangle.display(); // Output: This is a shape.
    }
}

