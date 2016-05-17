import java.util.Scanner;

public class OooProgram3 {

	public static void main(String[] args) {
		// 이거 완성해오는거 과제..ㅠㅠ
		// 입력받아서 하는거로~.~

		Scanner scan = new Scanner(System.in);
		
		int wid = 20;
		int hei = 20;
		// 오목판 배열 생성
		char[][] board = new char[hei][wid];

		int[] xs = new int[wid*hei];
		int[] ys = new int[wid*hei];
		int[] types = new int[wid*hei];
		int cnt = 0;

		// 오목판 초기화
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
		board[hei - 1][wid - 1] = '┘'; // ㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠ

		System.out.println("┌●────────┐");
		System.out.println("○      나정이꺼!         │  ");
		System.out.println("│          오목 게임     ○ ");
		System.out.println("└────────●┘");

		// int menu;
		// System.out.print("게임시작은 1을 누르세용: ");
		// menu = scan.nextInt();
		String u1, u2;

		System.out.println("1번 사용자를 입력하세요:");
		u1 = scan.nextLine();
		System.out.println("2번 사용자를 입력하세요:");
		u2 = scan.nextLine();
		System.out.printf("\n\n★%s님과 %s님의 대결을 시작합니당!★\n", u1, u2);

		for (int y = 0; y < hei; y++) {
			for (int x = 0; x < wid; x++)
				System.out.printf("%c", board[y][x]);
			System.out.println();
		}

		while (true) {
			// 사용자 입력을 받는 로직
			int ox;
			int oy;
			//int otype;
			//otype = 1;
			

			System.out.print("오목 두기 (x sp y) : ");
			ox = scan.nextInt();
			oy = scan.nextInt();

 			xs[cnt] = ox;
			ys[cnt] = oy;
			types[cnt] = cnt;
			cnt++;

			// 사용자 입력에 대한 위치에 오목을 두는 로직
			for (int i = 0; i < cnt; i++)
				// 0에서 1이되면 껌은색으로바뀜ㅁㅁ2나누면 0
				if(types[i]%2==0)
					board[ys[i]-1][xs[i]-1] = '○';  //1.1입력받으면 0.0에찍힘ㅇㅇ
				else
					board[ys[i]-1][xs[i]-1] = '●';

			// 오목판 출력
			for (int y = 0; y < hei; y++) {
				for (int x = 0; x < wid; x++)
					System.out.printf("%c", board[y][x]);
				System.out.println();
			}
		}
	}

}
