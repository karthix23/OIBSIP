import java.util.Scanner;

public class Login {
    private String validUserId = "user";
    private String validPassword = "password";

    public boolean authenticate(String userId, String password) {
        return userId.equals(validUserId) && password.equals(validPassword);
    }

    public static void main(String[] args) {
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Login ID:");
        String userId = scanner.nextLine();

        System.out.println("Enter Password:");
        String password = scanner.nextLine();

        if (login.authenticate(userId, password)) {
            System.out.println("Login Successful!");
            // Proceed to main system
        } else {
            System.out.println("Invalid Login ID or Password.");
        }
    }
}
