package pg1.java;
import java.util.Scanner;

public class week3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter X :");
		int x = scan.nextInt();
		System.out.print("Enter Y :");
		int y = scan.nextInt();
		int sum = calculateSum(x,y);
		System.out.println("The Sum of " +x+ " and " +y+ " is " +sum);
        int Product = calculateProduct(x,y);
        System.out.println("The product of " +x+ " and " +y+ " is " +Product);
        int diff = calculateDifference(x,y);
        System.out.println("The Difference of " +x+ " and " +y+ " is " +diff);
        int quo = calculateQuotient(x,y);
        System.out.println("The Difference of " +x+ " and " +y+ " is " +quo);
        System.out.println("Calculating the volume of a cylinder");
        Scanner s = new Scanner (System.in);
        System.out.print("Enter length : ");
        int len = s.nextInt();
        System.out.print("Enter Width : ");
        int wid = s.nextInt();
        System.out.print("Enter height : ");
        int hei = s.nextInt();
        int volume = calcvolume(len,wid,hei);
        System.out.println("The volume is " +volume);
        carPark();
        coordGeometry();
        
        
	}
	public static int calculateSum(int x, int y) {
		int z = x+y;
		return z;   //z is sum
	 }
	public static int calculateProduct(int x, int y) {
		int a = x*y;
		return a;  //a is product
	}
	public static int calculateDifference(int x, int y) {
		int b = x-y;
		return b;  //b is difference
	}
	public static int calculateQuotient(int x, int y) {
		int c = x/y;
		return c;  //c is Quotient
	}
	public static int calcvolume(int len,int wid,int hei) {
		int v = len * wid * hei;
		return v; 
	}
	public static void carPark() {
		Scanner c =new Scanner(System.in);
		System.out.println("How many Cars -->");
		int car = c.nextInt();
		for (int i = 0 ; i< car; i ++) 
		{
			System.out.print("How many hours was the car parked for?-->");
			double hrs = c.nextInt();
		if (hrs <= 1)
		{
			System.out.println("First hour is free");
		}	
		else
		{
			 if(hrs >= 12)
			 {
				 System.out.println("Charge 21.0 euros");
			 }	 
			 else
			 {
				 System.out.println("Charged 12.0 euros");
			 }
		}	 
		}
	}
		public static void coordGeometry() {
			Scanner p = new Scanner(System.in);
			System.out.println("Enter X1 -->");
			double z = p.nextInt();
			System.out.println("Enter Y1 -->");
			double y = p.nextInt();
			System.out.println("Enter X2 -->");
			double x = p.nextInt();
			System.out.println("Enter Y2 -->");
			double w = p.nextInt();
			double a = 
			
			
		}
		
	}
	


}

