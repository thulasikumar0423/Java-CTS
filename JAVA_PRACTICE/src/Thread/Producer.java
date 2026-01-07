package Thread;

class Producer extends Thread {

    ProducerConsumer pc;

    Producer(ProducerConsumer pc) {
        this.pc = pc;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                pc.produce(i);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


