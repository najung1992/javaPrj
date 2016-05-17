import java.util.Scanner;

public class OooProgram2 {

	public static void main(String[] args) {
	

		int wid=20;
		int hei=20;
		// 오목판 배열 생성
		char[] board = new char[wid * hei];
		
		//오목판 초기화
		for(int i=0;i<400;i++)
			board[i]='┼';
		
		//좌표를 이용한 오목두기 또는 테두리 그리기
		board[wid*0 + 0]='┌';
		board[wid*0 + 19]='┐'; 
		board[wid*19 + 0]='└'; 
		board[wid*19 + 19]='┘'; 
	
		board[wid*5 + 2]='○'; //wid*(y-1) + (x-1)
			
		//오목판 출력
		for(int y=0;y<hei;y++){
			for(int x=0;x<wid;x++)
				System.out.printf("%c",board[x+y*hei]); //? ???????
			System.out.println();
		}
		
	}

}
