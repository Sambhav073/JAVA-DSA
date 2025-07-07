

abstract class Car{
    abstract void start();
    abstract void stop();

    void honk(){
        System.out.println("Honk! Honk!");
    }
}

class Honda extends Car{
    void start(){
        System.out.println("Honda is starting");
    }
    
    void stop(){
        System.out.println("Honda is stopping");
    }
}


public class AbstractClass {
    public static void main(String[] args) {
        Car myCar = new Honda();
        myCar.start(); // Output: Honda is starting
        myCar.honk();  // Output: Honk! Honk!
        myCar.stop();  // Output: Honda is stopping
    }
}


// abstract class Car{
//     abstract void start();
//     abstract void stop();

//     void honk(){
//         System.out.println("Honk! Honk!");
//     }
// }

// class Honda extends Car{
//     void start(){
//         System.out.println("Honda is starting");
//     }
    
//     void stop(){
//         System.out.println("Honda is stopping");
//     }
// }


// public class AbstractClass {
//     public static void main(String[] args) {
//         Car myCar = new Honda();
//         myCar.start(); // Output: Honda is starting
//         myCar.honk();  // Output: Honk! Honk!
//         myCar.stop();  // Output: Honda is stopping
//     }
// }

