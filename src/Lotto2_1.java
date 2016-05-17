
//파일 입출력 코드 포함

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Lotto2_1 {

	public static void main(String[] args) throws IOException {
		// 랄랄 나정쨩의 로또번호

		FileInputStream fis = new FileInputStream("C:\\Users\\KNJ\\nj\\lotto.txt");
		Scanner fscan = new Scanner(fis);
		Random rand = new Random();
		int[] lotto = new int[6];
		int bonus = 0;

		// 숙제: 중복검사입력

		for (int i = 0; i < 6; i++) 
			lotto[i] = fscan.nextInt(); // rand.nextInt(45) + 1;
		
		fscan.close();
		fis.close();
		// 번호출력1
		for (int i = 0; i < 6; i++)
			System.out.printf("%d  ", lotto[i]);
		System.out.println();

		// 정렬하기

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

		// 번호출력2
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d  ", lotto[i]);
			fout.printf("%d  ", lotto[i]);
		}

		System.out.println();
		fout.close();
		fos.close();
	}

}
