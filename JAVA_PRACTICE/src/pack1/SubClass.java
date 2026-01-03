package pack1;

public class SubClass extends BaseClass {

    public void accessMethods() {

        publicMethod();
        protectedMethod();
        defaultMethod();

        // privateMethod();   not allowed
    }

    public static void main(String[] args) {
        SubClass sobj = new SubClass();
        sobj.accessMethods();
    }
}
