package Lab_Assignments.Vechile.CarDemo;

// A class extending Thread to implement multithreading
class MyThread extends Thread {
    private String threadName;

    // Constructor to name the thread
    public MyThread(String name) {
        this.threadName = name;
    }

    // Override the run() method to define the thread's behavior
    @Override
    public void run() {
        System.out.println(threadName + " started.");

        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " is running... " + i);

            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(threadName + " was interrupted.");
            }
        }

        System.out.println(threadName + " finished.");
    }
}

public class Multithreading {
    public static void main(String[] args) {
        // Creating multiple threads
        System.out.println("Main thread started ");
        MyThread thread1 = new MyThread("Thread-A");
        MyThread thread2 = new MyThread("Thread-B");

        // Starting the threads
        thread1.start();
        thread2.start();

        // Optionally, wait for them to finish (join)
//        try {
//            thread1.join();
//            thread2.join();
//        } catch (InterruptedException e) {
//            System.out.println("Main thread interrupted.");
//        }

        System.out.println("Main thread finished.");
    }
}
