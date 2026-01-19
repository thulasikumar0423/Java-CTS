package Lambda;
 import java.util.function.Predicate;
class predicate {
    public static void main(String[] args) {
      Predicate<Integer> isEven = n-> n*2 ==20;
        System.out.println(isEven.test(10)); //true
    }
}
