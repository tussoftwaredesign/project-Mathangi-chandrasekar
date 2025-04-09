package airline;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ReservationService implements Reservation {
    private final List<Ticket> tickets = new ArrayList<>();
    private static final int TAX_PRICE = 30;

    // Supplier for current tax price
    Supplier<Integer> taxPriceSupplier = () -> TAX_PRICE;

    // Function to calculate total price
    Function<Ticket, Double> totalPriceFunction = ticket -> ticket.getTotalPrice() + taxPriceSupplier.get();

    // Consumer to print a ticket
    Consumer<Ticket> printTicket = ticket -> System.out.println(ticket);

    // Predicate to check for high-priced tickets
    Predicate<Ticket> highPriceFilter = ticket -> ticket.getTotalPrice() > 500;

    @Override
    public boolean reserve(Passenger passenger, Flight flight, int numAdults, int numChildren, boolean isRoundTrip) {
        int pricePerAdult = flight.getDestination().getPricePerPerson();
        int pricePerChild = pricePerAdult / 2;
        int totalPrice = (pricePerAdult * numAdults) + (pricePerChild * numChildren);
        if (isRoundTrip) {
            totalPrice *= 2;
        }
        totalPrice += taxPriceSupplier.get(); // Using Supplier

        Ticket ticket = new Ticket(passenger, flight, totalPrice);
        tickets.add(ticket);

        printTicket.accept(ticket); // Using Consumer
        return true;
    }

    public void displayAllTickets() {
        tickets.forEach(printTicket); // Using Consumer
    }

    public void cancelTickets(Predicate<Ticket> filter) {
        long initialSize = tickets.size();
        tickets.removeIf(filter); // Using Predicate for conditional removal
        System.out.println("Cancelled " + (initialSize - tickets.size()) + " tickets.");
    }

    public void displayTicketsForDestination(Destination destination) {
        tickets.stream()
                .filter(ticket -> ticket.getFlight().getDestination() == destination) // Using Predicate in filter
                .forEach(printTicket); // Using Consumer
    }

    public void displaySortedTicketsByPrice() {
        tickets.stream()
                .sorted((t1, t2) -> Double.compare(t1.getTotalPrice(), t2.getTotalPrice())) // Using Comparator in sorted
                .forEach(printTicket);
    }

    public double getTotalRevenue() {
        return tickets.stream()
                .mapToDouble(totalPriceFunction::apply) // Using Function in mapToDouble
                .sum(); // Using terminal operation to calculate sum
    }

    public List<Ticket> filterTickets(Predicate<Ticket> criteria) {
        return tickets.stream()
                .filter(criteria)
                .collect(Collectors.toList()); // Using Collectors to create a List from stream
    }

    public void displayHighPriceTickets() {
        tickets.stream()
                .filter(highPriceFilter) // Using Predicate to filter high-priced tickets
                .forEach(printTicket); // Using Consumer
    }
}





