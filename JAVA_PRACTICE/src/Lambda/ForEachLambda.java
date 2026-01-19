package Lambda;
import java.util.Arrays;
import java.util.List;
class ForEachLambda {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java","Pyhton","HTML");
        names.forEach(name-> System.out.println(name));
    }
}

