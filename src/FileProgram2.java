import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class FileProgram2 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("res/images/photo.bmp");
		FileOutputStream fos = new FileOutputStream("res/images/photo-copy.bmp");
		// ����������� �����ϱ�
		// �̹����ʺ�
		// for(int i=0; i<18;i++)
		// fis.read();
		//
		// byte[] buf = new byte[4];
		//
		// buf[0] = (byte) fis.read();
		// buf[1] = (byte) fis.read();
		// buf[2] = (byte) fis.read();
		// buf[3] = (byte) fis.read();
		//
		//
		// int size = (((int) buf[3]) << 24 | ((int) buf[2]) << 16 | ((int)
		// buf[1]) << 8 | ((int) buf[0]));
		//
		// System.out.println(size);

		// ���Ͻ�����
		fis.read();
		fis.read();

		byte[] buf = new byte[4];

		buf[0] = (byte) fis.read();
		buf[1] = (byte) fis.read();
		buf[2] = (byte) fis.read();
		buf[3] = (byte) fis.read();


		int size = (((int) buf[3]) << 24 | ((int) buf[2]) << 16 | ((int) buf[1]) << 8 | ((int) buf[0]));

		System.out.println(size);

		// -----���3----------------------------------
		// byte[] buf = new byte[1024];
		// int size;
		//
		// while((size = fis.read(buf)) != -1)
		// fos.write(buf, 0,size); //size��ŭ ����
		//
		//

		// -----���2----------------------------------
		// int nj;
		// while((nj= fis.read()) != -1)
		// fos.write(nj);

		// -----���1----------------------------------
		// while(true){
		// int nj = fis.read();
		//
		// if(nj == -1)
		// break;
		// else
		// fos.write(nj);
		// }
		//
		//

		fis.close();
		fos.close();

	}

}
