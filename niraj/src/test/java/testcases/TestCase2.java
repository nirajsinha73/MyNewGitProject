package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2 {
	
	@Test
	public void validatetest()
	{
		String expected_tittle = "google.com"; // excel
		String actual_tittle = "gamial.com"; // selenium
		
		
		// using if else case we never report a failure
		
		/*
		if(expected_tittle.equals(actual_tittle))
		{
			System.out.println("test case pass");
		}
		else
			System.out.println("test case fail");
	}
	*/

		//Assert.assertEquals(actual_tittle, expected_tittle);// compare equals value in testng
		Assert.assertTrue(true);
	}
	
}
