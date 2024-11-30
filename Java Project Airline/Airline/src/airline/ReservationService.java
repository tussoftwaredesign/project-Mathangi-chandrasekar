package airline;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ReservationService implements Reservation {
    private final List<Ticket> tickets = new ArrayList<>();

    @Override
    public boolean reserve(Passenger passenger, Flight flight, int numAdults, int numChildren, boolean isRoundTrip) {

        int pricePerAdult = flight.getDestination().getPricePerPerson();
        int pricePerChild = pricePerAdult / 2;
        int totalPrice = (pricePerAdult * numAdults) + (pricePerChild * numChildren);

        if (isRoundTrip)
        {
            totalPrice *= 2;
        }


        Ticket ticket = new Ticket(passenger, flight, numAdults, numChildren, totalPrice, true);
        tickets.add(ticket);
        System.out.println("Ticket reserved successfully!");
        System.out.println(ticket); // Ticket's toString() provides detailed info

        return true;
    }
    public void displayTickets(Predicate<Ticket> filter) {
        System.out.println("Filtered Tickets:");
        tickets.stream()
                .filter(filter) // Apply the condition
                .forEach(System.out::println); // Print matching tickets
    }
    public void cancelTickets(Predicate<Ticket> filter) {
        tickets.removeIf(filter); // Remove matching tickets
        System.out.println("Matching tickets have been canceled.");
    }
}


