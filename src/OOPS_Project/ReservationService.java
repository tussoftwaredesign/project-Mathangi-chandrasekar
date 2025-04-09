

package airline;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ResourceBundle;
import java.io.IOException;
import java.util.ArrayList;

public class ReservationService {
    private List<Ticket> tickets; // Assume this is initialized elsewhere
    private ExecutorService executor = Executors.newFixedThreadPool(4); // for concurrency
    private ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", Locale.getDefault());

    // Method to process tickets concurrently and find the cheapest ticket
    public Optional<Ticket> findCheapestTicketConcurrently() throws Exception {
        List<Callable<Ticket>> tasks = new ArrayList<>();
        for (Ticket ticket : tickets) {
            Callable<Ticket> task = () -> ticket;
            tasks.add(task);
        }
        List<Future<Ticket>> futures = executor.invokeAll(tasks);
        double minPrice = Double.MAX_VALUE;
        Ticket cheapestTicket = null;
        for (Future<Ticket> future : futures) {
            Ticket currentTicket = future.get();
            if (currentTicket.getTotalPrice() < minPrice) {
                minPrice = currentTicket.getTotalPrice();
                cheapestTicket = currentTicket;
            }
        }
        return Optional.ofNullable(cheapestTicket);
    }

    // Method to save tickets information to a file using NIO2
    public void saveTicketsToFile() {
        Path path = Paths.get("tickets.txt");
        try {
            List<String> ticketStrings = tickets.stream()
                    .map(Ticket::toString)
                    .collect(Collectors.toList());
            Files.write(path, ticketStrings);
            System.out.println(messages.getString("ticketsSaved"));
        } catch (IOException e) {
            System.out.println(messages.getString("errorSavingTickets"));
        }
    }

    // Localized method to print all tickets
    public void printAllTickets() {
        tickets.forEach(ticket -> System.out.println(ticket.toString()));
        System.out.println(messages.getString("allTicketsDisplayed"));
    }

    // Existing methods are below, potentially with added localization
    public void printTicketsForDestination(Destination destination) {
        tickets.stream()
                .filter(ticket -> ticket.getFlight().getDestination() == destination)
                .forEach(System.out::println);
        System.out.println(messages.getString("ticketsForDestinationDisplayed"));
    }

    // Shutdown executor
    public void shutdownService() {
        executor.shutdown();
        System.out.println(messages.getString("serviceShutdown"));
    }
}



