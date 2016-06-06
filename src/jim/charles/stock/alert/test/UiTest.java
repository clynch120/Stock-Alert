package jim.charles.stock.alert.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import jim.charles.stock.alert.Ui;

public class UiTest 
{
	Ui u = new Ui();
	@Test
	public void UiTest1()
	{
		Assert.assertNotNull(new Ui());
		new Ui();
	}
	
	@Test
	public void actionTest()
	{
		Ui.main(null);
	}
}
