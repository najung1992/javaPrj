import java.util.Scanner;

/*
  	2016년 2월 24일 나정쨩이 만들다.
 */
public class Program5 {

	public static void main(String[] args) {
		// 메인메뉴우ㅜㅜ

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
				System.out.println("※※※※※다시고르세염ㅋ※※※※※");

			}
		}

	}

	private static void exit() {
		// 종료
		System.out.println("종료합니다!!");
		System.exit(0);

	}

	private static void printGrade(Exam exam) {
		// 츌력

		int total = exam.math + exam.eng + exam.kor;
		float avg = (total / 3.0f); // 실수결과 얻으려고 f씀

		System.out.println("┌────────────┐");
		System.out.println("│           성적 출력             │");
		System.out.println("└────────────┘");
		for (int i = 0; i < 3; i++) {
			System.out.printf("   번호 : %d\n", i + 1);
			System.out.printf("   국어 : %d\n", exam.kor);
			System.out.printf("   영어 : %d\n", exam.eng);
			System.out.printf("   수학 : %d\n", exam.math);
			System.out.printf("   총점 : %d\n", total);
			System.out.printf("   평균 : %.2f\n", avg);
			System.out.println("────────────────────");
		}

	}

	private static void inputGrade(Exam exam) {
		// 입력
		int math = 0;
		int eng = 0;
		int kor = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("┌────────────┐");
		System.out.println("│           성적 입력             │");
		System.out.println("└────────────┘");
		System.out.print("   국어:");
		exam.kor = scan.nextInt();

		while (kor > 100 || kor < 0) {
			System.out.println("제대로 입력하세욤(0~100)");
			System.out.print("   국어:");
			kor = scan.nextInt();
		}
		System.out.print("   영어:");
		exam.eng = scan.nextInt();

		while (eng > 100 || eng < 0) {
			System.out.println("제대로 입력하세욤(0~100)");
			System.out.print("   영어:");
			eng = scan.nextInt();
		}
		System.out.print("   수학:");
		exam.math = scan.nextInt();

		while (math > 100 || math < 0) {
			System.out.println("제대로 입력하세욤(0~100)");
			System.out.print("   수학:");
			math = scan.nextInt();

		}

	}

	private static int mainMenu() {
		// 메인메뉴
		Scanner scan = new Scanner(System.in);
		System.out.println("┌─────────────┐");
		System.out.println("│              메인 메뉴             │");
		System.out.println("└─────────────┘");
		System.out.println("   1.성적 입력");
		System.out.println("   2.성적 출력");
		System.out.println("   3.종료");
		System.out.print("   선택> ");
		int menu = scan.nextInt();

		return menu;
	}
}
