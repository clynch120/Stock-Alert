package jim.charles.stock.alert.test;

import java.io.IOException;

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
		Text.sendText("Text Message.txt", "hello");
	}

	@Test(expectedExceptions = IOException.class)
	public void testPrintMessage() throws IOException 
	{	
		throw new IOException();
	}
}
