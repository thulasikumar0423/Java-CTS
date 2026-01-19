package Streams;
import java.lang.reflect.Method;
class Employee{
    public void work(){
        System.out.println("Employee working");
    }
}
public class ReflectionDemo {
    public static void main(String[] args) {
        Class<?> clazz = Employee.class;
        for(Method m: clazz.getDeclaredMethods()){
            System.out.println(m.getName());
        }

    }
}
