package airline;
import java.time.LocalDateTime;

public class Flight {
    private Destination destination;
    private LocalDateTime departureTime;
    private FlightStatus status;
    public Flight(Destination destination) {
        this(destination, LocalDateTime.now());
    }
    public Flight(Destination destination, LocalDateTime departureTime) {
        this.destination = destination;
        this.departureTime = departureTime;
        this.status = FlightStatus.ON_TIME;
    }
    public String getFlightNumber() {
        return destination.getFlightNumber();
    }

    public Destination getDestination() {
        return destination;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public FlightStatus getStatus() {
        return status;
    }

    public void setStatus(FlightStatus status) {
        this.status = status;
    }
}
