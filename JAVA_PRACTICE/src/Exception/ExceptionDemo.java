package Exception;

public class ExceptionDemo {
    public static void main(String [] args){
        try{
            int [] arr = new int[5];
            System.out.println(arr[10]);

        } catch(ArrayIndexOutOfBoundsException ae){
            System.out.println("Exception caught and handled: " + ae.getMessage());

        }
    }

    public static void demostrateError(){
        try{
            recursiveMethod(); // will cause stack over flow error
        }catch(StackOverflowError e){
            // not recommeded to catch errors
            System.out.println("Error occured (but dont do this!)");
        }
    }
    private static void recursiveMethod(){
        recursiveMethod(); // infinite recursion
    }
}
