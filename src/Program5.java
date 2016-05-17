import java.util.Scanner;

/*
  	2016�� 2�� 24�� ����»�� �����.
 */
public class Program5 {

	public static void main(String[] args) {
		// ���θ޴���̤�

		Exam exam= new Exam();

		while (true) {

			switch (mainMenu()) {
			case 1:
				inputGrade(exam);
				break;
			case 2:
				printGrade(exam);
				break;
			case 3:
				exit();
				break;

			default:
				System.out.println("�ءءءءشٽð��������ءءءء�");

			}
		}

	}

	private static void exit() {
		// ����
		System.out.println("�����մϴ�!!");
		System.exit(0);

	}

	private static void printGrade(Exam exam) {
		// ����

		int total = exam.math + exam.eng + exam.kor;
		float avg = (total / 3.0f); // �Ǽ���� �������� f��

		System.out.println("����������������������������");
		System.out.println("��           ���� ���             ��");
		System.out.println("����������������������������");
		for (int i = 0; i < 3; i++) {
			System.out.printf("   ��ȣ : %d\n", i + 1);
			System.out.printf("   ���� : %d\n", exam.kor);
			System.out.printf("   ���� : %d\n", exam.eng);
			System.out.printf("   ���� : %d\n", exam.math);
			System.out.printf("   ���� : %d\n", total);
			System.out.printf("   ��� : %.2f\n", avg);
			System.out.println("����������������������������������������");
		}

	}

	private static void inputGrade(Exam exam) {
		// �Է�
		int math = 0;
		int eng = 0;
		int kor = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("����������������������������");
		System.out.println("��           ���� �Է�             ��");
		System.out.println("����������������������������");
		System.out.print("   ����:");
		exam.kor = scan.nextInt();

		while (kor > 100 || kor < 0) {
			System.out.println("����� �Է��ϼ���(0~100)");
			System.out.print("   ����:");
			kor = scan.nextInt();
		}
		System.out.print("   ����:");
		exam.eng = scan.nextInt();

		while (eng > 100 || eng < 0) {
			System.out.println("����� �Է��ϼ���(0~100)");
			System.out.print("   ����:");
			eng = scan.nextInt();
		}
		System.out.print("   ����:");
		exam.math = scan.nextInt();

		while (math > 100 || math < 0) {
			System.out.println("����� �Է��ϼ���(0~100)");
			System.out.print("   ����:");
			math = scan.nextInt();

		}

	}

	private static int mainMenu() {
		// ���θ޴�
		Scanner scan = new Scanner(System.in);
		System.out.println("������������������������������");
		System.out.println("��              ���� �޴�             ��");
		System.out.println("������������������������������");
		System.out.println("   1.���� �Է�");
		System.out.println("   2.���� ���");
		System.out.println("   3.����");
		System.out.print("   ����> ");
		int menu = scan.nextInt();

		return menu;
	}
}
