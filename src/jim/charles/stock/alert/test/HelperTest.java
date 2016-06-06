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
		Assert.assertNotNull(new Helper());
	}
	
	@Test
	public void HelperTest2()
	{
		new Helper();
	}
}