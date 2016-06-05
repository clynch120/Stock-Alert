package jim.charles.stock.alert;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Text 
{
	public static void sendText(String message)
	{
		try 
		{
			File file = new File("Text Message.txt");
			BufferedWriter writer = new BufferedWriter(
				    new OutputStreamWriter(new FileOutputStream(file, true),"UTF-8"));
			
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