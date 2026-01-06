package OOPS;

public class UserTest {

    public static void main(String[] args) {

        UserAccount user = new UserAccount("thulasi", "Pass1234");

        System.out.println(user.getUsername());

        // user.getPassword();  compile-time error

        System.out.println(user.login("Pass1234")); // true
        System.out.println(user.login("wrongpass")); // false

        user.setPassword("short"); // invalid
        user.setPassword("NewPass2026"); // valid
    }
}

