package airline;

public class FrequentFlyer {
    private final Passenger passenger;
    private final int frequentFlyerPoints;


    public FrequentFlyer(String name, int age, String email, String mobileNumber, int frequentFlyerPoints) {
        this.passenger = new Passenger(name, age, email, mobileNumber);
        this.frequentFlyerPoints = frequentFlyerPoints;
    }


    public String getName() {
        return passenger.name();
    }

    public int getAge() {
        return passenger.age();
    }

    public String getEmail() {
        return passenger.email();
    }

    public String getMobileNumber() {
        return passenger.mobileNumber();
    }


    public int getFrequentFlyerPoints() {
        return frequentFlyerPoints;
    }

    @Override
    public String toString() {
        return "FrequentFlyer{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", email='" + getEmail() + '\'' +
                ", mobileNumber='" + getMobileNumber() + '\'' +
                ", frequentFlyerPoints=" + frequentFlyerPoints +
                '}';
    }
}
