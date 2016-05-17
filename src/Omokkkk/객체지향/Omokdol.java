package Omokkkk.��ü����;

import java.util.Scanner;

public class Omokdol { 

	int[] xs;
	int[] ys;
	int[] types;
	int cnt;
	int ox;
	int oy;
	String u1, u2;
	private Omokpan omokp = new Omokpan();

	public Omokdol() {
		// �������ӵ�~
		cnt = 0;
		xs = new int[omokp.wid * omokp.hei];
		ys = new int[omokp.wid * omokp.hei];
		types = new int[omokp.wid * omokp.hei];

	}

	public int playOmok() {
		// �ߺ��˻絵 ��ġ�µ�..�Լ��θ������� �ϴܳ��O��
		Scanner scan = new Scanner(System.in);
		char[][] board = omokp.board;
		int wid = omokp.wid;
		int hei = omokp.hei;
		omokp.drawOmok();
		
		System.out.println("���ܦ�����������������");
		System.out.println("��      �����̲�!         ��  ");
		System.out.println("��          ���� ����     �� ");
		System.out.println("�������������������ܦ�");
		// ����� �Է� �ޱ�
		System.out.println("ù��° ����ڸ� �Է��ϼ���:");
		u1 = scan.nextLine();
		System.out.println("�ι�° ����ڸ� �Է��ϼ���:");
		u2 = scan.nextLine();
	
		System.out.printf("\n\n��%s�԰� %s���� ����� �����մϴ�!��\n", u1, u2);
		omokp.printOmok();
		outt: while (true) {
			for (int i = 0; i < wid * hei; i++) {

				int cnt = this.cnt;
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
				omokp.printOmok();

				cnt = resultOmok();

				if (cnt == -1) {

					break outt;
				}
			} // for���ݤ�
		} // while����
		return -1;
	} // play �Լ�����

	public int resultOmok() {
		// ���а˻�
		String u1 = this.u1;
		String u2 = this.u2;
		char[][] board = omokp.board;

		int wid = omokp.wid;
		int hei = omokp.hei;
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

}
