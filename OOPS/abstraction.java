public class abstraction {
    public static void main(String[] args) {
        Animal1 h = new Horse();
        h.eats();
        h.walk();
    }

}

abstract class Animal1 {
    void eats(){
        System.out.println("Animal can eat");
    }
    abstract void walk();
}

class Horse extends Animal1 {
    void walk() {
        System.out.println("walks on 4 legs");
    }
}
