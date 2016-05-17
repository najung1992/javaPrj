import java.util.Scanner;

public class OooProgram6 {
	// 구조화해서 제출
	// 나머지 Omok안에 캡슐호ㅏ~
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		
		// 오목판배열생성
		Omok omok = new Omok();
		int wid = 10;
		int hei = 10;
		omok.wid = wid;
		omok.hei = hei;
		omok.board = new char[hei][wid];
		omok.cnt = 0;
		omok.xs = new int[wid * hei];
		omok.ys = new int[wid * hei];
		omok.types = new int[wid * hei];

		// 오목판 그리기 ( 초기화,테두리 )
		omok.drawOmok();
		// 게임시작 , 사용자입력 (어차피한번만할꾸임)
		System.out.println("┌●────────┐");
		System.out.println("○      나정이꺼!         │  ");
		System.out.println("│          오목 게임     ○ ");
		System.out.println("└────────●┘");
		// 사용자 입력 받기
		System.out.println("첫번째 사용자를 입력하세요:");
		omok.u1 = scan.nextLine();
		System.out.println("두번째 사용자를 입력하세요:");
		omok.u2 = scan.nextLine();
		System.out.printf("\n\n★%s님과 %s님의 대결을 시작합니당!★\n", omok.u1, omok.u2);
		out: while (true) {

			omok.printOmok();
			// 사용자입력에 대한 위치에 오목 두기 ( 중복검사포함)
			if (omok.playOmok() == -1) {
				System.out.println("★게임끝!!!★");
				break out;
			}
		}
	}

}
