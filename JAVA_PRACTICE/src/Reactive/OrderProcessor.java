package Reactive;

import java.util.concurrent.Flow;

//act as both subscriber and publisher
//applies your business logic

 class OrderProcessor implements Flow.Processor<Order, Order> {

     // repersents connection with upstream publisher , used for request data , cancel data
     //enables backpressure
     private Flow.Subscription subscription;

     //represents downstreams subsriber
     //allows any parent type
     //this is where processed data will be sent

     private Flow.Subscriber<? super Order> subscriber;

     //another subscriber subscribes to this processor
     //processor is able publisher

     @Override
     public void subscribe(Flow.Subscriber <? super Order> subscriber){
         this.subscriber = subscriber; // saves reference to demonstrate subscriber
         subscriber.onSubscribe(new Flow.Subscription(){
          public void request(long n){}
             public void cancel(){}
         });

     }

     @Override
     public void onSubscribe(Flow.Subscription subscription){
         this.subscription = subscription;
         subscription.request(1);
     }


     //processing order
     @Override
     public void onNext(Order order){
         order.status = "PROCESSED";
         subscriber.onNext(order);
         subscription.request(1);
     }

     //error in order
     @Override
     public void onError(Throwable t){
         subscriber.onError(t);
     }

     //once completed your order
     @Override
     public void onComplete(){
         subscriber.onComplete();
     }
}
