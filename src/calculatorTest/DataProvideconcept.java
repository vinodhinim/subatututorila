package calculatorTest;

import java.util.Scanner;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class DataProvideconcept 
{
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
	    void sub(String x, String  y) {
			 System.out.println("Welcome ->"+x+" Your search key is->"+y);
		
		//System.out.println("Difference of " + x + " and " + y + " : " + z);
		//Assert.assertTrue(sub(), "Executed Subraction operation successfully"); // Only boolean condition is allowed
		//Assert.assertFalse(sub(), "Subraction operation Failed");
		//Assert.assertNotEquals(z,3);
		//return false;
		
}
	    
	   @Test
		 public void mul(@Optional("8") int a, @Optional("8") int b)
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
		
		 @DataProvider (name = "data-provider")

		 public Object[][] dpMethod(){

		 return new Object[][] {{a}, {b}};

		 } 
		 
		//@Test(dataProvider="SearchProvider",dataProviderClass=DataProviderclass.class)

	//@Test (dataProvider = "data-provider")
}
