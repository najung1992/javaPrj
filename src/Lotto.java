import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		// 랄랄 나정쨩의 로또번호

		Scanner scan = new Scanner(System.in);
	
		int a,b,c,d,e,f,g;
		int nj;

		System.out.print("회차를 입력하세요:");
		nj = scan.nextInt();
		System.out.println("┌────────────────────┐");
		System.out.printf("│ 나눔로또 제 %d회차 당첨번호  │\n",nj);//연습함
		System.out.println("└────────────────────┘\n");		
		
		//이거안해도 next얜되고 nextLine는왜안되냐고
		//nextInt≒next 같이되는건가여ㅕㅕ뭐즹 
		System.out.print("첫번째 숫자를 입력하세요:");
		a = scan.nextInt();
		System.out.printf("두구두구!! 첫번째 숫자는! ★ %d ★\n\n", a);
		System.out.print("두번째 숫자를 입력하세요:");
		b = scan.nextInt();
		System.out.printf("두번째 숫자는!!!!!! ★ %d ★\n\n", b);
		System.out.print("세번째 숫자를 입력하세요:");
		c = scan.nextInt();
		System.out.printf("세번째 숫자!!!!!!! ★ %d ★\n\n", c);
		System.out.print("네번째 숫자를 입력하세요:");
		d = scan.nextInt();
		System.out.printf("네번째 숫자!!!!!!!!! ★ %d ★\n\n", d);
		System.out.print("다섯번째 숫자를 입력하세요:");
		e = scan.nextInt();
		System.out.printf("다섯번째 숫자입니당!!! ★ %d ★\n\n", e);
		System.out.print("여섯번째 숫자를 입력하세요:");
		f = scan.nextInt();
		System.out.printf("대망의 마지막 숫자는!!!!! ★ %d ★\n\n", f);
		System.out.print("보너스 숫자를 입력하세요:");
		g = scan.nextInt();
		System.out.printf("보너스 숫자 입니다~~~~ ★ %d ★\n\n", g);
		// \n두번쓰면 두줄엔터 세개쓰면 세개겠지
		System.out.println("★★★★★★★★★★★★★★★★★");
		System.out.printf("★ %s %s %s %s %s %s + %d ★\n", a,b,c,d,e,f,g );
		System.out.println("★★★★★★★★★★★★★★★★★");

	}

}
