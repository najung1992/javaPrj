import java.util.Scanner;

public class Exammmm {

	public static void main(String[] args) {
		// ��ǥ��

		Scanner scan = new Scanner(System.in);
		int n,num,num2;
		int nj=0;
		int ny=0;
		int no=0;
		
		System .out.println("< ��ǥ�ϱ� >\n");
		System .out.print("��ǥ�� �ο����� �Է��ϼ���: ");
		n = scan.nextInt();
			
		out: while(true){
			
			for(int i=0;i<n;i++){
				nj=0; ny=0; no=0; //������ǥ��� �ʱ�ȭ
				System .out.println("����ǥ�� ");
				System .out.println("1. �質��  2. �質��  3. ��� ");
				System .out.print("����: ");
				num=scan.nextInt();
				
				if(num==1)
					nj += 1;
				else if(num==2)
					ny += 1;
				else
					no += 1;
							}
			System .out.println("��ǥ�� ����Ǿ����ϴ�.");
			
			System .out.println("��ǥ ���");
			System .out.printf("1. �質��:%dǥ \n",nj);
			System .out.printf("2. �質��:%dǥ \n",ny);
			System .out.printf("3. ���/��ȿǥ:%dǥ\n\n ",no);
			if(nj>ny){
				System .out.print("�質���� �缱�Ǿ����ϴ�!");
				break;
			}
			else if(nj<ny){
				System .out.print("�質���� �缱�Ǿ����ϴ�!");
				break;
			}
			else{
				System .out.print("�����Դϴ�.����ǥ�Ͻðڽ��ϱ�?");
				System .out.print("1.����ǥ  2.����");
				num2=scan.nextInt();
				if(num2==1)
					continue out;
				else{
					System.out.println("�����մϴ�");
					break;
				}
					
				}	
			
			}
			
		}	

}
