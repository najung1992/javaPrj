import java.util.Scanner;

public class OooProgram2 {

	public static void main(String[] args) {
	

		int wid=20;
		int hei=20;
		// ������ �迭 ����
		char[] board = new char[wid * hei];
		
		//������ �ʱ�ȭ
		for(int i=0;i<400;i++)
			board[i]='��';
		
		//��ǥ�� �̿��� ����α� �Ǵ� �׵θ� �׸���
		board[wid*0 + 0]='��';
		board[wid*0 + 19]='��'; 
		board[wid*19 + 0]='��'; 
		board[wid*19 + 19]='��'; 
	
		board[wid*5 + 2]='��'; //wid*(y-1) + (x-1)
			
		//������ ���
		for(int y=0;y<hei;y++){
			for(int x=0;x<wid;x++)
				System.out.printf("%c",board[x+y*hei]); //? ???????
			System.out.println();
		}
		
	}

}
