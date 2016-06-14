package jim.charles.stock.alert.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import jim.charles.stock.alert.GetInfo;
import jim.charles.stock.alert.Helper;

public class HelperTest 
{
	
	@Test
	public void HelperTest1()
	{
		GetInfo.setSymbol("GOOG");
		GetInfo.setPhoneNumber("464646");
		GetInfo.setUserPrice("$716.55");
		Assert.assertNotNull(new Helper());
	}
	
	@Test
	public void HelperTest2()
	{
		new Helper();
	}
	
	@Test(expectedExceptions = InterruptedException.class)
	public void testPrintMessage() throws InterruptedException 
	{	
		throw new InterruptedException();
	}
}