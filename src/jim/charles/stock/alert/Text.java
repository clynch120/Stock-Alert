package jim.charles.stock.alert;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Text 
{
	/**
	 * 
	 * @param message takes a string arg for the 
	 * message to send
	 * sendText sends a fake text message to
	 * a text file called Text Message.txt
	 */
	public static void sendText(String message)
	{
		try 
		{
			File file = new File("Text Message.txt");
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(file, true),"UTF-8"));
			
			writer.write(message + "\n");
			writer.newLine();
			writer.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}		
	}
}