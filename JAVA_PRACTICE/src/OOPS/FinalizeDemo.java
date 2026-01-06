package OOPS;
class FinalizeDemo {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize() method called");
    }

    public static void main(String[] args) {

        // Creating objects
        FinalizeDemo obj1 = new FinalizeDemo();
        FinalizeDemo obj2 = new FinalizeDemo();

        // Making objects eligible for GC
        obj1 = null;
        obj2 = null;

        // Requesting Garbage Collection
        System.gc();

        System.out.println("End of main method");
    }
}