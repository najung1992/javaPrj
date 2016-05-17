import java.util.Scanner;

public class Threesum {

	public static void main(String[] args) {
		// 1~n정수 중 3의 배수의 합
		//4장 확인문제 3번

	
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int n;
		
		while(true){
			
		System.out.println("<n까지의 정수 중의 3의 배수의 합>");
		System.out.print("n을 입력하세요:");
		n= scan.nextInt();
		for (int i = 1; i <=n/3; i++)
		{
			sum += (i * 3);
		}
		System.out.println("3의 배수의 합:" + sum);
		
		}
	}

}
