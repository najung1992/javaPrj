import java.util.Random;

public class Lotto3 {

	public static void main(String[] args) {
		// 랄랄 나정쨩의 로또번호

		Random rand = new Random();
		int[] lotto = new int[6];
		int bonus = 0;

		
		// 중복검사!!!
		out: while (true) {
			
			for (int i = 0; i < 6; i++)
				lotto[i] = rand.nextInt(45) + 1;
			
			for (int i = 0; i < 6; i++) {
				for (int j = i + 1; j < 6; j++) {
					if (lotto[i] == lotto[j])
						continue out;
					}
			}
			break;
		}


		// 번호출력1
		for (int i = 0; i < 6; i++)
			System.out.printf("%d  ", lotto[i]);
		System.out.println();

		// 정렬하기

		int a;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				if (lotto[j] > lotto[j + 1]) {
					a = lotto[j];
					lotto[j] = lotto[j + 1];
					lotto[j + 1] = a;
				}
			}
		}

		// 번호출력2
		for (int i = 0; i < 6; i++)
			System.out.printf("%d  ", lotto[i]);

	}

}
