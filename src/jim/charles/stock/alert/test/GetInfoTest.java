package jim.charles.stock.alert.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import jim.charles.stock.alert.GetInfo;

public class GetInfoTest 
{
	@Test
	public void GetInfoTest1()
	{
		Assert.assertNotNull(new GetInfo());
	}
	
	@Test
	public void getEmailTest()
	{
		GetInfo.setEmail("hello");
		Assert.assertEquals(GetInfo.getEmail(), "hello");
	}
	
	@Test
	public void setEmailTest()
	{
		Assert.assertNotNull(GetInfo.getEmail());
	}
	
	@Test
	public void getPhoneNumberTest()
	{
		GetInfo.setPhoneNumber("123456789");
		Assert.assertEquals(GetInfo.getPhoneNumber(), "123456789");
	}
	
	@Test
	public void setPhoneNumberTest()
	{
		Assert.assertNotNull(GetInfo.getPhoneNumber());
	}
	
	@Test
	public void getFirstNameTest()
	{
		GetInfo.setFirstName("Me");
		Assert.assertEquals(GetInfo.getFirstName(), "Me");
	}
	
	@Test
	public void setFirstNameTest()
	{
		Assert.assertNotNull(GetInfo.getFirstName());
	}
	
	@Test
	public void getLastNameTest()
	{
		GetInfo.setLastName("Me");
		Assert.assertEquals(GetInfo.getLastName(), "Me");
	}
	
	@Test
	public void setLastNameTest()
	{
		Assert.assertNotNull(GetInfo.getLastName());
	}
	
	@Test
	public void getUserPriceTest()
	{
		GetInfo.setUserPrice("99.99");
		Assert.assertEquals(GetInfo.getUserPrice(), "99.99");
	}
	
	@Test
	public void setUserPriceTest()
	{
		Assert.assertNotNull(GetInfo.getUserPrice());
	}
	
	@Test
	public void getSymbolTest()
	{
		GetInfo.setSymbol("syb");
		Assert.assertEquals(GetInfo.getSymbol(), "syb");
	}
	
	@Test
	public void setSymbolTest()
	{
		Assert.assertNotNull(GetInfo.getSymbol());
	}
}
