package client;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
//  http://www.yahoo.com
public class client {

	public static void main(String[] args) {
		try {
			Socket my=new Socket("localhost",2000);
			my.setSoTimeout(15000);
			InputStream is=my.getInputStream();
			InputStreamReader isr=new InputStreamReader(is, "ASCII");
			
			for(int c=isr.read(); c!=-1; c=isr.read())
			{
				System.out.print((char)c);
			}
			my.close();
			
			System.out.println("The End");
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
