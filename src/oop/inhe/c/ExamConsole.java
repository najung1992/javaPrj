package oop.inhe.c;

import java.util.Scanner;

public abstract class ExamConsole {

	private Exam exam;

	public ExamConsole(Exam exam) {
		this.exam = exam;
	}
	public void setExam(Exam exam) {
		this.exam = exam;
	}
	public Exam getExam() {
		return exam;
	}


	public ExamConsole() {

	}


	public void inputGrade() {
		// �Է�
		int math = 0;
		int eng = 0;
		int kor = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("����������������������������");
		System.out.println("��       ���� �Է�      ��");
		System.out.println("����������������������������");
		System.out.print(" ����:");
		kor = scan.nextInt();

		while (kor > 100 || kor < 0) {
			System.out.println("����� �Է��ϼ���(0~100)");
			System.out.print(" ����:");
			kor = scan.nextInt();
		}
		System.out.print(" ����:");
		eng = scan.nextInt();

		while (eng > 100 || eng < 0) {
			System.out.println("����� �Է��ϼ���(0~100)");
			System.out.print(" ����:");
			eng = scan.nextInt();
		}
		System.out.print(" ����:");
		math = scan.nextInt();

		while (math > 100 || math < 0) {
			System.out.println("����� �Է��ϼ���(0~100)");
			System.out.print(" ����:");
			math = scan.nextInt();

		}

		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);
	}

	public void print() {
		// ����
		int kor = exam.getKor();
		int eng = exam.getEng();
		int math = exam.getMath();
		int total = exam.total();
		float avg = exam.avg();
		// total = math + eng + kor;
		// avg = (total / 3.0f); // �Ǽ���� �������� f��

		System.out.println("����������������������������");
		System.out.println("��      ���� ���        ��");
		System.out.println("����������������������������");
		// for (int i = 0; i < 3; i++) {
		System.out.printf("   ��ȣ : %d\n", 1);
		System.out.printf("   ���� : %d\n", kor);
		System.out.printf("   ���� : %d\n", eng);
		System.out.printf("   ���� : %d\n", math);
		onPrint(); //�߰���~�֤��ö�~
		System.out.printf("   ���� : %d\n", total);
		System.out.printf("   ��� : %.2f\n", avg);
		System.out.println("����������������������������������������");
		// }

	}

	protected abstract void onPrint();
		//��ӹ��� �ڽ��� �����ְ� protected ��
		//�� �Լ��� �������ؼ� ���ϴ� ������ ���Խ��Ѷ󤿤�~
		//�������ϴ� ��? abstract �Ἥ �� ������ �ϵ��� �����
	// ��� ������ ���������! �׸��� �� Ŭ������ abstract �ؾ���

}
