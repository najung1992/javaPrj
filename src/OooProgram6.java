import java.util.Scanner;

public class OooProgram6 {
	// ����ȭ�ؼ� ����
	// ������ Omok�ȿ� ĸ��ȣ��~
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		
		// �����ǹ迭����
		Omok omok = new Omok();
		int wid = 10;
		int hei = 10;
		omok.wid = wid;
		omok.hei = hei;
		omok.board = new char[hei][wid];
		omok.cnt = 0;
		omok.xs = new int[wid * hei];
		omok.ys = new int[wid * hei];
		omok.types = new int[wid * hei];

		// ������ �׸��� ( �ʱ�ȭ,�׵θ� )
		omok.drawOmok();
		// ���ӽ��� , ������Է� (�������ѹ����Ҳ���)
		System.out.println("���ܦ�����������������");
		System.out.println("��      �����̲�!         ��  ");
		System.out.println("��          ���� ����     �� ");
		System.out.println("�������������������ܦ�");
		// ����� �Է� �ޱ�
		System.out.println("ù��° ����ڸ� �Է��ϼ���:");
		omok.u1 = scan.nextLine();
		System.out.println("�ι�° ����ڸ� �Է��ϼ���:");
		omok.u2 = scan.nextLine();
		System.out.printf("\n\n��%s�԰� %s���� ����� �����մϴ�!��\n", omok.u1, omok.u2);
		out: while (true) {

			omok.printOmok();
			// ������Է¿� ���� ��ġ�� ���� �α� ( �ߺ��˻�����)
			if (omok.playOmok() == -1) {
				System.out.println("�ڰ��ӳ�!!!��");
				break out;
			}
		}
	}

}
