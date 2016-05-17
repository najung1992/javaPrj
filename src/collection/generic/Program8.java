package collection.generic;
import java.util.ArrayList;
import java.util.Scanner;


public class Program8 {

	static GCollection list;
	
	public static void main(String[] args) {
		// ���θ޴���̤�

		//�ʱ�ȭ �ϴ� �۾�!
//		list.exams = new Exam[3];
//		list.current = -1; 
		//�� �ʱ�ȭ������ ExamCollection������ �ű���!
		
		list = new GCollection();
		
		while (true) {
		
			switch (mainMenu()) {
			case 1:
				inputGrade();
				break;
			case 2:
				printGrade();
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

	private static void printGrade() {
		// ����

//		Exam exam = new Exam();

		System.out.println("����������������������������");
		System.out.println("��     ���� ���         ��");
		System.out.println("����������������������������");
		
		for (int i = 0; i <list.size(); i++) {	
			
//			exam =(Exam)list.get(i); 
			//������ �ڷ����� Exam���� �ƴ��� �˾ƾ����ʿ䰡�ִ�!
			Exam exam = null;
			Object obj = list.get(i);
			if(obj instanceof Exam) //Exam�� �ν��Ͻ���? �׷��ٸ�!!
				exam= (Exam)obj;
			
			int math = exam.math;
			int eng = exam.eng;
			int kor = exam.kor;
			
			int total=math +eng + kor;
			float avg = (total / 3.0f);
			
			
			 
			System.out.printf("   ��ȣ : %d\n", i + 1);
			System.out.printf("   ���� : %d\n",kor);
			System.out.printf("   ���� : %d\n", eng);
			System.out.printf("   ���� : %d\n", math);
			System.out.printf("   ���� : %d\n", total);
			System.out.printf("   ��� : %.2f\n", avg);
			System.out.println("����������������������������");
		}
		
	}

	private static void inputGrade() {
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
		
//		list.exams[++list.current] = exam;
//		�̰͵� �ٲټ���~ ??()��!
		list.add(exam);
	
	
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
