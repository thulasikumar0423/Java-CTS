package Thread;

public class Thread2 implements Runnable{

    public void run(){
        System.out.println("Thread is running currentlt");

    }

    public static void main(String[] args) {
        Thread2 thr = new Thread2();
        //9thr.start();
        Thread thread = new Thread(thr); // pass the runnable object
        thread.start();
        System.out.println("Main thread continues execution");
    }
}
