import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// 3,10,17,24,31.. �������� ��

		Scanner scan = new Scanner(System.in);
		System.out.println("���° �ױ��� ���Ҳ���?");
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
		return 3+(n-1)*7;  //���� �ٲٷ��� ����ٲ޴� �����̶� ������~gongcha~~~~����Ƽ�� 
	}

}
