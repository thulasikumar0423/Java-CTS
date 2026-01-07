package Thread;

public class ProducerConsumerDemo {

    public static void main(String[] args) {

        ProducerConsumer pc = new ProducerConsumer();

        Producer producer = new Producer(pc);
        Consumer consumer = new Consumer(pc);

        producer.start();
        consumer.start();
    }
}
