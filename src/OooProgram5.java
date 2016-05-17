import java.util.Scanner;

public class OooProgram5 {
	// ����ȭ�ؼ� ����
	// play �Լ��ȿ� ���а˻��Լ� ����!! 
	public static void main(String[] args) {
		// �����ǹ迭����
		Scanner scan = new Scanner(System.in);
		Omok omok = new Omok();
		


		// ������ �׸��� ( �ʱ�ȭ,�׵θ� )
		drawOmok(omok); 
		// ���ӽ��� , ������Է� (�������ѹ����Ҳ���)

		System.out.println("���ܦ�����������������");
		System.out.println("��      �����̲�!         ��  ");
		System.out.println("��          ���� ����     �� ");
		System.out.println("�������������������ܦ�");

		// ����� �Է� �ޱ�

		System.out.println("ù��° ����ڸ� �Է��ϼ���:");
		omok.u1 = scan.nextLine();
		System.out.println("�ι�° ����ڸ� �Է��ϼ���:");
		omok.u2 = scan.nextLine();
		System.out.printf("\n\n��%s�԰� %s���� ����� �����մϴ�!��\n", omok.u1, omok.u2);
		out: while (true) {

			printOmok(omok);
			// ������Է¿� ���� ��ġ�� ���� �α� ( �ߺ��˻�����)
			if (playOmok(omok) == -1)		{
				System.out.println("�ڰ��ӳ�!!!��");
				break out;
			}
		}
	}

	private static int resultOmok(Omok omok) {
		// ���а˻�

		int cnt = omok.cnt;
		int ox = omok.ox;
		int oy = omok.oy;
		String u1 = omok.u1;
		String u2 = omok.u2;
		char[][] board = omok.board;
		int[] xs = omok.xs;
		int[] ys = omok.ys;
		int wid = omok.wid;
		int hei = omok.hei;
		int winCnt1 = 0;
		int winCnt2 = 0;
		
		out: while (true) {
			// ���� ���� (�� ��)
			for (int cnt1 = 0; cnt1 < cnt; cnt1++) {
				for (int j = 1; j < 5; j++) {
					if (xs[cnt1] - 1 + j > wid - 1) // �־��� ������ �ʰ��ϸ� �ȵ�
						continue;
					// ��
					if (board[ys[cnt1] - 1][xs[cnt1] - 1] == '��' && board[ys[cnt1] - 1][xs[cnt1] - 1 + j] == '��') {
						winCnt1++;
					} else {
						winCnt1 = 0;
					}
					if (winCnt1 == 4) {
						System.out.println(u1 + "���� �¸��ϼ̽��ϴ�!");
						break out;
					}
					// ������
					if (board[ys[cnt1] - 1][xs[cnt1] - 1] == '��' && board[ys[cnt1] - 1][xs[cnt1] - 1 + j] == '��') {
						winCnt2++;
					} else {
						winCnt2 = 0;
					}
					if (winCnt2 == 4) {
						System.out.println(u2 + "���� �¸��ϼ̽��ϴ�!");
						break out;
					}
				}
			}

			winCnt1 = 0;
			winCnt2 = 0;

			// ���� ���� (���)
			for (int cnt1 = 0; cnt1 < cnt; cnt1++) {
				for (int j = 1; j < 5; j++) {
					if (ys[cnt1] - 1 + j > hei - 1) // �־��� ������ �ʰ��ϸ� �ȵ�
						continue;
					// ��
					if (board[ys[cnt1] - 1][xs[cnt1] - 1] == '��' && board[ys[cnt1] - 1 + j][xs[cnt1] - 1] == '��') {
						winCnt1++;
					} else {
						winCnt1 = 0;
					}
					if (winCnt1 == 4) {
						System.out.println(u1 + "���� �¸��ϼ̽��ϴ�!");
						break out;
					}
					// ������
					if (board[ys[cnt1] - 1][xs[cnt1] - 1] == '��' && board[ys[cnt1] - 1 + j][xs[cnt1] - 1] == '��') {
						winCnt2++;
					} else {
						winCnt2 = 0;
					}
					if (winCnt2 == 4) {
						System.out.println(u2 + "���� �¸��ϼ̽��ϴ�!");
						break out;
					}
				}
			}
			winCnt1 = 0;
			winCnt2 = 0;
			// �밢�� 1���� (��)
			for (int cnt1 = 0; cnt1 < cnt; cnt1++) {
				for (int j = 1; j < 5; j++) {
					if (xs[cnt1] - 1 + j > wid - 1 || ys[cnt1] - 1 - j < 0) // �־���
																			// ������
																			// �ʰ��ϸ�
																			// �ȵ�
						continue;
					// ��
					if (board[ys[cnt1] - 1][xs[cnt1] - 1] == '��' && board[ys[cnt1] - 1 - j][xs[cnt1] - 1 + j] == '��') {
						winCnt1++;
					} else {
						winCnt1 = 0;
					}
					if (winCnt1 == 4) {
						System.out.println(u1 + "���� �¸��ϼ̽��ϴ�!");
						break out;
					}
					// ������
					if (board[ys[cnt1] - 1][xs[cnt1] - 1] == '��' && board[ys[cnt1] - 1 - j][xs[cnt1] - 1 + j] == '��') {
						winCnt2++;
					} else {
						winCnt2 = 0;
					}
					if (winCnt2 == 4) {
						System.out.println(u2 + "���� �¸��ϼ̽��ϴ�!");
						break out;
					}
				}
			}
			winCnt1 = 0;
			winCnt2 = 0;
			// �밢�� 2���� (��)
			for (int cnt1 = 0; cnt1 < cnt; cnt1++) {
				for (int j = 1; j < 5; j++) {
					if (xs[cnt1] - 1 + j > wid - 1 || ys[cnt1] - 1 + j > hei - 1) // �־���
																					// ������
																					// �ʰ��ϸ�
																					// �ȵ�
						continue;
					// ��
					if (board[ys[cnt1] - 1][xs[cnt1] - 1] == '��' && board[ys[cnt1] - 1 + j][xs[cnt1] - 1 + j] == '��') {
						winCnt1++;
					} else {
						winCnt1 = 0;
					}
					if (winCnt1 == 4) {
						System.out.println(u1 + "���� �¸��ϼ̽��ϴ�!");
						break out;
					}
					// ������
					if (board[ys[cnt1] - 1][xs[cnt1] - 1] == '��' && board[ys[cnt1] - 1 + j][xs[cnt1] - 1 + j] == '��') {
						winCnt2++;
					} else {
						winCnt2 = 0;
					}
					if (winCnt2 == 4) {
						System.out.println(u2 + "���� �¸��ϼ̽��ϴ�!");
						break out;
					}
				}
			}

			winCnt1 = 0;
			winCnt2 = 0;
			// �밢�� 3���� (��)
			for (int cnt1 = 0; cnt1 < cnt; cnt1++) {
				for (int j = 1; j < 5; j++) {
					if (xs[cnt1] - 1 - j < 0 || ys[cnt1] - 1 + j > hei - 1) // �־���
																			// ������
																			// �ʰ��ϸ�
																			// �ȵ�
						continue;
					// ��
					if (board[ys[cnt1] - 1][xs[cnt1] - 1] == '��' && board[ys[cnt1] - 1 + j][xs[cnt1] - 1 - j] == '��') {
						winCnt1++;
					} else {
						winCnt1 = 0;
					}
					if (winCnt1 == 4) {
						System.out.println(u1 + "���� �¸��ϼ̽��ϴ�!");
						break out;
					}
					// ������
					if (board[ys[cnt1] - 1][xs[cnt1] - 1] == '��' && board[ys[cnt1] - 1 + j][xs[cnt1] - 1 - j] == '��') {
						winCnt2++;
					} else {
						winCnt2 = 0;
					}
					if (winCnt2 == 4) {
						System.out.println(u2 + "���� �¸��ϼ̽��ϴ�!");
						break out;
					}
				}
			}

			winCnt1 = 0;
			winCnt2 = 0;
			// �밢�� 4���� (��)
			for (int cnt1 = 0; cnt1 < cnt; cnt1++) {
				for (int j = 1; j < 5; j++) {
					if (xs[cnt1] - 1 - j < 0 || ys[cnt1] - 1 - j < 0) // �־���
																		// ������
																		// �ʰ��ϸ�
																		// �ȵ�
						continue;
					// ��
					if (board[ys[cnt1] - 1][xs[cnt1] - 1] == '��' && board[ys[cnt1] - 1 - j][xs[cnt1] - 1 - j] == '��') {
						winCnt1++;
					} else {
						winCnt1 = 0;
					}
					if (winCnt1 == 4) {
						System.out.println(u1 + "���� �¸��ϼ̽��ϴ�!");
						break out;
					}
					// ������
					if (board[ys[cnt1] - 1][xs[cnt1] - 1] == '��' && board[ys[cnt1] - 1 - j][xs[cnt1] - 1 - j] == '��') {
						winCnt2++;
					} else {
						winCnt2 = 0;
					}
					if (winCnt2 == 4) {
						System.out.println(u2 + "���� �¸��ϼ̽��ϴ�!");
						break out;
					}
				}
			}
			// ���� ȭ�鿡 �� ä��������
			if (cnt == hei * wid - 1) {
				System.out.println("���º��Դϴ�!");
				break out;
			}
			
			cnt++;
			return cnt; 
		}

		return -1;
	}

	private static void printOmok(Omok omok) {
		// ������ ���
		for (int y = 0; y < omok.hei; y++) {
			for (int x = 0; x < omok.wid; x++)
				System.out.printf("%c", omok.board[y][x]);
			System.out.println();
		}
	}

	private static int playOmok(Omok omok) {
		// �ߺ��˻絵 ��ġ�µ�..�Լ��θ������� �ϴܳ��O��
		Scanner scan = new Scanner(System.in);
		int[] types = omok.types;
		int ox = omok.ox;
		int oy = omok.oy;
		String u1 = omok.u1;
		String u2 = omok.u2;
		char[][] board = omok.board;
		int[] xs = omok.xs;
		int[] ys = omok.ys;
		int wid = omok.wid;
		int hei = omok.hei;
		outt: while (true) {
			for (int i = 0; i < wid * hei; i++) {
				
				int cnt = omok.cnt;
				types[cnt] = cnt;

				if (types[i] % 2 == 0) {

					System.out.print(u1 + "�� ���� �α� (x sp y) : ");
					ox = scan.nextInt();
					oy = scan.nextInt();

					// wid*hei ���� ū ���� �Է��Ҷ� ����ϴ� �޼���
					if (ox > wid || oy > hei) {
						System.out.printf("(%d , %d) ���� ���� ���� �Է��ϼ���\n", wid, hei);
						i--;
						continue;
					}

					// �ߺ� �˻�
					if (board[oy - 1][ox - 1] == '��' || board[oy - 1][ox - 1] == '��') {
						System.out.println("������ �ڸ��� �̹� ���� �ֽ��ϴ�.");
						i--;
						continue;
					}
					xs[cnt] = ox;
					ys[cnt] = oy;
					board[ys[i] - 1][xs[i] - 1] = '��';

				} else {
					System.out.print(u2 + "�� ���� �α� (x sp y) : ");
					ox = scan.nextInt();
					oy = scan.nextInt();

					// wid*hei ���� ū ���� �Է��Ҷ� ����ϴ� �޼���
					if (ox > wid || oy > hei) {
						System.out.printf("(%d , %d) ���� ���� ���� �Է��ϼ���\n", wid, hei);
						i--;
						continue;
					}

					// �ߺ� �˻�
					if (board[oy - 1][ox - 1] == '��' || board[oy - 1][ox - 1] == '��') {
						System.out.println("������ �ڸ��� �̹� ���� �ֽ��ϴ�.");
						i--;
						continue;
					}
					xs[cnt] = ox;
					ys[cnt] = oy;
					board[ys[i] - 1][xs[i] - 1] = '��';

				}
				printOmok(omok);

				omok.cnt=resultOmok(omok);
			
				if (omok.cnt == -1){

					break outt;
				}
			} //for���ݤ�
		}//while����
		return -1;
	} // play �Լ�����

	private static void drawOmok(Omok omok) {

		char[][] board = omok.board;
		int wid = omok.wid;
		int hei = omok.hei;

		for (int y = 0; y < hei; y++) {
			for (int x = 0; x < wid; x++)
				board[y][x] = '��';
		}

		// �׵θ� �׸���
		for (int i = 0; i < wid; i++)
			board[0][i] = '��';

		for (int i = 0; i < wid; i++)
			board[hei - 1][i] = '��';

		for (int i = 0; i < hei; i++)
			board[i][0] = '��';

		for (int i = 0; i < hei; i++)
			board[i][wid - 1] = '��';

		board[0][0] = '��';
		board[0][wid - 1] = '��';
		board[hei - 1][0] = '��';
		board[hei - 1][wid - 1] = '��';

	}
}
