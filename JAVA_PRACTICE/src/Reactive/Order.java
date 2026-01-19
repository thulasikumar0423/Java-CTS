package Reactive;

//modal class this is the message / dat flowing the reactive streams
class Order {
    int id ;
    String status;
    Order(int id, String status){
        this.id = id;
        this.status = status;

    }
    public String toString(){
        return "Order(id = " + id + ", status ' " + status + " '}";
    }
}
