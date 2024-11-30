package airline;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Airline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReservationService reservationService = new ReservationService();
        try {
            System.out.print("Enter Passenger Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Passenger Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            System.out.print("Enter Email ID: ");
            String email = scanner.nextLine();
            System.out.print("Enter Mobile Number: ");
            String mobileNumber = scanner.nextLine();
            Passenger passenger = new Passenger(name, age, email, mobileNumber);
            System.out.print("Enter Destination (IRELAND, INDIA, USA, UK, CHINA): ");
            String destinationInput = scanner.nextLine().toUpperCase();
            Destination destination;
            switch (destinationInput) {
                case "IRELAND":
                    destination = Destination.IRELAND;
                    break;
                case "INDIA":
                    destination = Destination.INDIA;
                    break;
                case "USA":
                    destination = Destination.USA;
                    break;
                case "UK":
                    destination = Destination.UK;
                    break;
                case "CHINA":
                    destination = Destination.CHINA;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid destination. Please choose a valid destination.");
            }
            System.out.println("You have selected destination: " + destination);
            System.out.print("Enter Date of Travel (yyyy-MM-dd): ");
            String travelDate = scanner.nextLine();
            System.out.print("Enter Time of Travel (HH:mm): ");
            String travelTime = scanner.nextLine();
            LocalDateTime departureTime = null;
            try {
                DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
                departureTime = LocalDateTime.of(
                        LocalDate.parse(travelDate, dateFormatter),
                        LocalTime.parse(travelTime, timeFormatter)
                );
            } catch (DateTimeParseException e) {
                throw new IllegalArgumentException("Invalid date or time format. Please use yyyy-MM-dd for date and HH:mm for time.");
            }
            Flight flight = new Flight(destination, departureTime);
            System.out.print("Enter Number of Adults: ");
            int numAdults = scanner.nextInt();
            System.out.print("Enter Number of Children: ");
            int numChildren = scanner.nextInt();
            scanner.nextLine();
            if (numAdults < 0 || numChildren < 0) {
                throw new IllegalArgumentException("Number of adults or children cannot be negative.");
            }
            System.out.print("Is this a single trip or a round trip? (single/round): ");
            String tripType = scanner.nextLine().trim().toLowerCase();
            boolean isRoundTrip = tripType.equals("round");
            reservationService.reserve(passenger, flight, numAdults, numChildren, isRoundTrip);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
