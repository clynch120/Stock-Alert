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
	
	@Test
	public void sendEmailTest()
	{
		Email.sendEmail("stockalert101@yahoo.com", "hello");
	}
}
