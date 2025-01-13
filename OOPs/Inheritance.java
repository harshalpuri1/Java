public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}
// Inheritance is a mechanism in which one object acquires all the properties and behaviors of a parent object.

// There are 5 types of inheritance in Java:
// 1. Single Inheritance
// 2. Multilevel Inheritance
// 3. Hierarchical Inheritance
// 4. Multiple Inheritance (Not supported in Java)
// 5. Hybrid Inheritance (Not supported in Java)
class Animal { // Parent class or Super class or Base class
    void eat() {
        System.out.println("Eating...");
    }
    void sleep() {
        System.out.println("Sleeping...");
    }
}

// Dog class is inheriting the properties and behaviors of Animal class
class Dog extends Animal { // Child class or Sub class or Derived class
    void bark() {
        System.out.println("Barking...");
    }
}