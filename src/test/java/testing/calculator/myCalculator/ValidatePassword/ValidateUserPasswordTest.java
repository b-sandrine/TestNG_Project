package testing.calculator.myCalculator.ValidatePassword;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class ValidateUserPasswordTest {
	
	@DataProvider
	public static final Object[][] getPassword() {
		return new Object[][] {
				{1,"Sandrine"}
		};
	}
	
	@Test(dataProvider = "getPassword")
	public void shouldValidatePassword(int id,String userPassword) {
		
		ValidateUserPassword password  = new ValidateUserPassword(userPassword);
		/*
		*  testing a constructor
		*
		*/
		assertEquals(password.getPassword(),userPassword);
	}
	
	@Test(dataProvider="getPassword")
	public void shouldValidateLength(String userPassword) {
		ValidateUserPassword password  = new ValidateUserPassword(userPassword);
		
		
		/*
		*  testing the length of the password
		*
		*/
		assertEquals(password.validateLength(),8);
	}
	
	@Test(dataProvider="getPassword")
	public void shouldCheckSpecialCharacters(String userPassword) {
		ValidateUserPassword password  = new ValidateUserPassword(userPassword);
		/*
		*  testing whether the password includes special characters
		*
		*/
		assertTrue(password.checkSpecialCharacter());
	}
	
}
