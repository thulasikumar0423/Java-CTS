package Reactive;

import java.util.concurrent.Flow;

class OrderSubscriber implements Flow.Subscriber<Order> {
    private Flow.Subscription subscription;
    @Override
    public void onSubscribe(Flow.Subscription subscription){
        this.subscription = subscription;
        subscription.request(1);

    }

    @Override
    public void onNext(Order order){
        System.out.println("Recieved: " + order);
        subscription.request(1);

    }
    @Override
    public void onError(Throwable t){
        t.printStackTrace();

    }
    @Override
    public void onComplete(){
        System.out.println("All orders processed");
    }
}
