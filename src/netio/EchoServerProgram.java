package netio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class EchoServerProgram {

	public static void main(String[] args) throws UnknownHostException, IOException{
		//IP����(���� IP)
		
		ServerSocket svrSocket= new ServerSocket(12345);
		
		System.out.println("listenning...." );
		
			Socket socket = svrSocket.accept();
			System.out.println("connected from"+socket.getRemoteSocketAddress());
			
//			InputStream nin = socket.getInputStream();
//			OutputStream nout = socket.getOutputStream();
			
		//char c = (char) nin.read();
	//	System.out.println(c);
			
//			OutputStream fout = new FileOutputStream("C:\\Users\\A\\Desktop\\workspace\\003.jpg");
//			for(int c = nin.read() ; c!=-1; c=nin.read())
//				fout.write(c);
//			
//			nout.flush();
//			
//			fout.close();
//			
//			nin.close();
//			nout.close();
//			socket.close();
//			System.out.println("���۵�����������ʤ�");
//		
		
			OutputStream nos = socket.getOutputStream();
			InputStream nis = socket.getInputStream();
			
			PrintStream nout = new PrintStream(nos,true);
			Scanner nscan = new Scanner(nis);
			
			
			String msg ;
			do{
				msg = nscan.nextLine();
				System.out.println(msg);
		
			
			nout.println("echo:"+msg);
			
			}while(!msg.equals("bye"));
			
			nout.close();
			nscan.close();
			nis.close();
			nos.close();
			socket.close();
			
		
		
		
	}
	
}
