package airline;
import airline.models.Flight;
import airline.models.Passenger;

public interface Reservation
{
    boolean reserve(airline.models.Passenger passenger, airline.models.Flight flight, int numAdults, int numChildren, boolean isRoundTrip);
}
