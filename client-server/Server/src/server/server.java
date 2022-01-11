package server;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class server {

public  final static int PORT = 2000;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket ser=new ServerSocket(PORT);
			System.out.println("start ...");
                        int i =1;
			while(true)
			{
				Socket conn=ser.accept();
				System.out.println(i + "- " +conn.getRemoteSocketAddress());
				OutputStream os=conn.getOutputStream();
				Writer w=new OutputStreamWriter(os, "ASCII");
				Date d=new Date();
				w.write("Quiz4 Server: Time: "+d.toString()+"\r\n");
				w.flush();
				conn.close();
                                i++;
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		

	}

}
