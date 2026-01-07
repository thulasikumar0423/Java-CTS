package Thread;

public class Hello implements Runnable {

    String word;
    boolean reverse;

    Hello(String word, boolean reverse) {
        this.word = word;
        this.reverse = reverse;
    }

    @Override
    public void run() {

        if (reverse) {
            String rev = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                rev += word.charAt(i);
            }
            System.out.println(rev + " printed by " + Thread.currentThread().getName());
        } else {
            System.out.println(word + " printed by " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {


        Thread thr1 = new Thread(new Hello("Hello", false));
        Thread thr2 = new Thread(new Hello("Hello", true));

        thr1.start();
        thr2.start();
    }
}
