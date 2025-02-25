import java.util.Scanner;

public class Polymorphism {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter two numbers: ");
        // int a = scanner.nextInt();
        // int b = scanner.nextInt();
        // System.out.println("Sum of two numbers: " + calculator.add(a, b));
        System.out.println("Enter two float numbers: ");
        float c = scanner.nextFloat();
        float d = scanner.nextFloat();
        System.out.println("Sum of two float numbers: " + calculator.add(c, d));
        // System.out.println("Sum of  three numbers: " + calculator.add(a, b, scanner.nextInt()));
        scanner.close();
    }
}

// Polymorphism is the ability of a single function or method to operate on multiple data types.
// There are two types of polymorphism in Java: compile-time polymorphism and runtime polymorphism.
// Compile-time polymorphism is method overloading, and runtime polymorphism is method overriding.
// Method overloading is when two or more methods in the same class have the same name but different parameters.

// Method Overloading
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public float add(float a, float b) {
        return a + b;
    }
}


// Method overriding is when a subclass provides a specific implementation of a method that is already provided by its parent class.
