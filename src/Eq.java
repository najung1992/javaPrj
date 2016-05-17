
public class Eq {

	public static void main(String[] args) {
		// 4x+5y=60 해 구하기 ( x,y<=10)

		int x,y;	
		while(true){	
			x=(int)(Math.random()*10+1);
			y=(int)(Math.random()*10+1);
			if(4*x+5*y==60){
				System.out.printf("(x,y)=(%d,%d)",x,y);
			break;
			}
			else
				continue;
		}	
		
	}

}
