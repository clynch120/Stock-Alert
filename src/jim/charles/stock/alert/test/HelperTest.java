package jim.charles.stock.alert.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import jim.charles.stock.alert.Helper;

public class HelperTest 
{
	@Test
	public void HelperTest1()
	{
		Assert.assertNotNull(new Helper());
	}
}