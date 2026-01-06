package OOPS;

public class Car extends Vehicle{
    void start(){
        System.out.println("car starts");
    }
    public static void main(String[] args){
        Vehicle vobj= new Car();
        vobj.start();
        vobj.fuel();
    }
}
