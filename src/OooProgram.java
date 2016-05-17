import java.util.Scanner;

public class OooProgram {

	public static void main(String[] args) {
		// 오목
		
		Scanner scan = new Scanner(System.in);
		int X,Y; //흰색
		System.out.print("오목 좌표를 입력하세염 (X , Y):");
		X=scan.nextInt();
		Y=scan.nextInt();
		
		for(int y=0;y<20;y++){
			for(int x=0;x<20;x++){
				if(x==X && y==Y)
					System.out.printf("%c", '○');				
				else if(x==0 && y==0)
					System.out.printf("%c", '┌');
				else if(x==19 && y==0)
					System.out.printf("%c", '┐');
				else if(x==0 && y==19)
					System.out.printf("%c", '└');
				else if(x==19 && y==19)
					System.out.printf("%c", '┘'); //모서리먼저해죠야댐ㅎㅎㅎㅎ
				else if(x==0) 
					System.out.printf("%c", '├');
				else if(y==0)
					System.out.printf("%c", '┬');
				else if(x==19)
					System.out.printf("%c", '┤');
				else if(y==19)
					System.out.printf("%c", '┴');
				else
					System.out.printf("%c", '┼');
			}
			System.out.println();
		}

	}

}
