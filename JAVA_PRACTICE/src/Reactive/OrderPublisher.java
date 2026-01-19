package Reactive;

import java.util.concurrent.SubmissionPublisher;

//flow - publisher that asynchronously issues submitted
//non-null items to current subscribers untill it is called

class OrderPublisher extends SubmissionPublisher<Order> {
    void publish(Order order){
        System.out.println("Publishing: " + order);
        submit(order); //send data asynchronously


        //publisher is not aware of who consumes the data
    }
}
