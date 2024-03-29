 class Parent {
    static void staticMethod() {
        System.out.println("Static method in Parent class");
    }
}

class Child extends Parent {
    static void staticMethod() {
        System.out.println("Static method in Child class");
    }
}

public class MethodHidingExample {
    public static void main(String[] args) {
        Parent.staticMethod();
        
         
        Child.staticMethod(); // Output: Static method in Child class
        
        
        Parent ref = new Child();
        ref.staticMethod(); 
    }
}
 
    

