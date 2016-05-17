import java.util.Scanner;

public class OooProgram3 {

	public static void main(String[] args) {
		// 戚暗 刃失背神澗暗 引薦..ばば
		// 脊径閤焼辞 馬澗暗稽~.~

		Scanner scan = new Scanner(System.in);
		
		int wid = 20;
		int hei = 20;
		// 神鯉毒 壕伸 持失
		char[][] board = new char[hei][wid];

		int[] xs = new int[wid*hei];
		int[] ys = new int[wid*hei];
		int[] types = new int[wid*hei];
		int cnt = 0;

		// 神鯉毒 段奄鉢
		for (int y = 0; y < hei; y++) {
			for (int x = 0; x < wid; x++)
				board[y][x] = 'Λ';
		}

		// 砺砧軒 益軒奄
		for (int i = 0; i < wid; i++)
			board[0][i] = 'Θ';

		for (int i = 0; i < wid; i++)
			board[hei - 1][i] = 'Κ';

		for (int i = 0; i < hei; i++)
			board[i][0] = 'Η';

		for (int i = 0; i < hei; i++)
			board[i][wid - 1] = 'Ι';

		board[0][0] = 'Γ';
		board[0][wid - 1] = 'Δ';
		board[hei - 1][0] = 'Ζ';
		board[hei - 1][wid - 1] = 'Ε'; // ばばばばばばばばばば

		System.out.println("Γ＋ΑΑΑΑΑΑΑΑΔ");
		System.out.println("】      蟹舛戚襖!         Β  ");
		System.out.println("Β          神鯉 惟績     】 ");
		System.out.println("ΖΑΑΑΑΑΑΑΑ＋Ε");

		// int menu;
		// System.out.print("惟績獣拙精 1聖 刊牽室遂: ");
		// menu = scan.nextInt();
		String u1, u2;

		System.out.println("1腰 紫遂切研 脊径馬室推:");
		u1 = scan.nextLine();
		System.out.println("2腰 紫遂切研 脊径馬室推:");
		u2 = scan.nextLine();
		System.out.printf("\n\n【%s還引 %s還税 企衣聖 獣拙杯艦雁!【\n", u1, u2);

		for (int y = 0; y < hei; y++) {
			for (int x = 0; x < wid; x++)
				System.out.printf("%c", board[y][x]);
			System.out.println();
		}

		while (true) {
			// 紫遂切 脊径聖 閤澗 稽送
			int ox;
			int oy;
			//int otype;
			//otype = 1;
			

			System.out.print("神鯉 砧奄 (x sp y) : ");
			ox = scan.nextInt();
			oy = scan.nextInt();

 			xs[cnt] = ox;
			ys[cnt] = oy;
			types[cnt] = cnt;
			cnt++;

			// 紫遂切 脊径拭 企廃 是帖拭 神鯉聖 砧澗 稽送
			for (int i = 0; i < cnt; i++)
				// 0拭辞 1戚鞠檎 沖精事生稽郊会けけ2蟹刊檎 0
				if(types[i]%2==0)
					board[ys[i]-1][xs[i]-1] = '】';  //1.1脊径閤生檎 0.0拭啄毘しし
				else
					board[ys[i]-1][xs[i]-1] = '＋';

			// 神鯉毒 窒径
			for (int y = 0; y < hei; y++) {
				for (int x = 0; x < wid; x++)
					System.out.printf("%c", board[y][x]);
				System.out.println();
			}
		}
	}

}
