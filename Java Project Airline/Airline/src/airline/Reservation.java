package airline;


public interface Reservation
{
    boolean reserve(airline.Passenger passenger, airline.Flight flight, int numAdults, int numChildren, boolean isRoundTrip);
}
