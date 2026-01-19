package Collections;



abstract class Vehicle {
    public abstract void printVehicle();
}

class TwoWheeler extends Vehicle {
    public void printVehicle() {
        System.out.println("I am two wheeler");
    }
}

class FourWheeler extends Vehicle {
    public void printVehicle() {
        System.out.println("I am four wheeler");
    }
}

class CLient1 {
    private Vehicle pVehicle;

    // Correct constructor
    public CLient1(int type) {
        if (type == 1) {
            pVehicle = new TwoWheeler();
        } else if (type == 2) {
            pVehicle = new FourWheeler();
        }
    }

    public void cleanup() {
        pVehicle = null;
    }

    public Vehicle getVehicle() {
        return pVehicle;
    }
}

class FactoryPatternNot {
    public static void main(String[] args) {

        CLient1 pClient = new CLient1(1); // pass type

        Vehicle pVehicle = pClient.getVehicle();
        if (pVehicle != null) {
            pVehicle.printVehicle();
        }

        pClient.cleanup();
    }
}
