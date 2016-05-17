
public class AlphabetProgram {

	public static void main(String[] args) {
		// a~z
		
		int cnt = 'Z'-'A'+1;
		
		/*for(int i=0;i<cnt;i++)
			System.out.printf("%c",'A'+i); ->A~Z
		for(int i=0;i<cnt;i++)
			System.out.printf("%c",'Z'-i); ->Z~A*/
		
		/*cnt *= 2;
		for(int i=0;i<cnt;i++)
			System.out.printf("%c",'A'+i%26); */
		
		cnt *= 2;
		for(int i=0;i<cnt;i++)
			System.out.printf("%c",i<26 ? 'A'+(i%26) : 'Z'-(i%26)); 
		
		}
}
