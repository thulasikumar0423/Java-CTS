package Thread;

public class ThreadStates  {
    public static void main(String[] args) throws Exception {
        Thread t = new Thread(() -> {
            try{
                Thread.sleep(800);
            }catch(Exception e){}
        });

        System.out.println(t.getState());
        t.start();
        System.out.println(t.getState());
        Thread.sleep(500);
        System.out.println(t.getState());
        t.join();
        System.out.println(t.getState());
    }
}
