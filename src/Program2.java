import java.util.Scanner;

/*
  	2016�� 2�� 24�� ����»�� �����.
 */
public class Program2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int math = 0;
		int eng = 0;
		int kor = 0;
		int total;
		float avg;

		/*
		 * math = 10; eng = 77; kor = 98;
		 */
		while (true) {

			System.out.println("������������������������������");
			System.out.println("��              ���� �޴�             ��");
			System.out.println("������������������������������");
			System.out.println("   1.���� �Է�");
			System.out.println("   2.���� ���");
			System.out.println("   3.����");
			System.out.print("   ����> ");
			int menu = scan.nextInt();

			switch (menu) {
			case 1: {
				System.out.println("����������������������������");
				System.out.println("��           ���� �Է�             ��");
				System.out.println("����������������������������");
				System.out.print("   ����:");
				kor = scan.nextInt();
					while (kor > 100 || kor < 0) {
						System.out.println("����� �Է��ϼ���(0~100)");
						System.out.print("   ����:");
						kor = scan.nextInt();
					}
				System.out.print("   ����:");
				eng = scan.nextInt();
					while (eng > 100 || eng < 0) {
						System.out.println("����� �Է��ϼ���(0~100)");
						System.out.print("   ����:");
						eng = scan.nextInt();
					}
				System.out.print("   ����:");
				math = scan.nextInt();
					while (math > 100 || math < 0) {
						System.out.println("����� �Է��ϼ���(0~100)");
						System.out.print("   ����:");
						math = scan.nextInt();
					}
			}
				break;
			case 2: {
				total = math + eng + kor;
				avg = total / 3.0f; // �Ǽ���� �������� f��

				System.out.println("����������������������������");
				System.out.println("��           ���� ���             ��");
				System.out.println("����������������������������");
				for (int i = 0; i < 3; i++) {
					System.out.printf("   ��ȣ : %d\n", i + 1);
					System.out.printf("   ���� : %d\n", kor);
					System.out.printf("   ���� : %d\n", eng);
					System.out.printf("   ���� : %d\n", math);
					System.out.printf("   ���� : %d\n", total);
					System.out.printf("   ��� : %.2f\n", avg);
					System.out.println("����������������������������������������");
				}
			}
				break;

			case 3: {

				System.out.println("�����մϴ�!!");
				// System.exit(0);
				break;
			}

			default:
				System.out.println("�ءءءءشٽð��������ءءءء�");

			}
		}
	}
}
