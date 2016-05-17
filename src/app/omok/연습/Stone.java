package app.omok.연습;

import java.util.Scanner;

public class Stone {
	private int x;
	private int y;
	private int type;
	private static boolean White = false;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Stone() {
		x = -1;
		y = -1;
		type = 1; // 검은돌멩이~
	}

	public void turn(){
		
		White = !White;
		}
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print(" 오목 두기 (x sp y) : ");
		x = scan.nextInt();
		y = scan.nextInt();
		type = White ? 2 : 1;
//		White = !White;
	}

	public void put(char[][] buf) {

		buf[y - 1][x - 1] = type == 1 ? '●' : '○';

	}

	public static boolean getWhite() {
		return White;
	}

	public static void setWhite(boolean white) {
		White = white;
	}

}
