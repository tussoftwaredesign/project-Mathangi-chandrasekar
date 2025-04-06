package airline;
import java.util.function.Predicate;

public interface Reservation {
    System.out.println("Reservation Details);
    boolean reserve(Passenger passenger, Flight flight, int numAdults, int numChildren, boolean isRoundTrip);
    default void printReservationDetails(Passenger passenger) {
        System.out.println("Reservation Details for: " + passenger.name());
    }
    static void greetUser() {
        System.out.println("Welcome to the Airline Reservation System!");
    }
    private void log(String message) {
        System.out.println("Log: " + message);
    }
}
