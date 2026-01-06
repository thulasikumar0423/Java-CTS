package OOPS;

class Outer {

    private String msg = "Hello from Outer class";

    class Inner {
        void show() {
            System.out.println(msg); // accessing outer class member
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();           // Outer object
        Outer.Inner inner = outer.new Inner(); // Inner object
        inner.show();
    }
}