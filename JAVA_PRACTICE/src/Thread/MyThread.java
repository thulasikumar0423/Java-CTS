package Thread;

class MyThread extends Thread{
    @Override
    public void run(){
        for(int i = 0; i<5;i++){
            System.out.println(Thread.currentThread().getName()
                                 + " - Count: " + i);
            try{
                Thread.sleep(5000);
            }catch(InterruptedException e){
                System.out.println("Thread Interrutpted");
            }
        }

    }

    public static void main(String[] args) {
        MyThread thr = new MyThread();
        MyThread thr1 = new MyThread();

        thr.setName("Thread 1");
        thr1.setName("Thread 2");

        thr.start();// automatically invokes the run method
        //thr.run();

        thr1.start();
       // thr1.run();

    }
}
