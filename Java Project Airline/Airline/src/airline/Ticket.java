package airline;

public final class Ticket {
    private final Passenger passenger;
    private final Flight flight;
    private final int numAdults;
    private final int numChildren;
    private final int totalPrice;
    private final boolean isConfirmed;

    public Ticket(Passenger passenger, Flight flight, int numAdults, int numChildren, int totalPrice, boolean isConfirmed) {
        this.passenger = passenger;
        this.flight = flight;
        this.numAdults = numAdults;
        this.numChildren = numChildren;
        this.totalPrice = totalPrice;
        this.isConfirmed = isConfirmed;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public int getNumAdults() {
        return numAdults;
    }

    public int getNumChildren() {
        return numChildren;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public boolean isConfirmed() {
        return isConfirmed;
    }

    @Override
    public String toString() {
        int pricePerAdult = flight.getDestination().getPricePerPerson();
        int pricePerChild = pricePerAdult / 2;

        return "Ticket Details:\n" +
                "-------------------\n" +
                "Passenger Name: " + passenger.name() + "\n" +
                "Destination: " + flight.getDestination() + "\n" +
                "Flight Number: " + flight.getFlightNumber() + "\n" +
                "Adults: " + numAdults + " x €" + pricePerAdult + " = €" + (numAdults * pricePerAdult) + "\n" +
                "Children: " + numChildren + " x €" + pricePerChild + " = €" + (numChildren * pricePerChild) + "\n" +
                "Total Price: €" + totalPrice + "\n" +
                "Confirmed: " + (isConfirmed ? "Yes" : "No") + "\n";
    }
}
