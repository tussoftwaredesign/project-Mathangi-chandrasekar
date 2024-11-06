package HelloWorld.java;
import java.util.Scanner;

public class Helloworld {

	public static void main(String[] args)
	{
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Enter your name:");
	  String name = scan.nextLine();
	  System.out.println("Enter your age:");
	  int age = scan.nextInt();
	  System.out.println("Enter your address:");
	  String add =scan.nextLine();
	  System.out.println("Enter your favourite movie:");
	  String mov = scan.nextLine();
	  System.out.println("The outpur is");
	  System.out.println("Your Name is :" +name);
	  System.out.println("Your age is :" +age);
	  System.out.println("Your address is :" +add);
	  System.out.println("Your Favourite movie :" +mov);
	 }

}
