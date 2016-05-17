package netio.multi.chat;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class EchoServerProgram {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// IP고정(공인 IP)
		List<PrintStream> nouts = new ArrayList<>();

		boolean isRun = true;

		ServerSocket svrSocket = new ServerSocket(10000);

		System.out.println("listenning....");
		while (isRun) {
			Socket socket = svrSocket.accept();
			System.out.println("connected from" + socket.getRemoteSocketAddress());

			new Thread(new Runnable() {
				public void run() {

					try {

						InputStream nis = socket.getInputStream();
						OutputStream nos = socket.getOutputStream();
						ReadWriteLock lock = new ReentrantReadWriteLock();
						PrintStream nout = new PrintStream(nos, true);
						lock.writeLock().lock();
						nouts.add(nout);
						lock.writeLock().unlock();

						Scanner nscan = new Scanner(nis);

						String msg;

						do {

							msg = nscan.nextLine();
							System.out.println(msg);

							lock.readLock().lock();
							for (int i = 0; i < nouts.size(); i++) {
								nouts.get(i).println("나됴니서버:" + msg);
							}
							lock.readLock().unlock();

						} while (!msg.equals("bye"));

						nscan.close();
						nout.close();

						nos.close();
						nis.close();
						socket.close();

					} catch (IOException e) {
						// TODO Auto-generated catch block
						// e.printStackTrace();
					}

				}

				// InputStream nin = socket.getInputStream();
				// OutputStream nout = socket.getOutputStream();

				// char c = (char) nin.read();
				// System.out.println(c);

				// OutputStream fout = new
				// FileOutputStream("C:\\Users\\A\\Desktop\\workspace\\003.jpg");
				// for(int c = nin.read() ; c!=-1; c=nin.read())
				// fout.write(c);
				//
				// nout.flush();
				//
				// fout.close();
				//
				// nin.close();
				// nout.close();
				// socket.close();
				// System.out.println("전송된파일이저장됨ㅋ");
				//

			}).start();

		}
	}
}
