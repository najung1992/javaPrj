import java.util.Scanner;

public class OooProgram3 {

	public static void main(String[] args) {
		// �̰� �ϼ��ؿ��°� ����..�Ф�
		// �Է¹޾Ƽ� �ϴ°ŷ�~.~

		Scanner scan = new Scanner(System.in);
		
		int wid = 20;
		int hei = 20;
		// ������ �迭 ����
		char[][] board = new char[hei][wid];

		int[] xs = new int[wid*hei];
		int[] ys = new int[wid*hei];
		int[] types = new int[wid*hei];
		int cnt = 0;

		// ������ �ʱ�ȭ
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
		board[hei - 1][wid - 1] = '��'; // �ФФФФФФФФФ�

		System.out.println("���ܦ�����������������");
		System.out.println("��      �����̲�!         ��  ");
		System.out.println("��          ���� ����     �� ");
		System.out.println("�������������������ܦ�");

		// int menu;
		// System.out.print("���ӽ����� 1�� ��������: ");
		// menu = scan.nextInt();
		String u1, u2;

		System.out.println("1�� ����ڸ� �Է��ϼ���:");
		u1 = scan.nextLine();
		System.out.println("2�� ����ڸ� �Է��ϼ���:");
		u2 = scan.nextLine();
		System.out.printf("\n\n��%s�԰� %s���� ����� �����մϴ�!��\n", u1, u2);

		for (int y = 0; y < hei; y++) {
			for (int x = 0; x < wid; x++)
				System.out.printf("%c", board[y][x]);
			System.out.println();
		}

		while (true) {
			// ����� �Է��� �޴� ����
			int ox;
			int oy;
			//int otype;
			//otype = 1;
			

			System.out.print("���� �α� (x sp y) : ");
			ox = scan.nextInt();
			oy = scan.nextInt();

 			xs[cnt] = ox;
			ys[cnt] = oy;
			types[cnt] = cnt;
			cnt++;

			// ����� �Է¿� ���� ��ġ�� ������ �δ� ����
			for (int i = 0; i < cnt; i++)
				// 0���� 1�̵Ǹ� ���������ιٲ񤱤�2������ 0
				if(types[i]%2==0)
					board[ys[i]-1][xs[i]-1] = '��';  //1.1�Է¹����� 0.0����������
				else
					board[ys[i]-1][xs[i]-1] = '��';

			// ������ ���
			for (int y = 0; y < hei; y++) {
				for (int x = 0; x < wid; x++)
					System.out.printf("%c", board[y][x]);
				System.out.println();
			}
		}
	}

}
