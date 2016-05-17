
public class OhYeah {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cnt=0;
		for(int i=0;i<26;i++){
			for(int j=0;j<=i;j++){
				if(cnt<26){
				System.out.printf("%c",'A'+cnt);
				cnt++;
				}
			}
			System.out.println();
			if(cnt==26)
				break;
		}
	}

}
