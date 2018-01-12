import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;


public class URLDemo 
{

	public static void main(String[] args) 
	{
		try 
		{
			URL url = new URL("http://www.javatpoint.com/java-tutorial");
			HttpURLConnection ucon= (HttpURLConnection)url.openConnection();
			BufferedReader ip=new BufferedReader(new InputStreamReader(ucon.getInputStream()));
			int i;
			while((i=ip.read())!=-1)
			{
				System.out.println((char)i);
			} 
			
			
			
		} 
		catch (Exception e) 
		{

			e.printStackTrace();
		}


	}

}
/*
InputStream ip=ucon.getInputStream();
int i;
while((i=ip.read())!=-1)
{
	System.out.println((char)i);
}
 */
