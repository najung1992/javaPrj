import java.util.Scanner;

/*
  	2016�� 2�� 24�� ����»�� �����.
 */
public class Program6 {

	public static void main(String[] args) {
		// ���θ޴���̤�

		Exam[] exams = new Exam[3]; // �̸�ǥ�� ����� -> ����x

		int current = -1;

		out: while (true) {

			switch (mainMenu()) {
			case 1:
				current = inputGrade(exams, current);
				break;
			case 2:
				printGrade(exams, current);
				break;
			case 3:
				if (exit() == 1) {
					System.out.println("�����մϴ�!!");
					break out;
				}
			default:
				System.out.println("�ءءءءشٽð��������ءءءء�");

			}
		}

	}

	private static int exit() {
		// ����
		Scanner scan = new Scanner(System.in);
		System.out.println("��¥���Ŵ�!!??!!");
		System.out.println("����-1, ����-2");
		int yesno = scan.nextInt();
		return yesno;
		// System.exit(0); 

	}

	private static void printGrade(Exam[] exams, int current) {
		// ����

		Exam exam = new Exam();

		System.out.println("����������������������������");
		System.out.println("��     ���� ���         ��");
		System.out.println("����������������������������");
		for (int i = 0; i < current + 1; i++) {

			exam = exams[i];

			int math = exam.math;
			int eng = exam.eng;
			int kor = exam.kor;

			int total = math + eng + kor;
			float avg = (total / 3.0f);

			System.out.printf("   ��ȣ : %d\n", i + 1);
			System.out.printf("   ���� : %d\n", kor);
			System.out.printf("   ���� : %d\n", eng);
			System.out.printf("   ���� : %d\n", math);
			System.out.printf("   ���� : %d\n", total);
			System.out.printf("   ��� : %.2f\n", avg);
			System.out.println("����������������������������");
		}

	}

	private static int inputGrade(Exam[] exams, int current) {
		// �Է�
		int math = 0;
		int eng = 0;
		int kor = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("����������������������������");
		System.out.println("��     ���� �Է�         ��");
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

		Exam exam = new Exam();

		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;

		exams[++current] = exam;

		return current;
	}

	private static int mainMenu() {
		// ���θ޴�
		Scanner scan = new Scanner(System.in);
		System.out.println("����������������������������");
		System.out.println("��     ���� �޴�         ��");
		System.out.println("����������������������������");
		System.out.println("   1.���� �Է�");
		System.out.println("   2.���� ���");
		System.out.println("   3.����");
		System.out.print("   ����> ");
		int menu = scan.nextInt();

		return menu;
	}
}
