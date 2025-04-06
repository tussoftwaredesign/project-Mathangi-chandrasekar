package airline;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Airline {
    public static void main(String[] args) {
        //System.out.print("Airline Details");
        Scanner scanner = new Scanner(System.in);
        ReservationService reservationService = new ReservationService();
        Reservation.greetUser();
        try {
            System.out.print("Enter Passenger Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Passenger Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Email ID: ");
            String email = scanner.nextLine();
            System.out.print("Enter Mobile Number: ");
            String mobileNumber = scanner.nex   tLine();
            Passenger passenger = new Passenger(name, age, email, mobileNumber);
            System.out.print("Choose Destination (IRELAND, INDIA, USA, UK, CHINA): ");
            Destination destination = switch (scanner.nextLine().toUpperCase()) {
                case "IRELAND" -> Destination.IRELAND;
                case "INDIA" -> Destination.INDIA;
                case "USA" -> Destination.USA;
                case "UK" -> Destination.UK;
                case "CHINA" -> Destination.CHINA;
                default -> throw new IllegalArgumentException("Invalid destination.");
            };

            Flight flight = new Flight(destination, LocalDateTime.now());
            System.out.print("Enter Number of Adults: ");
            int numAdults = scanner.nextInt();
            System.out.print("Enter Number of Children: ");
            int numChildren = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Is this a single trip or a round trip? (single/round): ");
            String tripType = scanner.nextLine().trim().toLowerCase();
            boolean isRoundTrip = tripType.equals("round");
            reservationService.reserve(passenger, flight, numAdults, numChildren, isRoundTrip);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}




