package jim.charles.stock.alert.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import jim.charles.stock.alert.Text;

public class TextTest 
{
	@Test
	public void textTest()
	{
		Assert.assertNotNull(new Text());
	}
	
	@Test
	public void sendTextTest()
	{
		Text.sendText("hello");
	}
}
