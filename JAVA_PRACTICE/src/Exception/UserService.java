package Exception;

public class UserService {

    public static void registerUser(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above to register");
        }

        System.out.println("User registered successfully");
    }
}
