package weekthreeexercise.java;
import java.util.Scanner;

public class condition 
{
	Scanner sc = new Scanner(System.in);
	void preAndPostDifference()
	{
		int x=5;
		int y=10;
		System.out.println("The value of X is " +x);
		System.out.println("The value of ++x is " + ++x);
		System.out.println("The value of x++ is " + x++);
		System.out.println("The output of x is " +x);
		System.out.println("The value of Y is " +y);
		System.out.println("The value of y-- is " + y--);
		System.out.println("The value of y-- is " + y--);
		System.out.println("The output of y is " +y);
	}
	void booleanLogicShortCircuitOps()
	{
	  System.out.println("Enter the value of 2 numbers num1 & num2 : ");
	  int num1=sc.nextInt();
	  int num2=sc.nextInt();
	  if (num1 < 0 && num2++ < 0)
	  {
		  System.out.println("output is : "+num2);
	  }
	  else if (num1>0 && num2++ >0)
	  {
		  System.out.println("Output is : "+num2);
	  }
	  else if (num1 == 0 || num2++ == 0)
	  {
		  System.out.println("Output is: " +num2);
	  }
	  else if (num1 < 0 || num2++ < 0)
	  {
		  System.out.println("Output is: "+num2);
	  }
	}
	void booleanBitwiseOps()
	{
		System.out.println("Enter the value of 2 numbers num1 & num2 : ");
		  int num1=sc.nextInt();
		  int num2=sc.nextInt();
		  if (num1>0 & num2++ >0)
		  {
			  System.out.println("Output is : "+num2);
		  }
		  else if (num1 == 0 | num2++ == 0)
		  {
			  System.out.println("Output is: " +num2);
		  }
		  else if (num1 < 0 | num2++ < 0)
		  {
			  System.out.println("Output is: "+num2);
		  }
		}
	void compareString()
	{
		System.out.println("Enter the value of the string s1 and s2 :");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		System.out.println("Using == returns" +s1 == s2);
		System.out.println("Using equals() returns " +s1.equals(s2));
		String name1="Sean";
		String name2="Sean";
		System.out.println("Using == returns " +name1 == name2);
	}
	boolean admitToFilm (int , int)
	{
		h = (age != 18)? true : false;
	}
	void ternaryOperator()
	{
		boolean ishappy = true;
		 t=(ishappy=true)? I AM HAPPY : I AM NOT HAPPY;
		System.out.println("Enter the two integer value : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int minval = (x < y)?x : y;
		System.out.println("The minimul value is :" +minval);
	}
	void switchVowelOrConsonant()
	{
		System.out.println("Enter the character to check whetehr it is a vowel or consonent: " );
        char letter;
        switch(letter)
        {
        case 'a':
        	System.out.println("Vowel");
        	break;
        case 'A':
        	System.out.println("Vowel");
        	break;
        case 'e':
        	System.out.println("Vowel");
        	break;
        case 'E':
        	System.out.println("Vowel");
        	break;
        case 'i':
        	System.out.println("Vowel");
        	break;
        case 'I':
        	System.out.println("Vowel");
        	break;
        case 'o':
        	System.out.println("Vowel");
        	break;
        case 'O':
        	System.out.println("Vowel");
        	break;
        case 'u':
        	System.out.println("Vowel");
        	break;
        case 'U':
        	System.out.println("Vowel");
        	break;
        default :
        	System.out.println("Is a Consonant");
        	break;
        	
        }
	}
	void ifMonth()
	{
		
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner (System.in);
		condition obj1 = new condition();
		obj1.preAndPostDifference();
        obj1.booleanLogicShortCircuitOps();
        obj1.booleanBitwiseOps();
        obj1.compareString();
        System.out.println("Enter the certification of the film: ");
		int c = scan.nextInt();
		System.out.println("Enter the person's age: ");
		int age =scan.nextInt();
		boolean x = obj1.boolean admitToFilm(c,age);
		System.out.println("Eligibility to watch a film : "+x);
		obj1.ternaryOperator();
		obj1.switchVowelOrConsonant();
	}

}
