package airline;
public class Ticket {
    private Passenger passenger;
    private Flight flight;
    private int totalPrice;
    private boolean isConfirmed;

    public Ticket(Passenger passenger, Flight flight, int totalPrice) {
        this.passenger = passenger;
        this.flight = flight;
        this.totalPrice = totalPrice;
        this.isConfirmed = false;
    }

    public Passenger getPassenger() { return passenger; }
    public Flight getFlight() { return flight; }
    public int getTotalPrice() { return totalPrice; }

    public void confirmTicket() {
        isConfirmed = true;
        System.out.println("Your ticket is confirmed.");
        printTicket();
    }

    public void cancelTicket() {
        isConfirmed = false;
        System.out.println("Your ticket is canceled.");
    }

    public void printTicket() {
        System.out.println("Ticket for " + passenger.getName() + " to " + flight.getDestination() + ":");
        System.out.println("Flight Number: " + flight.getFlightNumber());
        System.out.println("Date of Travel: " + flight.getDepartureTime().toLocalDate());
        System.out.println("Time of Travel: " + flight.getDepartureTime().toLocalTime());
        System.out.println("Total Price: €" + totalPrice);
    }
}
