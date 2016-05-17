import java.util.Scanner;

public class TestProgram {

	public static void main(String[] args) {
		// 합을구하는프로그램

		int sum = 0;
		int list, menu;
		int a1 = 0;
		int an = 0;

		Scanner scan = new Scanner(System.in);
		out: while (true) {

			System.out.println("┌──────────────────┐");
			System.out.println("│     합을 구하는 프로그램!    │");
			System.out.println("└──────────────────┘");
			System.out.println("   1.값 입력");
			System.out.println("   2.결과 보기");
			System.out.println("   3.도움말");
			System.out.println("   4.종료\n");
			System.out.print("   선택> ");

			menu = scan.nextInt();

			outt: while (true) {
				if (menu == 1) {
					System.out.println("┌ ──────────────────┐");
					System.out.println("│              값 입력               │");
					System.out.println("└────────────────── ┘");
					System.out.print("시작값과 끝값을 차례로 입력하3:");
					a1 = scan.nextInt();
					an = scan.nextInt();

					System.out.println("\n상위 메뉴로 이동은 1, 재입력은 2를 누르삼:");
					list = scan.nextInt();
					while (true) {

						if (list == 1)
							continue out;
						else if (list == 2)
							continue outt;
						else {

							System.out.println("\n※※※1이랑 2만 누르삼※※※");
							System.out.println("\n상위 메뉴로 이동은 1, 재입력은 2를 누르삼:");
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
					System.out.println("┌ ──────────────────┐");
					System.out.println("│           결과 보기               │");
					System.out.println("└────────────────── ┘");
					System.out.println(a1 + "부터" + an + "까지의 합은" + sum + "임다");

					outtt: while (true) {

						System.out.print("\n상위 메뉴로 이동은 1을 누르삼:");

						list = scan.nextInt();
						if (list == 1)
							continue out;
						else {
							System.out.println("\n※※※1만 누르삼※※※");
							continue outtt;
						}
					}
				}
			}

		}

	}
}
