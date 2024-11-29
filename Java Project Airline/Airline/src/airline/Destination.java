package airline;
public enum Destination {
    IRELAND(0, "IRL000"),
    INDIA(40, "IND123"),
    USA(30, "USA456"),
    UK(20, "UKF246"),
    CHINA(50, "CHN867");

    private final int pricePerPerson;
    private final String flightNumber;

    Destination(int pricePerPerson, String flightNumber) {
        this.pricePerPerson = pricePerPerson;
        this.flightNumber = flightNumber;
    }

    public int getPricePerPerson() { return pricePerPerson; }
    public String getFlightNumber() { return flightNumber; }
}
