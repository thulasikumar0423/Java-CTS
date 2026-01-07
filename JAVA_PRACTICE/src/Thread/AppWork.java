package Thread;
class AppWork implements Runnable{
    private String task;
    AppWork(String task ){
        this.task = task;
    }
    public void run(){
        System.out.println(task + " is being performed by " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread th1= new Thread(new AppWork("downloding files"));
        Thread th2= new Thread(new AppWork("sharing files files"));
        Thread th3= new Thread(new AppWork("recieving files"));
        th1.start();
        th2.start();
        th3.start();

    }
}
