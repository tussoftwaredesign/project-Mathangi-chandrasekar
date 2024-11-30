package airline;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReservationService implements Reservation {
    private List<Ticket> tickets = new ArrayList<>();

    @Override
    public boolean reserve(Passenger passenger, Flight flight, int numAdults, int numChildren, boolean isRoundTrip) {
        int pricePerPerson = flight.getDestination().getPricePerPerson();
        int adultPrice = pricePerPerson * numAdults;
        int childPrice = (pricePerPerson / 2) * numChildren;
        int totalPrice = adultPrice + childPrice;

        if (isRoundTrip) {
            totalPrice *= 2;
        }
        Ticket ticket = new Ticket(passenger, flight, totalPrice);
        tickets.add(ticket);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Has payment been made? (yes/no): ");
        String paymentStatus = scanner.nextLine().trim().toLowerCase();

        if (paymentStatus.equals("yes")) {
            ticket.confirmTicket();
        } else {
            ticket.cancelTicket();
        }

        return paymentStatus.equals("yes");
    }
}



