

interface A {
    default void display() {
        System.out.println("Display from Interface A");
    }
}

interface B extends A {
    default void display() {
        System.out.println("Display from Interface B");
    }
}

interface C extends A {
    @Override
    default void display() {
        System.out.println("Display from Interface C");
    }
}

class D implements B, C {
    @Override
    public void display() {
        B.super.display(); // Resolving the diamond problem by specifying which interface's method to call
    }
}

public class DiamondProblem {
    public static void main(String[] args) {
       D d = new D();
       d.display(); // This will call the display method from interface B
    }
}
    