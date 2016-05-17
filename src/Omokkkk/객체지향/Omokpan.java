package Omokkkk.��ü����;

import java.util.Scanner;

public class Omokpan { // Exam console

	int wid;
	int hei;
	char[][] board;

	public Omokpan() {
		wid = 10;
		hei = 10;
		board = new char[hei][wid];
	}

	public void drawOmok() {

		for (int y = 0; y < hei; y++) {
			for (int x = 0; x < wid; x++)
				board[y][x] = '��';
		}

		// �׵θ� �׸���
		for (int i = 0; i < wid; i++)
			board[0][i] = '��';

		for (int i = 0; i < wid; i++)
			board[hei - 1][i] = '��';

		for (int i = 0; i < hei; i++)
			board[i][0] = '��';

		for (int i = 0; i < hei; i++)
			board[i][wid - 1] = '��';

		board[0][0] = '��';
		board[0][wid - 1] = '��';
		board[hei - 1][0] = '��';
		board[hei - 1][wid - 1] = '��';

	}

	public void printOmok() {
		// ������ ���
		for (int y = 0; y < hei; y++) {
			for (int x = 0; x < wid; x++)
				System.out.printf("%c", board[y][x]);
			System.out.println();
		}
	}

}
