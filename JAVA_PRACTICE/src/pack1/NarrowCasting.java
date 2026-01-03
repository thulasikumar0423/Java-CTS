package pack1;

public class NarrowCasting {
    public static void main(String[] args) {
        double d = 100.75;
        float f = (float) d;   // double → float
        long l = (long) f;     // float → long
        int i = (int) l;       // long → int
        short s = (short) i;   // int → short
        byte b = (byte) s;     // short → byte

        System.out.println("double: " + d);
        System.out.println("byte: " + b);   // Data loss!

        // Overflow example
        int bigNum = 300;
        byte smallByte = (byte) bigNum;
        System.out.println(smallByte); // 44 (overflow occurred)
    }
}
