package airline;
class FrequentFlyer extends Passenger {
    private int frequentFlyerPoints;

    public FrequentFlyer(String name, int age, String email, String mobileNumber, int frequentFlyerPoints)
    {
        super(name, age, email, mobileNumber);
        this.frequentFlyerPoints = frequentFlyerPoints;
    }

    public int getFrequentFlyerPoints() {
        return frequentFlyerPoints;
    }

    @Override
    public String getName() {
        return "Frequent Flyer: " + super.getName();
    }
}
