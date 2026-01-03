package pack1;

public class WideningCasting {
    public static void main(String[] args) {
        byte b = 10;
        short s = b;     // byte → short
        int i = s;       // short → int
        long l = i;      // int → long
        float f = l;     // long → float
        double d = f;    // float → double

        System.out.println("byte: " + b);
        System.out.println("double: " + d);
    }
}
