package calculatorTest;

import java.util.Scanner;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Assertclass {
	public static int a, b, c;  //variable declaration
	 @BeforeClass
	 public static void setup()  {

		Scanner userinput = new Scanner(System.in);
		System.out.println("Enter A value:" );
		a = userinput.nextInt();
		//System.out.println("Value of A is " + a);
		System.out.println("Enter B value:" );
		b = userinput.nextInt();
			
	 }	 
	 
	    @Test

	    void add() {

		c = a + b;
		System.out.println("Addition of " + a + " and " + b + " : " + c);
		Assert.assertEquals(c, a+b);
		Reporter.log("Addition operation is successful");
		
	 }	          
		@Test 
	    void sub() 
		{
			 //System.out.println("Welcome ->"+x+" Your search key is->"+y);
		
		System.out.println("Difference of " + a + " and " + b + " : " + c);
		//Assert.assertTrue(sub(), "Executed Subraction operation successfully"); // Only boolean condition is allowed
		//Assert.assertFalse(sub(), "Subraction operation Failed");
		Assert.assertNotEquals(c,3);
		//return false;
		
}
	    
	   @Test
		 public void mul()
		// ( @Optional("Abc") String author,String searchKey)
		 
		 {
			 c = a * b;	
			 System.out.println("Multiplication of " + a + " and " + b + " : " + c);
				
			}
		
	    
	    
		@Test

		public static void div() {
			c = a / b;
			System.out.println("Division of " + a + " and " + b + " : " + c);
		}
		
		
		@Test
		
		void exponent() 
		{
			
			double c = Math.pow(a,b);
			// while (b != 0)
	         //   c *= a;
	           // --b; 
	           System.out.println("The Exponent of " + a + " to the power " + b + " is : " + c);
	        }

		
		
	
}
