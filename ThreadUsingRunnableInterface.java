class MThread1 implements Runnable{
    public void run(){
        int i=0;
        while(i<5){
            System.out.println("I am Runnable Thread 1");
            i++;
        }
    }
}

class MThread2 implements Runnable{
    public void run(){
        int i=0;
        while(i<5){
            System.out.println("I am Runnable Thread 2");
            i++;
        }
    }
}

public class ThreadUsingRunnableInterface {
    public static void main(String[] args) {
        MThread1 m1 = new MThread1();
        Thread t1 = new Thread(m1);

        MThread2 m2 = new MThread2();  
        Thread t2 = new Thread(m2); 

        t1.start();
        t2.start();
    }
}
