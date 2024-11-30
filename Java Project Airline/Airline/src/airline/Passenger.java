package airline;

public class Passenger
{
    private String name;
    private int age;
    private String email;
    private String mobileNumber;

    public Passenger(String name, int age, String email, String mobileNumber)
    {
        this.name = name;
        this.age = age;
        this.email = email;
        this.mobileNumber = mobileNumber;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getEmail() { return email; }
    public String getMobileNumber() { return mobileNumber; }

    public String mobileNumber()
    {
        return mobileNumber;
    }

    public String email()
    {
        return email;
    }

    public int age()
    {
        return age;
    }

    public String name()
    {
        return name;
    }
}
