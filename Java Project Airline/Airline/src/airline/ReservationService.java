package airline;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ReservationService implements Reservation {
    private final List<Ticket> tickets = new ArrayList<>();
    private static final int TAX_PRICE = 30; // Tax added to the total cost

    @Override
    public boolean reserve(Passenger passenger, Flight flight, int numAdults, int numChildren, boolean isRoundTrip) {
        int pricePerAdult = flight.getDestination().getPricePerPerson();
        int pricePerChild = pricePerAdult / 2;

        // Calculate total ticket price for adults and children
        int totalPrice = (pricePerAdult * numAdults) + (pricePerChild * numChildren);

        // Double the price for a round trip
        if (isRoundTrip) {
            totalPrice *= 2;
        }

        // Add tax to the total price
        totalPrice += TAX_PRICE;

        // Create and add the ticket
        Ticket ticket = new Ticket(passenger, flight, totalPrice);
        tickets.add(ticket);

        // Print reservation confirmation
        System.out.println("Ticket reserved successfully!");
        System.out.println(ticket);

        return true;
    }

    /**
     * Display tickets that match a specific condition.
     */
    public void displayTickets(Predicate<Ticket> filter) {
        System.out.println("Filtered Tickets:");
        tickets.stream()
                .filter(filter) // Apply the condition
                .forEach(System.out::println); // Print matching tickets
    }

    /**
     * Cancel tickets that match a specific condition.
     */
    public void cancelTickets(Predicate<Ticket> filter) {
        tickets.removeIf(filter); // Remove matching tickets
        System.out.println("Matching tickets have been canceled.");
    }
}








