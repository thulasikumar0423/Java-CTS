package OOPS;

public class interfaceDemo implements Bank1 {
    @Override
    public void pay() {
        System.out.println("Inside pay methods");
    }

    @Override
    public void deposit() {
        System.out.println("Inside deposit method");
    }
    public static void main(String [] arg){
        interfaceDemo ind= new interfaceDemo();
        ind.pay();
        ind.deposit();
    }
}