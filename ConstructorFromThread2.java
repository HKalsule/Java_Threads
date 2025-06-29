class MyRunnable implements Runnable {
    public void run() {
        int i = 0;
        while (i < 2) {
            System.out.println("I am inside run() of MyRunnable");
            i++;
        }
    }
}

public class ConstructorFromThread2 {
    public static void main(String[] args) {
        MyRunnable myTask = new MyRunnable();
        Thread t = new Thread(myTask, "Hello"); 
        t.start();
        System.out.println("Thread name is: " + t.getName());
        System.out.println("Thread id is: " + t.getId());
    }
}
