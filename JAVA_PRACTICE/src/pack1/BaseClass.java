package pack1;

public class BaseClass {
    public void publicMethod(){
        System.out.println("Public Method");
    }

    private void privateMethod() {
        System.out.println("Private Method");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    void defaultMethod() {
        System.out.println("Default Method");
    }

    // method to internally call private method
    public void callPrivate() {
        privateMethod();
    }
    public static void main(String[] args){
        BaseClass bobj =new BaseClass();
        bobj.publicMethod();
        bobj.protectedMethod();
        bobj.defaultMethod();
        // bobj.privateMethod();  not allowed(private)

        bobj.callPrivate(); // indirect access to private
    }
}
