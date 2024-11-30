package airline;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Airline {
    public static void main(String[] args) {
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
            String mobileNumber = scanner.nextLine();

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

            reservationService.reserve(passenger, flight, numAdults, numChildren, false);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}




