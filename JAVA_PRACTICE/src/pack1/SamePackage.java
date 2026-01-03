package pack1;

public class SamePackage {
    public static void main(String[] args){
        BaseClass bobj1 =new BaseClass();
        bobj1.publicMethod();
        bobj1.protectedMethod();
        bobj1.defaultMethod();
       // bobj.privateMethod();  not allowed(private)

        bobj1.callPrivate(); // indirect access to private
    }
}
