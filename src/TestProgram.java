import java.util.Scanner;

public class TestProgram {

	public static void main(String[] args) {
		// �������ϴ����α׷�

		int sum = 0;
		int list, menu;
		int a1 = 0;
		int an = 0;

		Scanner scan = new Scanner(System.in);
		out: while (true) {

			System.out.println("����������������������������������������");
			System.out.println("��     ���� ���ϴ� ���α׷�!    ��");
			System.out.println("����������������������������������������");
			System.out.println("   1.�� �Է�");
			System.out.println("   2.��� ����");
			System.out.println("   3.����");
			System.out.println("   4.����\n");
			System.out.print("   ����> ");

			menu = scan.nextInt();

			outt: while (true) {
				if (menu == 1) {
					System.out.println("�� ��������������������������������������");
					System.out.println("��              �� �Է�               ��");
					System.out.println("�������������������������������������� ��");
					System.out.print("���۰��� ������ ���ʷ� �Է���3:");
					a1 = scan.nextInt();
					an = scan.nextInt();

					System.out.println("\n���� �޴��� �̵��� 1, ���Է��� 2�� ������:");
					list = scan.nextInt();
					while (true) {

						if (list == 1)
							continue out;
						else if (list == 2)
							continue outt;
						else {

							System.out.println("\n�ءء�1�̶� 2�� ������ءء�");
							System.out.println("\n���� �޴��� �̵��� 1, ���Է��� 2�� ������:");
							list = scan.nextInt();
						}
					}
				} else if (menu == 2) {
					if (a1 <= an) {
						for (int i = a1; i <= an; i++) {
							sum += i;
						}
					} else {
						for (int i = an; i <= a1; i++) {
							sum += i;
						}
							//sum=(an-a1+1)*(a1+an)/2;
					}
					System.out.println("�� ��������������������������������������");
					System.out.println("��           ��� ����               ��");
					System.out.println("�������������������������������������� ��");
					System.out.println(a1 + "����" + an + "������ ����" + sum + "�Ӵ�");

					outtt: while (true) {

						System.out.print("\n���� �޴��� �̵��� 1�� ������:");

						list = scan.nextInt();
						if (list == 1)
							continue out;
						else {
							System.out.println("\n�ءء�1�� ������ءء�");
							continue outtt;
						}
					}
				}
			}

		}

	}
}
