package OOPS;

class Outer1{

    static int data = 100;

    static class Inner {
        void show() {
            System.out.println(data);
        }
    }

    public static void main(String[] args) {
        Outer1.Inner obj = new Outer1.Inner();
        obj.show();
    }
}