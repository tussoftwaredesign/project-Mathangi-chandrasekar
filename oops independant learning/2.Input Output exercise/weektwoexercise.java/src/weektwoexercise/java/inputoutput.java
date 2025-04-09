package weektwoexercise.java;
import java.util.Scanner;

public class inputoutput {
    private static Scanner sc = new Scanner(System.in);
    String getname() {
        System.out.print("Enter your full name: ");
        String name = sc.nextLine();
        return name;
    }
    public static void getname(String[] names) {
    	System.out.print("Enter first and last name: ");
        names[0] = sc.next();
        names[1] = sc.next();
    }
    int getAge() {
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        return age;
    }
    boolean checkpension(int age) {
        if (age >= 65) {
            System.out.println("You are eligible for pension");
            return true;
        } else {
            System.out.println("You are not eligible for pension");
            return false;
        }
    }
    public static void main(String[] args)
    {
        inputoutput obj1 = new inputoutput();
        String fullName = obj1.getname();
        String[] name = new String[2];
        getname(name);
        int age = obj1.getAge();
        boolean isEligibleForPension = obj1.checkpension(age);
        System.out.println("Full Name: " + fullName);
        System.out.println("First Name: " + name[0]);
        System.out.println("Last Name: " + name[1]);
        System.out.println("Age: " + age);
        System.out.println("Eligibility: " + (isEligibleForPension ? "Eligible" : "Not Eligible"));
    }
}
