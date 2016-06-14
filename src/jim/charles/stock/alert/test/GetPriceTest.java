package jim.charles.stock.alert.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import jim.charles.stock.alert.GetInfo;
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
		GetInfo.setSymbol("GOOG");
		GetInfo.setPhoneNumber("464646");
		GetInfo.setUserPrice("$716.55");
		GetPrice.price();
	}
	
	@Test(expectedExceptions = IOException.class)
	public void testPrintMessage() throws IOException 
	{	
		throw new IOException();
	}
}
