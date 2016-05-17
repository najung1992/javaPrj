import java.util.Scanner;

/*
  	2016년 2월 24일 나정쨩이 만들다.
 */
public class Program {

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

			System.out.println("┌ ──────────────────┐");
			System.out.println("│           메인 메뉴               │");
			System.out.println("└────────────────── ┘");
			System.out.println("   1.성적 입력");
			System.out.println("   2.성적 출력");
			System.out.println("   3.종료");
			System.out.print("   선택> ");
			int menu = scan.nextInt();

			if (menu == 1) {
				System.out.println("┌ ──────────────────┐");
				System.out.println("│           성적 입력               │");
				System.out.println("└────────────────── ┘");
				System.out.print("   국어:");
				kor = scan.nextInt();
				System.out.print("   영어:");
				eng = scan.nextInt();
				System.out.print("   수학:");
				math = scan.nextInt();
			}

			else if (menu == 2) {
				total = math + eng + kor;
				avg = total / 3.0f; // 실수결과 얻으려고 f씀

				System.out.println("┌────────────────── ┐");
				System.out.println("│           성적 출력               │");
				System.out.println("└ ──────────────────┘");
				for (int i = 0; i < 3; i++) {
					System.out.printf("   번호 : %d\n", i + 1);
					System.out.printf("   국어 : %d\n", kor);
					System.out.printf("   영어 : %d\n", eng);
					System.out.printf("   수학 : %d\n", math);
					System.out.printf("   총점 : %d\n", total);
					System.out.printf("   평균 : %.2f\n", avg);
					System.out.println("────────────────────");
				}
			}

			else if (menu == 3) {
				System.out.println("종료합니다!!");
				// System.exit(0);
				break;
			}

			else {
				System.out.println("※※※※※다시고르세염ㅋ※※※※※");
			}
		}
	}
}
