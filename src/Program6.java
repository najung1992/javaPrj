import java.util.Scanner;

/*
  	2016년 2월 24일 나정쨩이 만들다.
 */
public class Program6 {

	public static void main(String[] args) {
		// 메인메뉴우ㅜㅜ

		Exam[] exams = new Exam[3]; // 이름표만 만든거 -> 공간x

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
					System.out.println("종료합니다!!");
					break out;
				}
			default:
				System.out.println("※※※※※다시고르세염ㅋ※※※※※");

			}
		}

	}

	private static int exit() {
		// 종료
		Scanner scan = new Scanner(System.in);
		System.out.println("진짜끌거니!!??!!");
		System.out.println("ㅇㅇ-1, ㄴㄴ-2");
		int yesno = scan.nextInt();
		return yesno;
		// System.exit(0); 

	}

	private static void printGrade(Exam[] exams, int current) {
		// 츌력

		Exam exam = new Exam();

		System.out.println("┌────────────┐");
		System.out.println("│     성적 출력         │");
		System.out.println("└────────────┘");
		for (int i = 0; i < current + 1; i++) {

			exam = exams[i];

			int math = exam.math;
			int eng = exam.eng;
			int kor = exam.kor;

			int total = math + eng + kor;
			float avg = (total / 3.0f);

			System.out.printf("   번호 : %d\n", i + 1);
			System.out.printf("   국어 : %d\n", kor);
			System.out.printf("   영어 : %d\n", eng);
			System.out.printf("   수학 : %d\n", math);
			System.out.printf("   총점 : %d\n", total);
			System.out.printf("   평균 : %.2f\n", avg);
			System.out.println("──────────────");
		}

	}

	private static int inputGrade(Exam[] exams, int current) {
		// 입력
		int math = 0;
		int eng = 0;
		int kor = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("┌────────────┐");
		System.out.println("│     성적 입력         │");
		System.out.println("└────────────┘");
		System.out.print("   국어:");
		kor = scan.nextInt();

		while (kor > 100 || kor < 0) {
			System.out.println("제대로 입력하세욤(0~100)");
			System.out.print("   국어:");
			kor = scan.nextInt();
		}
		System.out.print("   영어:");
		eng = scan.nextInt();

		while (eng > 100 || eng < 0) {
			System.out.println("제대로 입력하세욤(0~100)");
			System.out.print("   영어:");
			eng = scan.nextInt();
		}
		System.out.print("   수학:");
		math = scan.nextInt();

		while (math > 100 || math < 0) {
			System.out.println("제대로 입력하세욤(0~100)");
			System.out.print("   수학:");
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
		// 메인메뉴
		Scanner scan = new Scanner(System.in);
		System.out.println("┌────────────┐");
		System.out.println("│     메인 메뉴         │");
		System.out.println("└────────────┘");
		System.out.println("   1.성적 입력");
		System.out.println("   2.성적 출력");
		System.out.println("   3.종료");
		System.out.print("   선택> ");
		int menu = scan.nextInt();

		return menu;
	}
}
