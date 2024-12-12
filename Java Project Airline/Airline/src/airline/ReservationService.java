
package airline;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@FunctionalInterface
interface TicketProcessor {
    void process(Ticket ticket);
}

public class ReservationService implements Reservation {
    private final List<Ticket> tickets = new ArrayList<>();
    private static final int TAX_PRICE = 30;

    @Override
    public boolean reserve(Passenger passenger, Flight flight, int numAdults, int numChildren, boolean isRoundTrip) {
        int pricePerAdult = flight.getDestination().getPricePerPerson();
        int pricePerChild = pricePerAdult / 2;
        int totalPrice = (pricePerAdult * numAdults) + (pricePerChild * numChildren);
        if (isRoundTrip) {
            totalPrice *= 2;
        }
        totalPrice += TAX_PRICE;


        Ticket ticket = new Ticket(passenger, flight, totalPrice);
        tickets.add(ticket);

        System.out.println("Ticket reserved successfully!");
        System.out.println(ticket);

        return true;
    }


    public void displayTickets(Predicate<Ticket> filter) {
        System.out.println("Filtered Tickets:");
        tickets.stream()
                .filter(filter)
                .forEach(System.out::println);
    }

    public void cancelTickets(Predicate<Ticket> filter) {
        tickets.removeIf(filter);
        System.out.println("Matching tickets have been canceled.");
    }

    public void processTickets(TicketProcessor processor) {
        tickets.forEach(processor::process);
    }

    public void displayTicketsAbovePrice(int threshold) {
        processTickets(ticket -> {
            if (ticket.getTotalPrice() > threshold) {
                System.out.println(ticket);
            }
        });
    }

    public List<Ticket> getTicketsForDestination(Destination destination) {
        return tickets.stream()
                .filter(ticket -> ticket.getFlight().getDestination() == destination)
                .collect(Collectors.toList());
    }
}







