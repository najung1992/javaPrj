
public class StarProgram {

	public static void main(String[] args) {
		// �����! 

		/*
		 * int n=0; for (int i = 0; i < 20; i++) if (i+1==3*n+2){//
		 * System.out.print("��"); n++; } else System.out.print("��");
		 */

		for (int y = 0; y <= 10; y++) {//
			for (int x = 0; x <= 10; x++) {
				if (y<=-x+10 && y<=x)
					System.out.print("��");
				else
					System.out.print("��");
			}
			System.out.println();
		}
	}
}
