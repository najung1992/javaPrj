import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class FileProgram {

	public static void main(String[] args) throws IOException {
		// ���� �����

//		char[] str = new char[] { 'H', 'e', 'l', 'l', 'o', 0, 'o', 'k', 0 };
//		// 0���� �����ϴµ� ���ڷ��ϸ� '\0' null����
//
//		System.out.println("Hello");
//
//		// ���ڿ� ��ġ��
//		// + , concat(str)
//		System.out.println("Good" + " bye~"); // bye�տ� ��ĭ����
//		System.out.println("Good".concat(" night~"));
//
//		// ���ڿ� ������
//		// split() -> lotto : 12 23 54 Line���ι޾����� �����ؾ���. ������ �ʿ�
//		String[] strs = "lotto : 12 23 54".split("5");
//		System.out.println(strs[0]);
//		System.out.println(strs[1]);
//
//		// ���ڿ� �ڸ��� ( 2,4 ) -> 2<=x<4
//		"Hello".substring(2); // llo ���Ȥ� 01234��
//
//		// ���ڿ� ���ϱ�
//		String name1 = "�質��";
//		String name2 = new String("�質��");
//		System.out.println(name1 == name2); // ��ü�� ������ �� F
//		System.out.println(name1.equals(name2)); // ���ڿ��� ������ �� T
//		System.out.println(name1 == "�質��"); // ? �o�� �� ��T��
//
//		// ���ڿ� ã��
//		System.out.println("Hello".indexOf("e")); // 1���� H�ϸ� 0���� ���°��ϸ� -1 ����
//		// el ã���� �տ����� 1���� l ã���� �տ��� 2������!!
//		int idx = "Hello how are you".indexOf("o"); // 4����
//		System.out.println(idx);
//		idx = "Hello how are you".indexOf("o", idx + 1); // ó��ã���ź��� ��������~
//		System.out.println(idx);
//		idx = "Hello how are you".indexOf("o", idx + 1);
//		System.out.println(idx);
//
//		System.out.println("fil.e1.txt".lastIndexOf(".")); // ������.�� ã�� => 6����
//
//		String filename = "file1.txt";
//		idx = filename.lastIndexOf(".");
//		System.out.println(filename.substring(idx + 1)); // idx+1 ��¥���� Ȯ���ڸ�
//															// ����������
//
//		String path = "C:\\Users\\KNJ\\nj\\lotto.txt";
//		idx = path.lastIndexOf("\\");
//		System.out.println(path.substring(idx + 1)); // ���ϸ�߰��ض�!!
//
//		// ���ڿ���ȯ : ����->���ڿ�
//		// "23"�� 23 ����!!!!
//		int kor = Integer.parseInt("23"); // "23"�� ���� 23���ιٲ��
//		System.out.println(kor + 2); // 25����
//
//		// String s = String.valueOf(kor);
//		String s = "" + kor;
//		System.out.println(s + "2"); // "2"�Ƚᵵ 2 �ص� 2�����ڿ��ιٲ�
//
//		// "Hello". //-> new char[]{'H','e','l','l','o',0}

		FileOutputStream fos = new FileOutputStream("C:\\Users\\easy\\workspace\\hello.txt");
		PrintStream fout = new PrintStream(fos);

		fout.printf("lotto : %d  %d  %d", 1, 25, 33);

		fout.close();
		fos.close(); // <- ���۾��ִ� ����

		System.out.println("�Է¹޴´�!!"); // ======================================

		FileInputStream fis = new FileInputStream("C:\\Users\\easy\\workspace\\hello.txt");
		Scanner fscan = new Scanner(fis);

		fscan.next();
		fscan.next();

		int n1 = fscan.nextInt();
		int n2 = fscan.nextInt();
		int n3 = fscan.nextInt();
		System.out.printf("n1 : %d , n2 : %d , n3 : %d", n1, n2, n3);

		fscan.close();
		fis.close();
	}

}
