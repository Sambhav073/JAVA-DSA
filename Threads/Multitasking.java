
// class A extends Thread {
//     public void run() {
//         for (int i = 0; i < 100; i++) {
//             System.out.println("Thread A: " + i);
//             try {
//                 // Sleep for 10 milliseconds to simulate some work
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 System.out.println("Thread A interrupted: " + e.getMessage());
//             }
//         }
//     }
// }
// class B extends Thread {
//     public void run() {
//         for (int i = 0; i < 100; i++) {
//             System.out.println("Thread B: " + i);
//             try {
//                 // Sleep for 10 milliseconds to simulate some work
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 System.out.println("Thread B interrupted: " + e.getMessage());
//             }
//         }
//     }
// }

class A implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread A: " + i);
            try {
                // Sleep for 10 milliseconds to simulate some work
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("Thread A interrupted: " + e.getMessage());
            }
        }
    }
}

class B implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread B: " + i);
            try {
                // Sleep for 10 milliseconds to simulate some work
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("Thread B interrupted: " + e.getMessage());
            }
        }
    }

    
}

public class Multitasking {
    public static void main(String[] args) {
        // Create and start the first thread
        // A threadA = new A();
        // threadA.start();

        // // Create and start the second thread
        // B threadB = new B();
        // threadB.start();


        // Using Runnable interface
        Thread threadA = new Thread(new A());
        Thread threadB = new Thread(new B());
        threadA.start();
        threadB.start();
    }
}

