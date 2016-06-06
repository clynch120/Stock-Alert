package jim.charles.stock.alert;

import java.util.Timer;
import java.util.TimerTask;

public class Helper 
{
	/**
	 * helper lets user know when stock is at set price
	 */

	public Helper()
	{
		while (helpHelper())
		{
			tenMinTimer();
		}
	}

	/**
	 * 
	 * @return false if stock current price meets target price
	 * and send an alert to the user
	 * return true if stock current price does not meet target price
	 */
	private boolean helpHelper()
	{
		if (GetInfo.getUserPrice().equals("$" + GetPrice.price()))
		{
			if (GetInfo.getEmail() != null)
			{
				Email.sendEmail(GetInfo.getEmail(), alertMessage());
			}
			if (GetInfo.getPhoneNumber() != null)
			{
				Text.sendText(alertMessage());
			}
			return false;
		}
		return true;
	}

	/**
	 * Refresh every ten minutes 
	 * to check if current stock price 
	 * meets target stock price
	 * if stock current stock price hits target price,
	 * an alert will be sent to user
	 */
	private void tenMinTimer()
	{
		int minutes = 240; // The delay in minutes
		Timer timer = new Timer();
		timer.schedule(new TimerTask() 
		{
			@Override
			// runs every minutes minutes.
			public void run() 
			{
				helpHelper();
			}
		}, 0, 1000 * 60 * minutes);
		// 1000 milliseconds in a second * 60 per minute * the MINUTES variable. 
	}

	/**
	 * 
	 * @return message when the stock has
	 * reached user set price
	 */
	private String alertMessage()
	{
		return "Hello " + GetInfo.getFirstName() + ", Stock Alert here,\n We are informing you that "
				+ GetInfo.getSymbol() + " has reached "
				+ GetInfo.getUserPrice() + "\n Thanks again for using Stock Alert!";
	}
}

