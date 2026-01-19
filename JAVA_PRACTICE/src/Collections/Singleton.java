package Collections;
import java.io.*;
public class Singleton {
    //static class
    private static Singleton instance;

    private Singleton(){
        System.out.println("Sibgleton is Instantiated.");

    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();

        }
        return instance;
    }

    public static void doSomething(){
        System.out.println("Something is done.");
    }


}

class SingletonPattern{
    public static void main(String[] args) {
        Singleton sob1=  Singleton.getInstance();
        Singleton sob2=  Singleton.getInstance();
        Singleton sob3=  Singleton.getInstance();

        sob1.doSomething();
        sob2.doSomething();
        sob3.doSomething();

        /*sob1.hashCode();
        sob2.hashCode();
        sob3.hashCode();*/
        System.out.println(sob1 == sob2);
    }
}
