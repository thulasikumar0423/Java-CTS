package Debug;

public class Debugg1 {
    public static void main(String[] args) {

        int a = 5;

        for (int b = 5; b >= -1; b--) {

            System.out.println("Iteration start");
            System.out.println("a = " + a);
            System.out.println("b = " + b);

            try {
                int result = divide(a, b);
                System.out.println("Result = " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero");
            }

            System.out.println("Iteration end\n");
        }
    }

    static int divide(int x, int y) {
        return x / y;
    }
}

//execute java using command line
