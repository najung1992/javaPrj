import java.util.Scanner;

public class Threesum {

	public static void main(String[] args) {
		// 1~n���� �� 3�� ����� ��
		//4�� Ȯ�ι��� 3��

	
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int n;
		
		while(true){
			
		System.out.println("<n������ ���� ���� 3�� ����� ��>");
		System.out.print("n�� �Է��ϼ���:");
		n= scan.nextInt();
		for (int i = 1; i <=n/3; i++)
		{
			sum += (i * 3);
		}
		System.out.println("3�� ����� ��:" + sum);
		
		}
	}

}
