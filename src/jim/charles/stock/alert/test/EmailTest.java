package jim.charles.stock.alert.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import jim.charles.stock.alert.Email;

public class EmailTest {
	@Test
	public void EmailTest1() 
	{
		Assert.assertNotNull(new Email());
	}
	
	public void sendEmailTest()
	{
		//Email.sendEmail("charles_loper2001@yahoo.com", "hello");
		Email.sendEmail("charles_loper2001@yahoo.commm", "body");
	}
}
