package OOPS;

class UserAccount {

    private String username;
    private String password; // hidden


    public UserAccount(String username, String password) {
        this.username = username;
        setPassword(password); // validation enforced
    }


    public String getUsername() {
        return username;
    }




    public void setPassword(String newPassword) {   // Change password safely
        if (isValidPassword(newPassword)) {
            this.password = newPassword;
            System.out.println("Password set successfully");
        } else {
            System.out.println("Password must be at least 8 characters and contain a number");
        }
    }

    // Login method
    public boolean login(String enteredPassword) {
        return this.password.equals(enteredPassword);
    }


    private boolean isValidPassword(String password) { // Private validation logic

        if (password.length() < 8) {
            return false;
        }

        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                hasDigit = true;
                break;
            }
        }

        return hasDigit;
    }
}
