package iteration.java;
public class iteration 
{
	public static void whileLoop1()
	{
		int n=5;
		int i =0;
		int total = 0;
		while (i<= n);
		{
			System.out.println("Loop1:i == " +i);
			total +=i;
			i=i+1;
		}
		System.out.println("Loop1:Total == "+total);
		while (i <= n);
		{
			System.out.println("Loop2:i == " +i);
			total +=i;
			i=i+2;
		}
		System.out.println("Total == "+total);
      }
	public static void whileLoop2()
	{
		int n=0;
		int i=5;
		int total = 0;
		while (i <= n );
		{
			System.out.println("Loop1:i == "+i);
			total +=i;
			i=i-1;
		}
		System.out.println("Loop1:i == " +total);
		while (i <= n);
		{
			System.out.println("Loop2:i == " +i);
			total +=i;
			i=i-2;
		}
		System.out.println("Total == "+total);
	}
	public static void whileloop3()
	{
		
	}
	public static void doWhileLoop1()
	{
		int n=5;
		int i =0;
		int total = 0;
		do
		{
			System.out.println("Loop1:i == " +i);
			total +=i;
			i=i+1;
		}while (i<= n);
		System.out.println("Loop1:Total == "+total);
		do
		{
			System.out.println("Loop2:i == " +i);
			total +=i;
			i=i+2;
		}while (i <= n);
		System.out.println("Total == "+total);
		
	 }
	public static void doWhileLoop2()
	{
		int n=0;
		int i =5;
		int total = 0;
		do
		{
			System.out.println("Loop1:i == " +i);
			total +=i;
			i=i-1;
		}while (i<= n);
		System.out.println("Loop1:Total == "+total);
		do
		{
			System.out.println("Loop2:i == " +i);
			total +=i;
			i=i-2;
		}while (i <= n);
		System.out.println("Total == "+total);
	 }
	 public static void doWhileLoop3()
	 {
		 
	 }
	 public static void forLoop1()
	 {
		 
	 }
   public static void main(String[] args)
   {
	   System.out.print("Function calling");
	   whileLoop1();
	   whileLoop2();
	   whileloop3();
	   doWhileLoop1();
	   doWhileLoop2();
	   doWhileLoop3();
	   
    
	}

}
