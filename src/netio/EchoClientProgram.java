package netio;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class EchoClientProgram {

	public static void main(String[] args) throws IOException {

		Socket socket = new Socket("211.238.142.159", 10000);
		System.out.println("connected to" + socket.getRemoteSocketAddress());
		
//		try(Socket socket = new Socket("211.238.142.112",10000)){
//			socket.setSoTimeout(15000);
//		}catch (IOException ex){
//			System.out.println("연결 오류");
//		}
//				
//		InputStream nin = socket.getInputStream();
//		OutputStream nout = socket.getOutputStream();
//		
//		InputStream fin = new FileInputStream("C:\\Users\\A\\Desktop\\workspace\\002.jpg");
//		for(int c = fin.read() ; c!=-1; c=fin.read())
//			nout.write(c);
//		
//		nout.flush();
//		
//		fin.close();
//		
//		nin.close();
//		nout.close();
//		socket.close();
//		System.out.println("전송완료데쓰");
	//	nout.write('j');
	//	nout.flush();
		
		OutputStream nos = socket.getOutputStream();
		InputStream nis = socket.getInputStream();
		
		PrintStream nout = new PrintStream(nos,true);
		Scanner nscan = new Scanner(nis);
		Scanner scan = new Scanner(System.in);
		
//		
//		nout.println("Hello network~");
//		
		
		String msg ; 
		do{
			msg = scan.nextLine();
			nout.println(msg);
			
			
			String echo = nscan.nextLine();
			
		System.out.println(echo);
		}while(!msg.equals("bye"));
		
		nout.close();
		nscan.close();
		nis.close();
		nos.close();
		socket.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
