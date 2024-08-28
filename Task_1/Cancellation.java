import java.util.Scanner;

class Cancellation {
    public void cancelTicket() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter PNR Number:");
        String pnrNumber = scanner.nextLine();

        // Mock ticket retrieval based on PNR
        System.out.println("Retrieved Ticket Info for PNR: " + pnrNumber);
        System.out.println("Passenger Name: John Doe");
        System.out.println("Train Number: 12345 - Express Train 1");
        System.out.println("From: City A");
        System.out.println("To: City B");
        System.out.println("Date of Journey: 2024-12-25");

        System.out.println("Do you want to confirm the cancellation? (yes/no)");
        String confirmation = scanner.nextLine();

        if (confirmation.equalsIgnoreCase("yes")) {
            System.out.println("Ticket Cancelled Successfully!");
        } else {
            System.out.println("Cancellation Aborted.");
        }
    }
}
