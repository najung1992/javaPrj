package Omokkkk.구조화;
import java.util.Scanner;

public class Omok {

	static int wid=10;
	static int hei=10;

	int cnt;
	int ox;
	int oy;

	int[] xs;
	int[] ys;
	int[] types;

	char[][] board;

	String u1, u2;

	public void drawOmok() {

		char[][] board = this.board;
		int wid = this.wid;
		int hei = this.hei;

		for (int y = 0; y < hei; y++) {
			for (int x = 0; x < wid; x++)
				board[y][x] = '┼';
		}

		// 테두리 그리기
		for (int i = 0; i < wid; i++)
			board[0][i] = '┬';

		for (int i = 0; i < wid; i++)
			board[hei - 1][i] = '┴';

		for (int i = 0; i < hei; i++)
			board[i][0] = '├';

		for (int i = 0; i < hei; i++)
			board[i][wid - 1] = '┤';

		board[0][0] = '┌';
		board[0][wid - 1] = '┐';
		board[hei - 1][0] = '└';
		board[hei - 1][wid - 1] = '┘';

	}
	
	public void printOmok() {
		// 오목판 출력
		for (int y = 0; y < hei; y++) {
			for (int x = 0; x <wid; x++)
				System.out.printf("%c", board[y][x]);
			System.out.println();
		}
	}
	
	public int resultOmok() {
		// 승패검사

		int cnt = this.cnt;
		int ox = this.ox;
		int oy = this.oy;
		String u1 = this.u1;
		String u2 = this.u2;
		char[][] board = this.board;
		int[] xs =this.xs;
		int[] ys = this.ys;
		int wid = this.wid;
		int hei = this.hei;
		int winCnt1 = 0;
		int winCnt2 = 0;
		
		out: while (true) {
			// 가로 방향 (← →)
			for (int cnt1 = 0; cnt1 < cnt; cnt1++) {
				for (int j = 1; j < 5; j++) {
					if (xs[cnt1] - 1 + j > wid - 1) // 주어진 범위를 초과하면 안됨
						continue;
					// 흰돌
					if (board[ys[cnt1] - 1][xs[cnt1] - 1] == '○' && board[ys[cnt1] - 1][xs[cnt1] - 1 + j] == '○') {
						winCnt1++;
					} else {
						winCnt1 = 0;
					}
					if (winCnt1 == 4) {
						System.out.println(u1 + "님이 승리하셨습니다!");
						break out;
					}
					// 검은돌
					if (board[ys[cnt1] - 1][xs[cnt1] - 1] == '●' && board[ys[cnt1] - 1][xs[cnt1] - 1 + j] == '●') {
						winCnt2++;
					} else {
						winCnt2 = 0;
					}
					if (winCnt2 == 4) {
						System.out.println(u2 + "님이 승리하셨습니다!");
						break out;
					}
				}
			}

			winCnt1 = 0;
			winCnt2 = 0;

			// 세로 방향 (↑↓)
			for (int cnt1 = 0; cnt1 < cnt; cnt1++) {
				for (int j = 1; j < 5; j++) {
					if (ys[cnt1] - 1 + j > hei - 1) // 주어진 범위를 초과하면 안됨
						continue;
					// 흰돌
					if (board[ys[cnt1] - 1][xs[cnt1] - 1] == '○' && board[ys[cnt1] - 1 + j][xs[cnt1] - 1] == '○') {
						winCnt1++;
					} else {
						winCnt1 = 0;
					}
					if (winCnt1 == 4) {
						System.out.println(u1 + "님이 승리하셨습니다!");
						break out;
					}
					// 검은돌
					if (board[ys[cnt1] - 1][xs[cnt1] - 1] == '●' && board[ys[cnt1] - 1 + j][xs[cnt1] - 1] == '●') {
						winCnt2++;
					} else {
						winCnt2 = 0;
					}
					if (winCnt2 == 4) {
						System.out.println(u2 + "님이 승리하셨습니다!");
						break out;
					}
				}
			}
			winCnt1 = 0;
			winCnt2 = 0;
			// 대각선 1방향 (↗)
			for (int cnt1 = 0; cnt1 < cnt; cnt1++) {
				for (int j = 1; j < 5; j++) {
					if (xs[cnt1] - 1 + j > wid - 1 || ys[cnt1] - 1 - j < 0) // 주어진
																			// 범위를
																			// 초과하면
																			// 안됨
						continue;
					// 흰돌
					if (board[ys[cnt1] - 1][xs[cnt1] - 1] == '○' && board[ys[cnt1] - 1 - j][xs[cnt1] - 1 + j] == '○') {
						winCnt1++;
					} else {
						winCnt1 = 0;
					}
					if (winCnt1 == 4) {
						System.out.println(u1 + "님이 승리하셨습니다!");
						break out;
					}
					// 검은돌
					if (board[ys[cnt1] - 1][xs[cnt1] - 1] == '●' && board[ys[cnt1] - 1 - j][xs[cnt1] - 1 + j] == '●') {
						winCnt2++;
					} else {
						winCnt2 = 0;
					}
					if (winCnt2 == 4) {
						System.out.println(u2 + "님이 승리하셨습니다!");
						break out;
					}
				}
			}
			winCnt1 = 0;
			winCnt2 = 0;
			// 대각선 2방향 (↘)
			for (int cnt1 = 0; cnt1 < cnt; cnt1++) {
				for (int j = 1; j < 5; j++) {
					if (xs[cnt1] - 1 + j > wid - 1 || ys[cnt1] - 1 + j > hei - 1) // 주어진
																					// 범위를
																					// 초과하면
																					// 안됨
						continue;
					// 흰돌
					if (board[ys[cnt1] - 1][xs[cnt1] - 1] == '○' && board[ys[cnt1] - 1 + j][xs[cnt1] - 1 + j] == '○') {
						winCnt1++;
					} else {
						winCnt1 = 0;
					}
					if (winCnt1 == 4) {
						System.out.println(u1 + "님이 승리하셨습니다!");
						break out;
					}
					// 검은돌
					if (board[ys[cnt1] - 1][xs[cnt1] - 1] == '●' && board[ys[cnt1] - 1 + j][xs[cnt1] - 1 + j] == '●') {
						winCnt2++;
					} else {
						winCnt2 = 0;
					}
					if (winCnt2 == 4) {
						System.out.println(u2 + "님이 승리하셨습니다!");
						break out;
					}
				}
			}

			winCnt1 = 0;
			winCnt2 = 0;
			// 대각선 3방향 (↙)
			for (int cnt1 = 0; cnt1 < cnt; cnt1++) {
				for (int j = 1; j < 5; j++) {
					if (xs[cnt1] - 1 - j < 0 || ys[cnt1] - 1 + j > hei - 1) // 주어진
																			// 범위를
																			// 초과하면
																			// 안됨
						continue;
					// 흰돌
					if (board[ys[cnt1] - 1][xs[cnt1] - 1] == '○' && board[ys[cnt1] - 1 + j][xs[cnt1] - 1 - j] == '○') {
						winCnt1++;
					} else {
						winCnt1 = 0;
					}
					if (winCnt1 == 4) {
						System.out.println(u1 + "님이 승리하셨습니다!");
						break out;
					}
					// 검은돌
					if (board[ys[cnt1] - 1][xs[cnt1] - 1] == '●' && board[ys[cnt1] - 1 + j][xs[cnt1] - 1 - j] == '●') {
						winCnt2++;
					} else {
						winCnt2 = 0;
					}
					if (winCnt2 == 4) {
						System.out.println(u2 + "님이 승리하셨습니다!");
						break out;
					}
				}
			}

			winCnt1 = 0;
			winCnt2 = 0;
			// 대각선 4방향 (↖)
			for (int cnt1 = 0; cnt1 < cnt; cnt1++) {
				for (int j = 1; j < 5; j++) {
					if (xs[cnt1] - 1 - j < 0 || ys[cnt1] - 1 - j < 0) // 주어진
																		// 범위를
																		// 초과하면
																		// 안됨
						continue;
					// 흰돌
					if (board[ys[cnt1] - 1][xs[cnt1] - 1] == '○' && board[ys[cnt1] - 1 - j][xs[cnt1] - 1 - j] == '○') {
						winCnt1++;
					} else {
						winCnt1 = 0;
					}
					if (winCnt1 == 4) {
						System.out.println(u1 + "님이 승리하셨습니다!");
						break out;
					}
					// 검은돌
					if (board[ys[cnt1] - 1][xs[cnt1] - 1] == '●' && board[ys[cnt1] - 1 - j][xs[cnt1] - 1 - j] == '●') {
						winCnt2++;
					} else {
						winCnt2 = 0;
					}
					if (winCnt2 == 4) {
						System.out.println(u2 + "님이 승리하셨습니다!");
						break out;
					}
				}
			}
			// 돌이 화면에 다 채워졌을때
			if (cnt == hei * wid - 1) {
				System.out.println("무승부입니다!");
				break out;
			}
			
			cnt++;
			return cnt; 
		}

		return -1;
	}

	public int playOmok() {
		// 중복검사도 겹치는데..함수로만들까ㅏㅏㅏ 일단나즁에
		Scanner scan = new Scanner(System.in);
		int[] types = this.types;
		int ox =this. ox;
		int oy =this.oy;
		String u1 =this. u1;
		String u2 = this.u2;
		char[][] board =this.board;
		int[] xs =this.xs;
		int[] ys = this.ys;
		int wid =this.wid;
		int hei = this.hei;
		outt: while (true) {
			for (int i = 0; i < wid * hei; i++) {
				
				int cnt =this.cnt;
				types[cnt] = cnt;

				if (types[i] % 2 == 0) {

					System.out.print(u1 + "님 오목 두기 (x sp y) : ");
					ox = scan.nextInt();
					oy = scan.nextInt();

					// wid*hei 보다 큰 값을 입력할때 출력하는 메세지
					if (ox > wid || oy > hei) {
						System.out.printf("(%d , %d) 범위 안의 값을 입력하세요\n", wid, hei);
						i--;
						continue;
					}

					// 중복 검사
					if (board[oy - 1][ox - 1] == '○' || board[oy - 1][ox - 1] == '●') {
						System.out.println("선택한 자리에 이미 돌이 있습니다.");
						i--;
						continue;
					}
					xs[cnt] = ox;
					ys[cnt] = oy;
					board[ys[i] - 1][xs[i] - 1] = '○';

				} else {
					System.out.print(u2 + "님 오목 두기 (x sp y) : ");
					ox = scan.nextInt();
					oy = scan.nextInt();

					// wid*hei 보다 큰 값을 입력할때 출력하는 메세지
					if (ox > wid || oy > hei) {
						System.out.printf("(%d , %d) 범위 안의 값을 입력하세요\n", wid, hei);
						i--;
						continue;
					}

					// 중복 검사
					if (board[oy - 1][ox - 1] == '○' || board[oy - 1][ox - 1] == '●') {
						System.out.println("선택한 자리에 이미 돌이 있습니다.");
						i--;
						continue;
					}
					xs[cnt] = ox;
					ys[cnt] = oy;
					board[ys[i] - 1][xs[i] - 1] = '●';

				}
				printOmok();

				this.cnt=resultOmok();
			
				if (this.cnt == -1){

					break outt;
				}
			} //for문닫ㅎ
		}//while닫히
		return -1;
	} // play 함수끝남

	
	
}
