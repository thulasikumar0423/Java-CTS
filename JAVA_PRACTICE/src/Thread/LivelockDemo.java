package Thread;

class Spoon {
    private boolean isAvailable = true;

    public synchronized boolean isAvailable() {
        return isAvailable;
    }

    public synchronized void use() {
        isAvailable = false;
    }
}

class Person {
    private String name;
    private boolean isHungry = true;

    Person(String name) {
        this.name = name;
    }

    public void eatWith(Spoon spoon, Person spouse) {
        int attempts = 3;
        while (isHungry) {
            if (!spoon.isAvailable()) {
               // backOff();

                continue; // keeps trying
            }

            // polite behavior causes livelock
            if (spouse.isHungry && attempts-- > 0) {
                System.out.println(name + ": You eat first!");
                //backOff();
                continue;
            }

            spoon.use();
            System.out.println(name + " is eating");
            isHungry = false;
        }
    }
    /*private void backOff() {
        try {
            Thread.sleep((long) (Math.random() * 100));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }*/
}

public class LivelockDemo {
    public static void main(String[] args) {

        Spoon spoon = new Spoon();
        Person husband = new Person("Husband");
        Person wife = new Person("Wife");

        new Thread(() -> husband.eatWith(spoon, wife)).start();
        new Thread(() -> wife.eatWith(spoon, husband)).start();
    }
}
