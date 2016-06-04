package jim.charles.stock.alert.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import jim.charles.stock.alert.GetPrice;

public class GetPriceTest 
{
	@Test
	public void GetPriceTest1()
	{
		Assert.assertNotNull(new GetPrice());
	}
	
	@Test
	public void priceTest()
	{
		Assert.assertNotNull(GetPrice.price());
	}
}
