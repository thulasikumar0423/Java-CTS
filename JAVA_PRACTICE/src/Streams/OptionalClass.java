package Streams;
import java.util.Optional;

class User {
    private String name;

    User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class OptionalClass {

    // Method returning Optional
    public static Optional<String> getUserName(User user) {
        return Optional.ofNullable(user)
                .map(User::getName);
    }

    public static void main(String[] args) {

        User user1 = new User("Remya");
        User user2 = new User(null);
        User user3 = null;

        // -------- Example 1: Value Present --------
        Optional<String> name1 = getUserName(user1);
        name1.ifPresent(n -> System.out.println("User1 Name: " + n));

        // -------- Example 2: Null Value --------
        Optional<String> name2 = getUserName(user2);
        System.out.println("User2 Name: " + name2.orElse("Name not available"));

        // -------- Example 3: Null Object --------
        Optional<String> name3 = getUserName(user3);
        System.out.println("User3 Name: " + name3.orElse("User not found"));

        // -------- Example 4: orElseGet --------
        String name = name3.orElseGet(() -> "Default User");
        System.out.println("Using orElseGet: " + name);

        // -------- Example 5: filter --------
        name1.filter(n -> n.length() > 5)
                .ifPresent(n -> System.out.println("Filtered Name: " + n));

        // -------- Example 6: map --------
        Optional<Integer> length = name1.map(String::length);
        System.out.println("Name Length: " + length.orElse(0));

        // -------- Example 7: orElseThrow --------
        try {
            String result = name3.orElseThrow(() ->
                    new RuntimeException("User name is missing")
            );
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
