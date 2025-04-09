package pg1.java;

import java.util.Scanner;

public class add3userinput {

	public static void main(String[] args) {
		Scanner a=new Scanner (System.in);
		System.out.println("Addition of 2 numbers");
		System.out.print("Enter the value of 1st number:");
		int q=a.nextInt();
		System.out.print("Enter the value of 2nd number:");
		int w=a.nextInt();
		int e=q+w;
		System.out.print("Addition of 2 numbers is: " +e);
		
				

	}

}
