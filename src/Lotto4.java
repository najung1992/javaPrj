import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Lotto4 {

	// 랄랄 나정쨩의 로또번호
	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		// 컬렉팅하기위한 변수들과 함께 저장소 변수 선언;?
		int[][] lottos = new int[10][6];
		int current = -1;

		outtt: while (true) {

			System.out.println("\n★짜잔 Lotto지★\n ");
			System.out.println("  1. 번호 목록");
			System.out.println("  2. 번호 읽기");
			System.out.println("  3. 번호 저장");
			System.out.println("  4. 종료");
			System.out.print("   선택> ");
			int menu = scan.nextInt();

			switch (menu) {
			case 1: {
				outt: while (true) {
					System.out.println("★로또~~~~목록~~고르세염★");
					// 목록 출력 코드 작성

					System.out.println("--------------------------------");
					for (int i = 0; i < current + 1; i++) { // 번호저장된거 없으면 출력 ㄴㄴ
						int[] lotto = lottos[i];
						System.out.printf("%d번 : %d %d %d %d %d %d\n", i + 1, lotto[0], lotto[1], lotto[2], lotto[3],
								lotto[4], lotto[5]);
					}
					System.out.println("--------------------------------");

					System.out.println("  1. 번호 생성");
					System.out.println("  2. 번호 입력");
					System.out.println("  3. 상위메뉴");
					System.out.print("   선택> ");
					int menu2 = scan.nextInt();

					switch (menu2) {
					case 1: { // 자동입력
						Random rand = new Random();
						int[] lotto = new int[6];

						// 중복검사!!!
						out: while (true) {

							for (int i = 0; i < 6; i++)
								lotto[i] = rand.nextInt(45) + 1;

							for (int i = 0; i < 6; i++) {
								for (int j = i + 1; j < 6; j++) {
									if (lotto[i] == lotto[j])
										continue out;
								}

								// 정렬하기
								int nj;

								for (int k = 0; k < 5; k++) {
									for (int j = 0; j < 5 - k; j++) {
										if (lotto[j] > lotto[j + 1]) {
											nj = lotto[j];
											lotto[j] = lotto[j + 1];
											lotto[j + 1] = nj;
										}
									}
								}

							}
							// lotto에 잇는거 lottos로 옮겨야댐
							++current;
							for (int i = 0; i < 6; i++) {
								lottos[current][i] = lotto[i];

							}
							break; // outwhile 나가는거
						} // out while
						break;
					} // switch2 case1
					case 2: // 수동입력
						int[] a = new int[6];
						System.out.print("6개 한꺼번에 입력하세요 sp:");
						for (int i = 0; i < 6; i++) {
							a[i] = scan.nextInt();
						}
						++current;
						for (int j = 0; j < 6; j++)
							lottos[current][j] = a[j];

						break;
					case 3: // switch 2에서 1로 상위메뉴가는거
						break outt;
					} // switch2
				}
			break;
			} // switch1 case1
			case 2: // 파일 입력!!

				FileInputStream fis = new FileInputStream("res/lotto/lottos.txt");

				current = -1;
				int cnt = fis.read();

				for (int n = 0; n < cnt; n++) {
					int[] lotto = lottos[n]; 

					for (int i = 0; i < 6; i++)
						lotto[i] = fis.read();

					current++; // 이거왜함
				}

				fis.close();

				System.out.println("데이터 읽어왔어욤~");
				break;

			case 3: // 파일저장
				// 숫자로저장
				FileOutputStream fos = new FileOutputStream("res/lotto/lottos.txt");

				fos.write(current + 1);

				for (int n = 0; n < current + 1; n++) {
					int[] lotto = lottos[n];

					for (int i = 0; i < 6; i++)
						fos.write(lotto[i]);
				}
				fos.close();

				// 문자로저장
				// FileOutputStream fos = new
				// FileOutputStream("res/lotto/lottos.txt");
				// PrintStream fout = new PrintStream(fos);
				//
				// for (int i = 0; i < current + 1; i++) {
				// int[] lotto = lottos[i]; //\r 써주면 파일에서 밑으로 내려감
				// fout.printf("%d번 : %d %d %d %d %d %d\r\n", i + 1, lotto[0],
				// lotto[1], lotto[2], lotto[3],
				// lotto[4], lotto[5]);
				// }
				//
				// fout.close();
				// fos.close();
				System.out.println("\n저장했ㄸㅏ~~");
				break;

			case 4:
				break outtt;

			} // switch
		} // while
	} // 2
//여기다가 함수
} // 1
