package Thread;

class ProducerConsumer {

    private int item;
    private boolean available = false;

    // Producer method
    synchronized void produce(int value) throws InterruptedException {

        // If item already produced, wait
        while (available) {
            wait();
        }

        item = value;
        available = true;

        System.out.println("Produced: " + item);

        // Notify consumer
        notify();
    }

    // Consumer method
    synchronized void consume() throws InterruptedException {

        // If no item available, wait
        while (!available) {
            wait();
        }

        System.out.println("Consumed: " + item);
        available = false;

        // Notify producer
        notify();
    }
}
