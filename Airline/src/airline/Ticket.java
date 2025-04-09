package airline;

public final class Ticket {
    private final Passenger passenger;
    private final Flight flight;
    private final int totalPrice;

    public Ticket(Passenger passenger, Flight flight, int totalPrice) {
        this.passenger = passenger;
        this.flight = flight;
        this.totalPrice = totalPrice;
    }
    public Passenger getPassenger() {
        return passenger;
    }
    public Flight getFlight() {
        return flight;
    }
    public int getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        int pricePerAdult = flight.getDestination().getPricePerPerson();
        int pricePerChild = pricePerAdult / 2;
        return "Ticket Details:\n" +
                "-------------------\n" +
                "Passenger: " + passenger + "\n" +
                "Destination: " + flight.getDestination() + "\n" +
                "Flight Number: " + flight.getFlightNumber() + "\n" +
                "Total Price (Including Tax): €" + totalPrice + "\n";
    }
}



