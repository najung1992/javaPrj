package Omokkkk.��ü����;

import java.util.Scanner;

public class OooProgram6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

	
		Omokdol omokd = new Omokdol();

		// ���ӽ��� , ������Է� (�������ѹ����Ҳ���)

		while (true) {
			// ������Է¿� ���� ��ġ�� ���� �α� ( �ߺ��˻�����)
			if (omokd.playOmok() == -1) {
				System.out.println("�ڰ��ӳ�!!!��");
				break;
			}
		}

	}

}
