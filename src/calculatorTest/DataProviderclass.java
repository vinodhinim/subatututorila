package calculatorTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderclass 

{
	public static int l, m;
	 @DataProvider (name = "SearchProvider")

	 public Object[][] dpMethod(){

	 return new Object[][] {{l}, {m}};

	 
}
}
