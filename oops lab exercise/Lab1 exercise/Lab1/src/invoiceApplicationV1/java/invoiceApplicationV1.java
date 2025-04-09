package invoiceApplicationV1.java;
import java.util.Scanner;
public class invoiceApplicationV1 
{
   public static void main(String[] args) 
   {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter the subtotal:");
	    int sub=scan.nextInt();
	    System.out.println("Enter discount percentage:");
	    int dis=scan.nextInt();
	    double discountAmount = sub *dis;
	    double total =sub - discountAmount;
	    System.out.println("WeLcome to the Invoice Total Calculator");
	    System.out.println();
	    System.out.println("Subtotal:  " +sub);
	    System.out.println("Discount percent:  "+dis);
	    System.out.println("Discount amount:   "+discountAmount);
	    System.out.println("Total:      "+total);
	    

	}

}
