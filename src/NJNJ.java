
public class NJNJ {

	public static void main(String[] args) {
		// 주사위눈2개해서 출력하고 합이 5면 멈츔
		//4장 확인문제 4번
		int a, b;

		while (true) {
			a = (int) (Math.random() * 6 + 1);
			b = (int) (Math.random() * 6 + 1);

			System.out.println("(" + a + "," + b + ")");
			if (a + b == 5) {
				break;
			}
		}
		a = (int) (Math.random() * 6 + 1);
		b = (int) (Math.random() * 6 + 1);
	}

}
