package OOPS;

class BlockDemo {

    // Static variable
    static int a;

    // Instance variable
    int b;

    // 🔹 Static Block
    static {
        a = 10;
        System.out.println("Static block executed");
        System.out.println("Static variable a = " + a);
    }

    // 🔹 Instance Block
    {
        b = 20;
        System.out.println("Instance block executed");
        System.out.println("Instance variable b = " + b);
    }

    // Constructor
    BlockDemo() {
        System.out.println("Constructor executed");
    }

    public static void main(String[] args) {

        System.out.println("Main method started");

        // Creating first object
        BlockDemo obj1 = new BlockDemo();

        System.out.println("---- Creating second object ----");

        // Creating second object
        BlockDemo obj2 = new BlockDemo();
    }
}