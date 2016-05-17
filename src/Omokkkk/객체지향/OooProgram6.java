package Omokkkk.객체지향;

import java.util.Scanner;

public class OooProgram6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

	
		Omokdol omokd = new Omokdol();

		// 게임시작 , 사용자입력 (어차피한번만할꾸임)

		while (true) {
			// 사용자입력에 대한 위치에 오목 두기 ( 중복검사포함)
			if (omokd.playOmok() == -1) {
				System.out.println("★게임끝!!!★");
				break;
			}
		}

	}

}
