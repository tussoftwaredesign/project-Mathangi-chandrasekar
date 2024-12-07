package airline;

public final class Ticket {
    private final Passenger passenger; // Base class reference for Passenger or FrequentFlyer
    private final Flight flight;       // Flight details
    private final int totalPrice;      // Total ticket price

    public Ticket(Passenger passenger, Flight flight, int totalPrice) {
        this.passenger = passenger;
        this.flight = flight;
        this.totalPrice = totalPrice;
    }

    // Getter for Passenger
    public Passenger getPassenger() {
        return passenger;
    }

    // Getter for Flight
    public Flight getFlight() {
        return flight;
    }

    // Getter for Total Price
    public int getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        // Use flight destination price details for breakdown
        int pricePerAdult = flight.getDestination().getPricePerPerson();
        int pricePerChild = pricePerAdult / 2;

        // Generate detailed ticket information
        return "Ticket Details:\n" +
                "-------------------\n" +
                "Passenger: " + passenger + "\n" + // Calls Passenger or FrequentFlyer toString()
                "Destination: " + flight.getDestination() + "\n" +
                "Flight Number: " + flight.getFlightNumber() + "\n" +
                "Total Price (Including Tax): €" + totalPrice + "\n";
    }
}



