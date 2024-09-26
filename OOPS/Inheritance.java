public class Inheritance {
    public static void main(String[] args) {
        // Fish shark = new Fish();
        // shark.eat();
        Vehicle obj1 = new Car();
        obj1.print();

    }

}

class Vehicle {
    void print() {
        System.out.println("Base class");
    }
}

class Car extends Vehicle {
    void print() {
        System.out.println("Derived class");
    }
}

// // BASE CLASS
// class Animal {
// String color;

// void eat() {
// System.out.println("eats");
// }

// void breathe() {
// System.out.println("Breathe");
// }
// }

// // Derived CLASS or subclass
// class Fish extends Animal {
// int fins;

// void swing() {
// System.out.println("swims in water");
// }
// }