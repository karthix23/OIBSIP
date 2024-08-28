import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Login login = new Login();
        Reservation reservation = new Reservation();
        Cancellation cancellation = new Cancellation();

        Scanner scanner = new Scanner(System.in);

        // Authentication process
        System.out.println("Enter Login ID:");
        String userId = scanner.nextLine();

        System.out.println("Enter Password:");
        String password = scanner.nextLine();

        if (login.authenticate(userId, password)) {
            System.out.println("Login Successful!");

            System.out.println("1. Reservation");
            System.out.println("2. Cancellation");
            System.out.println("Enter choice:");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    reservation.reserveTicket();
                    break;
                case 2:
                    cancellation.cancelTicket();
                    break;
                default:
                    System.out.println("Invalid Choice!");
                    break;
            }
        } else {
            System.out.println("Invalid Login ID or Password.");
        }
    }
}
