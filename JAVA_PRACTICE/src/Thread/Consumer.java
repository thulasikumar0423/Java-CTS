package Thread;

class Consumer extends Thread {

    ProducerConsumer pc;

    Consumer(ProducerConsumer pc) {
        this.pc = pc;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                pc.consume();
                Thread.sleep(800);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
