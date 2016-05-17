
//���� ����� �ڵ� ����

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Lotto2_1 {

	public static void main(String[] args) throws IOException {
		// ���� ����»�� �ζǹ�ȣ

		FileInputStream fis = new FileInputStream("C:\\Users\\KNJ\\nj\\lotto.txt");
		Scanner fscan = new Scanner(fis);
		Random rand = new Random();
		int[] lotto = new int[6];
		int bonus = 0;

		// ����: �ߺ��˻��Է�

		for (int i = 0; i < 6; i++) 
			lotto[i] = fscan.nextInt(); // rand.nextInt(45) + 1;
		
		fscan.close();
		fis.close();
		// ��ȣ���1
		for (int i = 0; i < 6; i++)
			System.out.printf("%d  ", lotto[i]);
		System.out.println();

		// �����ϱ�

		int a;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				if (lotto[j] > lotto[j + 1]) {
					a = lotto[j];
					lotto[j] = lotto[j + 1];
					lotto[j + 1] = a;
				}
			}
		}
		FileOutputStream fos = new FileOutputStream("C:\\Users\\KNJ\\nj\\lotto.txt");
		PrintStream fout = new PrintStream(fos);

		// ��ȣ���2
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d  ", lotto[i]);
			fout.printf("%d  ", lotto[i]);
		}

		System.out.println();
		fout.close();
		fos.close();
	}

}
