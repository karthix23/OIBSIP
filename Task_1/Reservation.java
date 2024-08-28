import java.util.Scanner;

class Reservation {
    String passengerName;
    int trainNumber;
    String trainName;
    String classType;
    String dateOfJourney;
    String fromPlace;
    String toDestination;

    public void reserveTicket() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Passenger Name:");
        passengerName = scanner.nextLine();

        System.out.println("Enter Train Number:");
        trainNumber = scanner.nextInt();
        scanner.nextLine();  // consume newline

        System.out.println("Enter Class Type (e.g., First, Second):");
        classType = scanner.nextLine();

        System.out.println("Enter Date of Journey (e.g., 2024-12-25):");
        dateOfJourney = scanner.nextLine();

        System.out.println("Enter From (Place):");
        fromPlace = scanner.nextLine();

        System.out.println("Enter To (Destination):");
        toDestination = scanner.nextLine();

        trainName = getTrainName(trainNumber);

        System.out.println("Reservation Completed:");
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Train Number: " + trainNumber + " - " + trainName);
        System.out.println("Class: " + classType);
        System.out.println("Date of Journey: " + dateOfJourney);
        System.out.println("From: " + fromPlace);
        System.out.println("To: " + toDestination);
    }

    private String getTrainName(int trainNumber) {
        // Mock train name based on number
        switch (trainNumber) {
            case 12345:
                return "Express Train 1";
            case 67890:
                return "Express Train 2";
            default:
                return "Unknown Train";
        }
    }
}
