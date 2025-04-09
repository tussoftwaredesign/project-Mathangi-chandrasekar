package pg1.java;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner q =new Scanner(System.in);
       System.out.println("Enter the value of A:");
       int a = q.nextInt();
       System.out.println("Enter the value of B:");
       int b = q.nextInt();
       if (a==b)
       {
        System.out.print("both are equal");
       }
       else
        {
        	System.out.println("both are not equal");
       }
	}
}
