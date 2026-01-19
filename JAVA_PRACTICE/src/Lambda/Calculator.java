package Lambda;
@FunctionalInterface
interface Calculator {
    int add(int a, int b);
    public default void day(){
        System.out.println("HELLO hoi");
    }
}
 class functionalInterface{
    public static void main(String[] args) {
        //(parameters) - > expression syntax for lambda
        //lambda expression implementing calculator
        Calculator calculator =(int a, int b) -> a+b;

        int result = calculator.add(10, 40);
        System.out.println("Additional Result: "+ result);
        System.out.println();
        calculator.day();
    }

}
