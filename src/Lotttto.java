
public class Lotttto {
	//로또중복안되게뽑는거
	public static void main(String[] args) {
		
		int a,b,c,d,e,f,g; 
		int nj=486;
		
		a=(int)(Math.random()*45+1);
		b=(int)(Math.random()*45+1);
		c=(int)(Math.random()*45+1);
		d=(int)(Math.random()*45+1);
		e=(int)(Math.random()*45+1);
		f=(int)(Math.random()*45+1);
		g=(int)(Math.random()*45+1);
		
		System.out.println("┌────────────────────┐");
		System.out.printf("│ 나눔로또 제 %d회차 당첨번호  │\n",nj);
		System.out.println("└────────────────────┘\n");
	
		while(true){
		if(a!=b && a!=c && a!=d && a!=e && a!=f && a!=g && b!=c && b!=d && b!=e && b!=f && b!=g && c!=d && c!=e && c!=f && c!=g && d!=e && d!=f && d!=g && e!=f && e!=g && f!=g ){
		
			System.out.printf("두구두구!! 첫번째 숫자는! ★ %d ★\n", a);
			System.out.printf("두번째 숫자는!!!!!! ★ %d ★\n", b);			
		    System.out.printf("세번째 숫자!!!!!!! ★ %d ★\n", c);			
			System.out.printf("네번째 숫자!!!!!!!!! ★ %d ★\n", d);
			System.out.printf("다섯번째 숫자입니당!!! ★ %d ★\n", e);
			System.out.printf("대망의 마지막 숫자는!!!!! ★ %d ★\n\n", f);
			System.out.printf("보너스 숫자 입니다~~~~ ★ %d ★\n\n", g);
			System.out.println("★★★★★★★★★★★★★★★★★★");
			System.out.printf("  %d %d %d %d %d %d + %d \n", a,b,c,d,e,f,g );
			System.out.println("★★★★★★★★★★★★★★★★★★");
			break;}
		else{
			a=(int)(Math.random()*45+1);
			b=(int)(Math.random()*45+1);
			c=(int)(Math.random()*45+1);
			d=(int)(Math.random()*45+1);
			e=(int)(Math.random()*45+1);
			f=(int)(Math.random()*45+1);
			g=(int)(Math.random()*45+1);
		
	}
	
		}
	}
}

				
		



	


