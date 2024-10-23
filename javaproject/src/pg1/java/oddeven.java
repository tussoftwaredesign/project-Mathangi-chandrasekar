package pg1.java;

import java.util.Scanner;

public class oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner q = new Scanner(System.in);
		int a = q.NextInt();
		if (a%2==0)
		{
			System.out.println("The number is Even");
			else
			{
				System.out.println("The number is odd");
			}
		}
		

	}

}
