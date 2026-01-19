package Reactive;

public class ReactiveApp {
    public static void main(String[] args) throws Exception{
        OrderPublisher publisher = new OrderPublisher();
        OrderProcessor processor = new OrderProcessor();
        OrderSubscriber subscriber = new OrderSubscriber();

        publisher.subscribe(processor);
        processor.subscribe(subscriber);

        publisher.publish(new Order(1,"NEW"));
        publisher.publish(new Order(2,"NEW"));
        publisher.publish(new Order(3,"NEW"));

        Thread.sleep(1000);
        publisher.close();
    }

}
