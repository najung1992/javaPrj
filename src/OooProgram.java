import java.util.Scanner;

public class OooProgram {

	public static void main(String[] args) {
		// ����
		
		Scanner scan = new Scanner(System.in);
		int X,Y; //���
		System.out.print("���� ��ǥ�� �Է��ϼ��� (X , Y):");
		X=scan.nextInt();
		Y=scan.nextInt();
		
		for(int y=0;y<20;y++){
			for(int x=0;x<20;x++){
				if(x==X && y==Y)
					System.out.printf("%c", '��');				
				else if(x==0 && y==0)
					System.out.printf("%c", '��');
				else if(x==19 && y==0)
					System.out.printf("%c", '��');
				else if(x==0 && y==19)
					System.out.printf("%c", '��');
				else if(x==19 && y==19)
					System.out.printf("%c", '��'); //�𼭸��������Ҿߴ菉������
				else if(x==0) 
					System.out.printf("%c", '��');
				else if(y==0)
					System.out.printf("%c", '��');
				else if(x==19)
					System.out.printf("%c", '��');
				else if(y==19)
					System.out.printf("%c", '��');
				else
					System.out.printf("%c", '��');
			}
			System.out.println();
		}

	}

}
