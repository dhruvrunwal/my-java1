class MyThread1 extends Thread {
    public void run() {
        System.out.println("Thread 1 is running");
    }
}

class MyThread2 extends Thread {
    public void run() {
        System.out.println("Thread 2 is running");
    }
}

public class MultipleThreads {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();
    }
}
