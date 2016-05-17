import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// 3,10,17,24,31.. 등차수열 합

		Scanner scan = new Scanner(System.in);
		System.out.println("몇번째 항까지 구할꺼니?");
		int n = scan.nextInt();
		
		an(n);
		sum(n);
		System.out.println(sum(n));
	}

	private static int sum(int n) {
		// TODO Auto-generated method stub
		if(n==1)
			return an(n);
		return sum(n-1) + an(n); 
	}

	private static int an(int n) {
		// TODO Auto-generated method stub
		return 3+(n-1)*7;  //수열 바꾸려면 여기바꿈댐 초항이랑 공ㅊㅏ~gongcha~~~~버블티맨 
	}

}
