class Thr extends Thread{
    public Thr(String name){
        super(name);
    }

    public void run(){
        int i=0;
        while(i<2){
            System.out.println("I am Run Method of Thr");
            i++;
        }
    }
}

public class ConstructoraFromThread {
    public static void main(String[] args) {
        Thr me = new Thr("Hello");
        me.start();
        System.out.println("'Me' Thread id is : " + me.getId());
        System.out.println("'Me' Thread Name is : " + me.getName());

        Thr you = new Thr("Mayday");
        you.start();
        System.out.println("'You' Thread id is : " + you.getId());
        System.out.println("'You' Thread Name is : " + you.getName());
    }
}
