// Parent class
class Parent {
    // Method to be overridden
    void display() {
        System.out.println("Parent class method");
    }
}

// Child class extending Parent
class Child extends Parent {
    // Overriding the display() method of Parent
    @Override
    void display() {
        System.out.println("Child class method");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Parent parentObj = new Parent();
        Child childObj = new Child();

        // Call display() method of Parent class
        parentObj.display(); // Output: Parent class method

        // Call display() method of Child class
        childObj.display(); // Output: Child class method

        // Polymorphism: Parent reference holding Child object
        Parent polymorphicObj = new Child();
        // Child polymorphicObj = new Parent();
        polymorphicObj.display(); // Output: Child class method
    }
}

