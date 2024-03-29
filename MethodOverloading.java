public class MethodOverloading {

    // Method with the same name but different parameter types
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    // Method with the same name but different number of parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with the same name but different parameter type and number
    double add(int a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();

        // Calling methods with different parameter types
        System.out.println("Sum of integers: " + obj.add(5, 3));
        System.out.println("Sum of doubles: " + obj.add(5.5, 3.7));

        // Calling method with a different number of parameters
        System.out.println("Sum of three integers: " + obj.add(5, 3, 7));

        // Calling method with a different parameter type and number
        System.out.println("Sum of integer and double: " + obj.add(5, 3.5));
    }
}
