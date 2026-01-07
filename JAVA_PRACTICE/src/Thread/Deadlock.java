package Thread;

public class Deadlock {

    final static Object R1 = new Object();
    final static Object R2 = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread() {
            public void run() {
                synchronized (R1) {
                    System.out.println("Thread T1 locked -> Resource R1");

                    synchronized (R2) {
                        System.out.println("Thread T1 locked -> Resource R2");
                    }
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                synchronized (R1) {
                    System.out.println("Thread T2 locked -> Resource R1");

                    synchronized (R2) {
                        System.out.println("Thread T2 locked -> Resource R2");
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}

//deadlock occurred in above program  what change would you make to avoid deadlock in the above program