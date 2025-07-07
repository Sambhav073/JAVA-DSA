
class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class RaceCondition {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Runnable taskA = () -> {
            for (int i = 0; i < 5; i++) {
                counter.increment();
            }
        };

        Runnable taskB = () -> {
            for (int i = 0; i < 5; i++) {
                counter.increment();
            }
        };

        Thread threadA = new Thread(taskA);
        Thread threadB = new Thread(taskB);

        threadA.start();
        threadB.start();

        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }

        System.out.println("Final count: " + counter.getCount());
    }
}
