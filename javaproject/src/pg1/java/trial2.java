package pg1.java;

import java.util.Scanner;

public class trial2 {

	public static void main(String[] args) {
		Scanner q = new Scanner(System.in);
		System.out.print("Getting values of 3 numbers:");
		int a = q.nextInt();
		int b = q.nextInt();
		int c = q.nextInt();
		int d = a*b*c;
		int e = a+b+c;
		float f = d/e;
		System.out.println("Product of 3 numbers:" +d);
		System.out.println("Addition of 3 numbers:"+e);
		System.out.println("Final result is:" +f);
		
		

	}

}
