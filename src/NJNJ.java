
public class NJNJ {

	public static void main(String[] args) {
		// �ֻ�����2���ؼ� ����ϰ� ���� 5�� ����
		//4�� Ȯ�ι��� 4��
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
