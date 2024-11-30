package airline;

public record pass(String name, int age, String email, String mobileNumber)
{
    public pass
    {
        if (age < 0) throw new IllegalArgumentException("Age cannot be negative.");
        if (email == null || !email.contains("@")) throw new IllegalArgumentException("Invalid email address.");
        if (mobileNumber == null || mobileNumber.length() != 10) throw new IllegalArgumentException("Invalid mobile number.");
    }
}
