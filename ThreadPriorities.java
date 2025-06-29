class Thr1 extends Thread{
    public Thr1(String name){
        super(name);
    }

    public void run(){
        int i = 0;
        while(i<2){
        System.out.println("Hello " + this.getName());
        i++;
    }
    }
}

public class ThreadPriorities {
    public static void main(String[] args) {
        Thr1 t1 = new Thr1("HK0");
        Thr1 t2 = new Thr1("HK1");
        Thr1 t3 = new Thr1("HK2");
        Thr1 t4 = new Thr1("HK3");
        Thr1 t5 = new Thr1("HK4");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        
    }
}
