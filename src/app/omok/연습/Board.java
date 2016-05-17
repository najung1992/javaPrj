package app.omok.����;

public class Board {

	private int wid;
	private int hei;
	private char[][] buf;
	// private Stone[] stone;
	private Stone[] stones;
	private int current;
	private static boolean win = false;

	public int getWid() {
		return wid;
	}

	public void setWid(int wid) {
		this.wid = wid;
	}

	public int getHei() {
		return hei;
	}

	public void setHei(int hei) {
		this.hei = hei;
	}

	public char[][] getBuf() {
		return buf;
	}

	public void setBuf(char[][] buf) {
		this.buf = buf;
	}

	public Stone[] getStones() {
		return stones;
	}

	public void setStones(Stone[] stones) {
		this.stones = stones;
	}

	public Board() {
		wid = 10;
		hei = 10;
		buf = new char[hei][wid];
		// stone = new Stone[wid * hei];
		stones = new Stone[wid * hei];
		// initBoard();
		current = -1;

	}

	private void initBoard() {

		// �������ʱ�ȭ����
		for (int y = 0; y < hei; y++) {
			for (int x = 0; x < wid; x++)
				buf[y][x] = '��';
		}

		// �׵θ� �׸���
		for (int i = 0; i < wid; i++)
			buf[0][i] = '��';

		for (int i = 0; i < wid; i++)
			buf[hei - 1][i] = '��';

		for (int i = 0; i < hei; i++)
			buf[i][0] = '��';

		for (int i = 0; i < hei; i++)
			buf[i][wid - 1] = '��';

		buf[0][0] = '��';
		buf[0][wid - 1] = '��';
		buf[hei - 1][0] = '��';
		buf[hei - 1][wid - 1] = '��';

	}

	public void print() {
		initBoard();

		for (int i = 0; i < current + 1; i++)
			putStone(stones[i]);
		for (int y = 0; y < hei; y++) {
			for (int x = 0; x < wid; x++)
				System.out.printf("%c", buf[y][x]);
			System.out.println();
		}

	}

	public void putStone(Stone stone) {
		// int type = stone.getType();
		// if (type% 2 == 0)
		// buf[stone.getY() - 1][stone.getX() - 1] = '��';
		// else
		// buf[stone.getY() - 1][stone.getX() - 1] = '��';

		buf[stone.getY() - 1][stone.getX() - 1] = stone.getType() == 1 ? '��' : '��';
	}

	public void add(Stone stone) {

		// Stone stone = new Stone();
		// stone.input();

		stones[++current] = stone;
		stone.turn();
		// putStone(stone);

	}

	public boolean check(Stone stone) {

		for (int i = 0; i < current + 1; i++)
			if (stones[i].getY() == stone.getY() && stones[i].getX() == stone.getX())
				return true;

		return false;

	}

	public boolean win() {
		// ���а˻�
		int win1 = 0;
		int win2 = 0;
		if(current==-1)
			return false;
		out: while (true) {

			for (int i = 0; i < current+1; i++) {
				for (int j = 1; j < 5; j++) {
					if (stones[i].getX() - 1 + j > wid - 1) // �־��� ������ �ʰ��ϸ� �ȵ�
						continue;
					// ��
					if (buf[stones[i].getY() - 1][stones[i].getX() - 1] == '��'
							&& buf[stones[i].getY() - 1][stones[i].getX() - 1 + j] == '��') {
						win1++;
					} else {
						win1 = 0;
					}
					if (win1 == 4) {
						// System.out.println(u1 + "���� �¸��ϼ̽��ϴ�!");
						return true;
					}
					// ������
					if (buf[stones[i].getY() - 1][stones[i].getX() - 1] == '��'
							&& buf[stones[i].getY() - 1][stones[i].getX() - 1 + j] == '��') {
						win2++;
					} else {
						win2 = 0;
					}
					if (win2 == 4) {
						// System.out.println(u2 + "���� �¸��ϼ̽��ϴ�!");
						return true;
					}
				}
			}
			
//			winCnt1 = 0;
//			winCnt2 = 0;
			
		}

		

	}

}
