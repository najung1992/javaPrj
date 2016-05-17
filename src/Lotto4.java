import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Lotto4 {

	// ���� ����»�� �ζǹ�ȣ
	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		// �÷����ϱ����� ������� �Բ� ����� ���� ����;?
		int[][] lottos = new int[10][6];
		int current = -1;

		outtt: while (true) {

			System.out.println("\n��¥�� Lotto����\n ");
			System.out.println("  1. ��ȣ ���");
			System.out.println("  2. ��ȣ �б�");
			System.out.println("  3. ��ȣ ����");
			System.out.println("  4. ����");
			System.out.print("   ����> ");
			int menu = scan.nextInt();

			switch (menu) {
			case 1: {
				outt: while (true) {
					System.out.println("�ڷζ�~~~~���~~��������");
					// ��� ��� �ڵ� �ۼ�

					System.out.println("--------------------------------");
					for (int i = 0; i < current + 1; i++) { // ��ȣ����Ȱ� ������ ��� ����
						int[] lotto = lottos[i];
						System.out.printf("%d�� : %d %d %d %d %d %d\n", i + 1, lotto[0], lotto[1], lotto[2], lotto[3],
								lotto[4], lotto[5]);
					}
					System.out.println("--------------------------------");

					System.out.println("  1. ��ȣ ����");
					System.out.println("  2. ��ȣ �Է�");
					System.out.println("  3. �����޴�");
					System.out.print("   ����> ");
					int menu2 = scan.nextInt();

					switch (menu2) {
					case 1: { // �ڵ��Է�
						Random rand = new Random();
						int[] lotto = new int[6];

						// �ߺ��˻�!!!
						out: while (true) {

							for (int i = 0; i < 6; i++)
								lotto[i] = rand.nextInt(45) + 1;

							for (int i = 0; i < 6; i++) {
								for (int j = i + 1; j < 6; j++) {
									if (lotto[i] == lotto[j])
										continue out;
								}

								// �����ϱ�
								int nj;

								for (int k = 0; k < 5; k++) {
									for (int j = 0; j < 5 - k; j++) {
										if (lotto[j] > lotto[j + 1]) {
											nj = lotto[j];
											lotto[j] = lotto[j + 1];
											lotto[j + 1] = nj;
										}
									}
								}

							}
							// lotto�� �մ°� lottos�� �Űܾߴ�
							++current;
							for (int i = 0; i < 6; i++) {
								lottos[current][i] = lotto[i];

							}
							break; // outwhile �����°�
						} // out while
						break;
					} // switch2 case1
					case 2: // �����Է�
						int[] a = new int[6];
						System.out.print("6�� �Ѳ����� �Է��ϼ��� sp:");
						for (int i = 0; i < 6; i++) {
							a[i] = scan.nextInt();
						}
						++current;
						for (int j = 0; j < 6; j++)
							lottos[current][j] = a[j];

						break;
					case 3: // switch 2���� 1�� �����޴����°�
						break outt;
					} // switch2
				}
			break;
			} // switch1 case1
			case 2: // ���� �Է�!!

				FileInputStream fis = new FileInputStream("res/lotto/lottos.txt");

				current = -1;
				int cnt = fis.read();

				for (int n = 0; n < cnt; n++) {
					int[] lotto = lottos[n]; 

					for (int i = 0; i < 6; i++)
						lotto[i] = fis.read();

					current++; // �̰ſ���
				}

				fis.close();

				System.out.println("������ �о�Ծ��~");
				break;

			case 3: // ��������
				// ���ڷ�����
				FileOutputStream fos = new FileOutputStream("res/lotto/lottos.txt");

				fos.write(current + 1);

				for (int n = 0; n < current + 1; n++) {
					int[] lotto = lottos[n];

					for (int i = 0; i < 6; i++)
						fos.write(lotto[i]);
				}
				fos.close();

				// ���ڷ�����
				// FileOutputStream fos = new
				// FileOutputStream("res/lotto/lottos.txt");
				// PrintStream fout = new PrintStream(fos);
				//
				// for (int i = 0; i < current + 1; i++) {
				// int[] lotto = lottos[i]; //\r ���ָ� ���Ͽ��� ������ ������
				// fout.printf("%d�� : %d %d %d %d %d %d\r\n", i + 1, lotto[0],
				// lotto[1], lotto[2], lotto[3],
				// lotto[4], lotto[5]);
				// }
				//
				// fout.close();
				// fos.close();
				System.out.println("\n�����ߤ���~~");
				break;

			case 4:
				break outtt;

			} // switch
		} // while
	} // 2
//����ٰ� �Լ�
} // 1
